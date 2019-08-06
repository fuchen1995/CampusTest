package com.t360;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 测试数量
		int n = Integer.parseInt(bf.readLine());

		int[] arrs = new int[4];
		int[] all = new int[n];

		for (int i = 0; i < n; i++) {
			String[] strs = bf.readLine().split(" ");
			for (int j = 0; j < 4; j++) {
				arrs[j] = Integer.parseInt(strs[j]);
			}

			// 计算方法
			all[i] = function(arrs);
		}

		for (int i = 0; i < n; i++) {
			System.out.println(all[i]);
		}

	}

	private static int function(int[] arrs) {
		// TODO Auto-generated method stub
		int a = arrs[0];
		int b = arrs[1];
		int c = arrs[2];
		int d = arrs[3];
		// 单人剩余
		int i = 0;
		// 双人剩余
		int j = 0;

		int sum = d;

		if (a >= c) {
			sum += c;

			i = a - c;

		} else {
			sum += a;
		}

		if ((2 * b + i) / 4 >= 0) {
			sum += (2 * b + i) / 4;
		} else {
			sum += 0;
		}

		return sum;
	}

}
