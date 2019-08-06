package com.trend;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();

		String s = str.substring(1, str.length() - 1);

		String[] s1 = s.split(",");
		int[] nums = new int[s1.length];
		int len = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(s1[i]);
		}
		int k = Integer.parseInt(bf.readLine());

		int flag = len / k;

		if (flag == 0) {
			print(nums);
		} else {
			reverse(nums, k, flag);
			print(nums);
		}
	}

	private static void reverse(int[] nums, int k, int flag) {
		// TODO Auto-generated method stub

		int start = 0;
		int end = 0;
		for (int i = 0; i < flag; i++) {
			start = 0 + i * k;
			end = (i + 1) * k - 1;
			int mid = k / 2;

			for (int j = 0; j < mid; j++) {
				int temp = nums[start + j];
				nums[start + j] = nums[end - j];
				nums[end - j] = temp;
			}
		}
	}

	private static void print(int[] nums) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		for (int i : nums) {
			sb.append(i + ",");
		}
		sb.append("]");
		sb.deleteCharAt(sb.length() - 2);
		System.out.println(sb);
	}

}
