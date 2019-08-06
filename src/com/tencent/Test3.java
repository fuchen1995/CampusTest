package com.tencent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ×Ö·û¸öÊý
		String[] str1 = bf.readLine().split(" ");
		int aim = Integer.parseInt(str1[0]);

		int n = Integer.parseInt(str1[1]);

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		int[][] dp = new int[n][aim + 1];
		int max = Integer.MAX_VALUE;

		for (int j = 1; j <= aim; j++) {
			dp[0][j] = max;
			if (j - arr[0] >= 0 && dp[0][j - arr[0]] != max) {
				dp[0][j] = dp[0][j - arr[0]] + 1;
			}
		}
		int left = 0;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= aim; j++) {
				left = max;
				if (j - arr[i] >= 0 && dp[i][j - arr[i]] != max) {
					left = dp[i][j - arr[i]] + 1;
				}
				dp[i][j] = Math.min(left, dp[i - 1][j]);
			}
		}

		int kk = dp[3][0];
		for (int i = 1; i < n; i++) {
			if (dp[3][i] > kk) {
				kk = dp[3][i];
			}
		}
		System.out.println(kk);
	}
}
