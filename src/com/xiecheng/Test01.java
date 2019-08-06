package com.xiecheng;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// ÊäÈëµÄ×Ö·û´®
		String[] strs = bf.readLine().split(",");

		Set<String> myset = new HashSet<>();

		for (String s : strs) {
			if (myset.contains(s)) {
				System.out.println(true);
				return;
			} else {
				myset.add(s);
			}
		}
		System.out.println(false);

	}

}
