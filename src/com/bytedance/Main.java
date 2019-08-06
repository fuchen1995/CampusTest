package com.bytedance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[] nums = new int[n + 1];
		
		for (int i = 0; i <= n; i++) {
			if (i < 3) {
				nums[i] = 1;
			}
			if (3 <= i && i <= 7) {
				nums[i] = nums[i - 1] + nums[i - 2];
			}
			if (i > 7 && i <= 10) {
				nums[i] = nums[i - 1] + nums[i - 2] - nums[i - 7];
			}
			if (i == 11) {
				nums[i] = nums[i - 1] + nums[i - 2] - nums[i - 7] - 1;
			}
			if (i == 12) {
				nums[i] = nums[i - 1] + nums[i - 2] - nums[i - 7];
			}
			if (i > 12) {
				nums[i] = nums[i - 1] + nums[i - 2] - nums[i - 7] - nums[i - 10];
			}
		}
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
