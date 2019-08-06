package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	空格分隔的两个字符串，代表输入的两个大整数
	输出描述:
	输入的乘积，用字符串表示
	示例1
	输入
	72106547548473106236 982161082972751393
	输出
	70820244829634538040848656466105986748
 */
public class NumProduct {
	public static void main(String[] args) throws Exception {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ir);
		// 加载一行
		bf.readLine();
		String[] str = bf.readLine().split(" ");
		String a = str[0];
		String b = str[1];
		int La = a.length();
		int Lb = b.length();
		int[] na = new int[La];
		int[] nb = new int[Lb];
		int[] nc = new int[La + Lb];
		for (int i = 0; i < La; i++) {
			na[i] = (int) (a.charAt(La - i - 1) - '0');
		}
		for (int i = 0; i < Lb; i++) {
			nb[i] = (int) (b.charAt(Lb - i - 1) - '0');
		}
		for (int i = 0; i < La; i++) {
			for (int j = 0; j < Lb; j++) {
				nc[i + j] += na[i] * nb[j];
			}
		}
		for (int i = 0; i < La + Lb - 1; i++) {
			nc[i + 1] += nc[i] / 10;
			nc[i] %= 10;
		}
		StringBuilder sb = new StringBuilder("");
		if (nc[La + Lb - 1] != 0) {
			sb.append((char) (nc[La + Lb - 1] + '0'));
		}
		for (int i = La + Lb - 2; i >= 0; i--) {
			sb.append((char) (nc[i] + '0'));
		}
		System.out.println(sb.toString());
	}
}
