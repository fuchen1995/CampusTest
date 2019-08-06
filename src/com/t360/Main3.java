package com.t360;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		int[] nums = new int[N];

		String[] strs = bf.readLine().split(" ");
		for (int j = 0; j < N; j++) {
			nums[j] = Integer.parseInt(strs[j]);
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int now = function(i, nums);
			
			if (min > now) {
				min = now;
			}
		}

		System.out.println(min);

	}

	private static int function(int i, int[] nums) {
		int len = nums.length;
		int sum = 0;
		int j = i;

		for (int count = 1; count <= len; count++) {
			if (j == len) {
				j = 0;
			}
			sum += Math.abs(nums[j] - count);
			j++;
		}
		return sum;
	}

}
