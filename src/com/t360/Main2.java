package com.t360;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ²âÊÔÊıÁ¿
		String[] str1 = bf.readLine().split(" ");
		int N = Integer.parseInt(str1[0]);
		int M = Integer.parseInt(str1[1]);

		int[] nums = new int[N];

		String[] str2 = bf.readLine().split(" ");
		for (int j = 0; j < N; j++) {
			nums[j] = Integer.parseInt(str2[j]);
		}

		for (int i = 0; i < M; i++) {
			String[] str3 = bf.readLine().split(" ");
			int t = Integer.parseInt(str3[0]);
			int x = Integer.parseInt(str3[1]);

			function(t, x, nums);
		}

		for (int j = 0; j < N; j++) {
			System.out.print(nums[j] + " ");
		}

	}

	private static void function(int t, int x, int[] nums) {
		if (t == 1) {
			bubbleSort1(nums, x);
		} else {
			bubbleSort0(nums, x);
		}

	}

	public static void bubbleSort0(int[] array, int x) {

		for (int i = 0; i < x; i++)
			for (int j = 0; j < x - 1 - i; j++)
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
	}

	public static void bubbleSort1(int[] array, int x) {

		for (int i = 0; i < x; i++)
			for (int j = 0; j < x - 1 - i; j++)
				if (array[j + 1] > array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}

	}

}
