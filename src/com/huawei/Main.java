package com.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		int[][] point = new int[6][2];
		System.out.println(point);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		char[] strs = bf.readLine().toCharArray();
		point[0][0] = 0;
		point[0][1] = 0;
		for (int i = 1; i < 5; i++) {
			point[i][0] = strs[2 * i];
			point[i][1] = strs[2 * i + 1];
		}
		int[][] dis = new int[6][5];
		// 矩阵为各点之间的距离
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				dis[i][j] = function(point[i], point[j]);
			}

		}
		System.out.println(min(dis));
	}

	public static int min(int[][] array) {
		if (array == null || array.length < 1 || array[0].length < 1) {
			return 0;
		}
		int rows = array.length;
		int cols = array[0].length;
		int[][] dp = new int[rows][cols];
		dp[0][0] = array[0][0];
		for (int i = 1; i < rows; i++) {
			dp[i][0] = dp[i - 1][0] + array[i][0];
		}
		for (int j = 1; j < cols; j++) {
			dp[0][j] = dp[0][j - 1] + array[0][j];
		}
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + array[i][j];
			}
		}
		return dp[rows - 1][cols - 1];
	}

	public static int function(int[] arr, int[] arr2) {
		int a = arr[0] - arr2[0];
		int b = arr[1] - arr2[1];

		return Math.abs(a * a + b * b);

	}
}
