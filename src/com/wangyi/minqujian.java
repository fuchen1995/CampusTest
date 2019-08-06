package com.wangyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minqujian {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();

		// 数组长度
		int len = Integer.parseInt(str1);

		// 输入数组
		String[] strs = br.readLine().split(" ");
		int[] nums = new int[len];

		for (int i = 0; i < len; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		int count = 1;
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] + 1 == nums[i + 1]) {
				continue;
			} else {
				count++;
			}
		}
		System.out.println(count);

	}
}
