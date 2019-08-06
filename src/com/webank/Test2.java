package com.webank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test2 {
	static int count = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();

		String[] s1 = str.split(" ");

		int n = Integer.parseInt(s1[0]);
		int k = Integer.parseInt(s1[1]);
		int m = Integer.parseInt(s1[2]);

		System.out.println(war(m, n, k));

	}

	private static int war(int n, int k, int m) {
		// TODO Auto-generated method stub

		if (k > 0) {
			if (n != 0) {
				if (m >= n) {
					int ii = count;
					count = 0;
					return war((ii + 1) * m - n, k - 1, m) + 1;
				} else if (m < n) {
					count++;
					return war(n - m, k, m) + 1;
				}
			} else {
				return war(n, k - 1, m);
			}
		} else {
			return 0;
		}
		return 0;
	}
}
