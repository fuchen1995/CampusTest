package com.leetcode;

public class Day2 {

	public static int myAtoi(String str) {

		String strr = str.trim();
		String strrr = null;

		if (strr != null && strr.isEmpty() == false) {
			char f = strr.charAt(0);

			if (f >= '0' && f <= '9' || f == '+' || f == '-') {
				strrr = strr.substring(0, 1);

				for (int i = 1; i < strr.length(); i++) {
					if (strr.charAt(i) >= '0' && strr.charAt(i) <= '9') {
						strrr = strr.substring(0, i + 1);
					} else {
						break;
					}
				}
			}
		}
		if (strrr == null || strrr.equals("+") || strrr.equals("-")) {
			return 0;
		}
		int num = 0;

		try {
			num = Integer.parseInt(strrr);
		} catch (Exception e) {
			if (strrr.charAt(0) == '-')
				return Integer.MIN_VALUE;
			return Integer.MAX_VALUE;
		}
		return num;
	}

	public static int maxArea(int[] height) {

		int area = 0;
		int a = 0;
		int b = 0;
		for (int i = 0; i < height.length - 1; i++) {
			for (int j = i + 1; j < height.length; j++) {
				a = j - i;
				b = Math.min(height[i], height[j]);

				if (area < a * b) {
					area = a * b;
				}
			}
		}
		return area;
	}

	public static String intToRoman(int num) {

		StringBuilder sd = new StringBuilder();
		int cur = num;
		while (cur != 0) {
			if (cur >= 1000) {
				int i = cur / 1000;
				for (int j = 0; j < i; j++) {
					sd.append('M');
				}
				cur = cur % 1000;
			} else if (cur >= 400) {
				if ((cur / 900) >= 1) {
					sd.append("CM");
					cur = cur % 900;
				} else if (cur / 500 >= 1) {
					sd.append("D");
					cur = cur % 500;
				} else {
					sd.append("CD");
					cur = cur % 400;
				}
			} else if (cur >= 100) {
				int i = cur / 100;
				for (int j = 0; j < i; j++) {
					sd.append('C');
				}
				cur = cur % 100;
			} else if (cur >= 40) {
				if ((cur / 90) >= 1) {
					sd.append("XC");
					cur = cur % 90;
				} else if (cur / 50 >= 1) {
					sd.append("L");
					cur = cur % 50;
				} else {
					sd.append("XL");
					cur = cur % 40;
				}
			} else if (cur >= 10) {
				int i = cur / 10;
				for (int j = 0; j < i; j++) {
					sd.append('X');
				}
				cur = cur % 10;
			} else if (cur >= 4) {
				if ((cur / 9) >= 1) {
					sd.append("IX");
					cur = cur % 9;
				} else if (cur / 5 >= 1) {
					sd.append("V");
					cur = cur % 5;
				} else {
					sd.append("IV");
					cur = cur % 4;
				}
			} else if (cur >= 1) {
				int i = cur / 1;
				for (int j = 0; j < i; j++) {
					sd.append('I');
				}
				cur = cur % 1;
			}
		}
		return sd.toString();
	}

	public String intToRoman2(int num) {
		// 用数组定义字典
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		// 定义一个字符串
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < values.length; i++) {
			int a = num / values[i];
			if (a == 0)
				continue;
			for (int j = a; j > 0; j--)
				res.append(strs[i]);
			num -= (a * values[i]);
			if (num == 0)
				break;
		}
		return res.toString();

	}
}
