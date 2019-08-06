package com.yuewen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] nums = bf.readLine().split(" ");
		int m = Integer.parseInt(nums[0]);
		int n = Integer.parseInt(nums[1]);

		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			String[] ss = bf.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				dp[i][j] = Integer.parseInt(ss[j]);
			}
		}

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < m; i += 2) {
			for (int j = 1; j < n; j += 2) {
				if (map.containsKey(dp[i][j])) {
					map.put(dp[i][j], map.get(dp[i][j]) + 1);
				} else {
					map.put(dp[i][j], 1);
				}
				count++;
			}
		}
		for (int i = 1; i < m; i += 2) {
			for (int j = 0; j < n; j += 2) {
				if (map.containsKey(dp[i][j])) {
					map.put(dp[i][j], map.get(dp[i][j]) + 1);
				} else {
					map.put(dp[i][j], 1);
				}
				count++;
			}
		}
		int maxf = 0;
		int maxs = 0;
		int keyf = 0;
		int keys = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > maxf) {
				maxs = maxf;
				keys = keyf;
				maxf = map.get(key);
				keyf = key;
			} else if (map.get(key) > maxs) {
				maxs = map.get(key);
				keys = key;
			}
		}

		Map<Integer, Integer> mymap = new HashMap<>();

		for (int i = 0; i < m; i += 2) {
			for (int j = 0; j < n; j += 2) {
				if (mymap.containsKey(dp[i][j])) {
					mymap.put(dp[i][j], mymap.get(dp[i][j]) + 1);
				} else {
					mymap.put(dp[i][j], 1);
				}
			}
		}
		for (int i = 1; i < m; i += 2) {
			for (int j = 1; j < n; j += 2) {
				if (mymap.containsKey(dp[i][j])) {
					mymap.put(dp[i][j], mymap.get(dp[i][j]) + 1);
				} else {
					mymap.put(dp[i][j], 1);
				}
			}
		}
		int max = 0;
		int key = 0;
		for (int k : mymap.keySet()) {
			if (mymap.get(k) > max) {
				max = mymap.get(k);
				key = k;
			}
		}
		if(map.containsKey(key)) {
			if(max < map.get(key)) {
				System.out.println(count-map.get(key));
				return;
			}else {
				System.out.println(count);
			}
		}


	}

}
