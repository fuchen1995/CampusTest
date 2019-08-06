package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*������������������x��k,���Ƕ���repeat(x, k)Ϊ��x�ظ�дk���γɵ���,����repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
ţţ���ڸ���4������x1, k1, x2, k2, ����v1 = (x1, k1), v2 = (x2, k2),�������Ƚ�v1��v2�Ĵ�С��
��������:
�������һ��,һ������4��������x1, k1, x2, k2(1 �� x1,x2 �� 10^9, 1 �� k1,k2 �� 50),�Կո�ָ�
�������:
���v1С��v2���"Less",v1����v2���"Equal",v1����v2���"Greater".
ʾ��1
����
����
1010 3 101010 2
���
����
Equal*/
public class bijiao {

	public static void main(String[] args) throws Exception {
		int k = 5 / 2;
		System.out.println(k);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = bf.readLine().split(" ");
		// repeat����
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
			// �Ƚ���ͬ���ȵ��ַ�����Ӧ�����ֵĴ�С
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
