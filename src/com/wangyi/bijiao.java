package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
输入描述:
输入包括一行,一行中有4个正整数x1, k1, x2, k2(1 ≤ x1,x2 ≤ 10^9, 1 ≤ k1,k2 ≤ 50),以空格分割
输出描述:
如果v1小于v2输出"Less",v1等于v2输出"Equal",v1大于v2输出"Greater".
示例1
输入
复制
1010 3 101010 2
输出
复制
Equal*/
public class bijiao {

	public static void main(String[] args) throws Exception {
		int k = 5 / 2;
		System.out.println(k);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = bf.readLine().split(" ");
		// repeat次数
		int k1 = Integer.parseInt(strs[1]);
		int k2 = Integer.parseInt(strs[3]);

		System.out.println(sort(strs[0], k1, strs[2], k2));

	}

	private static String sort(String str1, int k1, String str2, int k2) {
		if (str1.length() * k1 > str2.length() * k2) {
			return "Greater";
		} else if (str1.length() * k1 < str2.length() * k2) {
			return "Less";
		} else {
			// 比较相同长度的字符串对应的数字的大小
			int count = k1 * k2;
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();

			int i = 0, j = 0;
			while (count-- != 0) {
				if (c1[i] == c2[j]) {
					i++;
					j++;
					if (j > c2.length - 1) {
						j = 0;
					}
					if (i > c1.length - 1) {
						i = 0;
					}
				} else if (c1[i] > c2[j]) {
					return "Greater";
				} else {
					return "Less";
				}
			}
			return "Equal";
		}
	}

}
