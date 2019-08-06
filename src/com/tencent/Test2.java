package com.tencent;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ×Ö·û¸öÊý
		int n = Integer.parseInt(bf.readLine());

		// ×Ö·û´®
		String[] dn = bf.readLine().split(" ");
		String[] pn = bf.readLine().split(" ");

		int[] d = new int[n];
		int[] p = new int[n];

		for (int i = 0; i < n; i++) {
			d[i] = Integer.parseInt(dn[i]);
			p[i] = Integer.parseInt(pn[i]);
		}

		int all_d = d[0];
		int all_p = p[0];
		for (int i = 1; i < n; i++) {

			if (all_d < d[i]) {
				all_d += d[i];
				all_p += p[i];
			}

		}
		System.out.println(all_p);

	}

}
