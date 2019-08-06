package com.wangyi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/*  
牛牛又从生物科研工作者那里获得一个任务,这次牛牛需要帮助科研工作者从DNA序列s中找出最短没有出现在DNA序列s中的DNA片段的长度。
例如:s = AGGTCTA
序列中包含了所有长度为1的('A','C','G','T')片段,但是长度为2的没有全部包含,例如序列中不包含"AA",所以输出2。
输入描述:
输入包括一个字符串s,字符串长度length(1 ≤ length ≤ 2000),其中只包含'A','C','G','T'这四种字符。
输出描述:
输出一个正整数,即最短没有出现在DNA序列s中的DNA片段的长度。
示例1
输入

AGGTCTA
输出

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
