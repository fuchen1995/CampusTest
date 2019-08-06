package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());

		String[] strs = br.readLine().split(" ");

		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}
		int max = Integer.MIN_VALUE;

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int temp = 0;
		for (int i = 0; i < len; i++) {
			max1 = nums[i];
			max2 = 0;
			for (int j = i + 1; j < len; j++) {
				// 查找最大值、次大值
				if (nums[j] >= max1) {
					int kk = max1;
					max1 = nums[j];
					max2 = kk;
				} else if (nums[j] >= max2) {
					max2 = nums[j];
				}
//				System.out.println("最大值：" + max1 + "次大值：" + max2);
				if ((max1 & max2) == 0) {
					temp = max1 ^ max2;
					if (temp > max) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);

	}
}
