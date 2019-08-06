package com.leetcode;

public class Day01 {

	public static void main(String[] args) {
		String s = "LEETCODEISHIRING";
		int numRows = 4;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {

		if(numRows == 1){
			return s;
		}
		
		// 中间行数
		int len = s.length();

		int zNums = 2 * numRows - 2;

		int n = len / zNums; // 有多少个 半Z
		int m = len % zNums;
		if (m <= numRows) {
			m = 1;
		} else {
			m = m % numRows + 1;
		}
		int col = numRows;
		int row = n * (numRows - 1) + m;
		// 构建一个矩阵
		char[][] mtrix = new char[col][row];

		char[] ss = s.toCharArray();
		int index = 0;

		int c = 0;
		int r = 0;

		boolean flag = false;
		while (index != ss.length) {
			if ( r % (numRows - 1) == 0) {
				if(flag == true){
					c = 0;
					flag = false;
				}
				mtrix[c][r] = ss[index++];
				c++;
				if (c == col) {
					flag = true;
					c = col - 1;
					r++;
					continue;
				}
			} else {
				mtrix[--c][r++] = ss[index++];
				flag = true;
			}

		}
		StringBuilder bd = new StringBuilder();
		for (char[] d : mtrix) {
			for (char d2 : d) {
				if (d2 != '\u0000') {
					bd.append(d2);
				}
			}
		}

		return bd.toString();
	}
}
