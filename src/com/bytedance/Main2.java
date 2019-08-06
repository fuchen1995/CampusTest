package com.bytedance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[] nums = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			
		}
//		System.out.println(nums[n]);
		for (int i : nums) {
			System.out.println(i);
		}

	}

}
