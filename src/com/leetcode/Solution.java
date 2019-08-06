package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; j++) {
	            if (map.containsKey(s.charAt(j))) {
	                i = map.get(s.charAt(j));
	            }
	            ans = Math.max(ans, j - i + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	

	private boolean uni(String s, int start, int end) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return false;
	}

	public static String longestPalindrome(String s) {
		if (s.length() < 2) {
			return s;
		}

		List<Integer> list = new ArrayList<>();
		char[] strs = s.toCharArray();
		int start = 0, end = 0;
		for (int i = 0; i < strs.length; i++) {
			int len1 = function(s, i, i); // 奇数长度
			int len2 = function(s, i, i + 1); // 偶数长度
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return s.substring(start, end + 1);
	}

	private static int function(String s, int left, int right) {

		int R = right;
		int L = left;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}

		return R - L - 1; // (R - 1) - (L + 1) + 1
	}

	public static void main(String[] args) {
		String s = "abba";
		System.out.println(lengthOfLongestSubstring(s));
	}
}