package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class chongfuStr {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] sts = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		HashSet<Character> charset = new HashSet<>();
		
		for (char c : sts) {
			if(!charset.contains(c)) {
				sb.append(c);
				charset.add(c);
			}
		}
		System.out.println(sb);
	}
}
