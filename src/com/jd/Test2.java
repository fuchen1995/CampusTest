package com.jd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	int value;
	Node next;

	public Node(int i) {
		this.value = i;
	}

}

public class Test2 {
	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int pre = 0;
		int cur = 0;

		Node[] nodes = new Node[n];
		for (int i = 1; i <= n; i++) {
			nodes[i] = new Node(i);
		}
		for (int i = 1; i <= n; i++) {
			String[] strs = bf.readLine().split(" ");
			pre = Integer.parseInt(strs[1]);
			cur = Integer.parseInt(strs[0]);
			nodes[pre].next = nodes[cur];
		}
		System.out.println(n-2);
	}

}
