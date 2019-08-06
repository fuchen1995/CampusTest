package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 输入的字符串个数
		String s1 = bf.readLine();
		int n = Integer.parseInt(s1);

		// 输入的字符串
		String s2 = bf.readLine();

		StringBuffer result = new StringBuffer();
		String[] strs = new String[n];
		// 切分次数
		for (int i = 0; i < n; i++) {
			int index = 9 * i;
			strs[i] = s2.substring(index, index + 9);
		}
		for (int j = 0; j < n; j++) {

			if (strs[j].charAt(0) == '0') {
				result.append(swap(strs[j].substring(1, 9))).append(" ");
			} else {
				result.append(strs[j].substring(1, 9)).append(" ");
			}
		}
		System.out.println(result.toString());
	}

	public static String swap(String str) {
		Stack<Character> st = new Stack<>();
		for (int j = 0; j < 8; j++) {
			st.push(str.charAt(j));
		}
		StringBuffer ss = new StringBuffer();
		while (!st.isEmpty()) {
			ss.append(st.pop());
		}
		return ss.toString();

	}
}
