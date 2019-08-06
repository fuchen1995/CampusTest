package com.jd;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int m = Integer.parseInt(bf.readLine());

		String[] str = new String[m];
		// ÊäÈëµÄ×Ö·û´®
		for (int i = 0; i < m; i++) {
			str[i] = bf.readLine();
		}
		String T = bf.readLine();
		for (int i = 0; i < m; i++) {
			int start = T.indexOf(str[i]);
			int end = 0;
			if (start != -1) {
				end = start + str[i].length();
			}
		}

	}

}
