package com.tencent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ×Ö·û¸öÊý
		int n = Integer.parseInt(bf.readLine());

		// ×Ö·û´®
		char[] strs = bf.readLine().toCharArray();

		List<Character> list = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			list.add(strs[i]);
		}

		int i = 0;
		int len = n;
		while (i <= len - 2) {
			if ((list.get(i) == '0' && list.get(i + 1) == '1') || (list.get(i) == '1' && list.get(i + 1) == '0')) {
				list.remove(i + 1);
				list.remove(i);
				len -= 2;
				if (i == 0) {
					i = 0;
				} else {
					i -= 1;
				}

			} else {
				i++;
			}
		}
		System.out.println(list.size());

	}

}
