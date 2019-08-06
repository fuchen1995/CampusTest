package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/*  
ţţ�ִ�������й�����������һ������,���ţţ��Ҫ�������й����ߴ�DNA����s���ҳ����û�г�����DNA����s�е�DNAƬ�εĳ��ȡ�
����:s = AGGTCTA
�����а��������г���Ϊ1��('A','C','G','T')Ƭ��,���ǳ���Ϊ2��û��ȫ������,���������в�����"AA",�������2��
��������:
�������һ���ַ���s,�ַ�������length(1 �� length �� 2000),����ֻ����'A','C','G','T'�������ַ���
�������:
���һ��������,�����û�г�����DNA����s�е�DNAƬ�εĳ��ȡ�
ʾ��1
����

AGGTCTA
���

2
 
 */
public class dna {

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();

		int len = str.length();
		for (int i = 1; i <= len; i++) {
			HashSet<String> substringSet = new HashSet<String>();
			for (int j = 0; j + i < len; j++) {
				substringSet.add(str.substring(i, j + i));
			}
			if( substringSet.size() < Math.pow( 4, i ) ) {
                System.out.println(i);
                break;
            }
		}
		System.out.println(0);

	}

}
