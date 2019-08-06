package com.trend;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ÊäÈëµÄ×Ö·û´®
		int N = Integer.parseInt(bf.readLine());
		String[] strs = bf.readLine().split(" ");
		int[] nums = new int[N];

		Map<Integer, Integer> mymap = new HashMap<>();

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		int[] sums = new int[(N * (N - 1) / 2)];
		int k = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				sums[k++] = nums[i] + nums[j];
			}
		}
		for (int i : sums) {
			if (mymap.containsKey(i)) {
				mymap.put(i, mymap.get(i) + 1);
			} else {
				mymap.put(i, 1);
			}
		}
		Stack<Integer> mystack = new Stack<>();
		int max = 0;
		for (Entry<Integer, Integer> entry : mymap.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				mystack.clear();
				mystack.push(entry.getKey());
			} else if (entry.getValue() == max) {
				mystack.push(entry.getKey());
			}
		}
		while (!mystack.isEmpty()) {
			System.out.println(mystack.pop());
		}
	}

}
