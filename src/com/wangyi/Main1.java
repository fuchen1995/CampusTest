package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] strs = br.readLine().toCharArray();
		char[] strs2 = new char[strs.length];
		int last = strs.length - 1;
		int first = 0;

		if (strs.length == 1 && strs[0] == 'G') {
			strs[0] = 'R';
			System.out.println(1);
		}
		int count = 0;
		while (first < last) {
			if (strs[first] != 'R') {
				strs2[first] = 'R';
			}else {
				strs2[first] = 'R';
			}
			if (strs[last] != 'G') {
				strs2[last] = 'G';
			}else {
				strs2[last] = 'G';
			}
			first++;
			last--;
		}
		System.out.println(strs2.toString());
		for (int i = 0; i < strs.length; i++) {
			if(strs[i]!=strs2[i]) {
				count++;
			}
		}
		System.out.println(count);

	}
}
