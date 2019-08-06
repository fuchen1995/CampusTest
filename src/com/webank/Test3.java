package com.webank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());

		String[] strs = bf.readLine().split(" ");

		int[] nums = new int[T];

		for (int i = 0; i < T; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		for (int i : nums) {
			System.out.println(findstep(i));
		}

	}

	private static int findstep(int i) {
		// TODO Auto-generated method stub
		if (i == 1) {
			return 0;
		}
		if (i % 2 == 0) {
			return findstep((i / 2)) + 1;
		}
		if (i % 2 != 0) {
			return findstep((3 * i + 1)) + 1;
		}
		return -1;
	}

}
