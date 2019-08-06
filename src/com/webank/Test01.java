package com.webank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
	public int value;
	public Node next;

	public Node(int data) {
		this.value = data;
	}
}

public class Test01 {

	public static void main(String[] args) throws Exception {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] strs = bf.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int M = Integer.parseInt(strs[1]);

        if(N ==1){
            System.out.println(1);
            System.out.println(1);
        }   
		
		Node head = new Node(1);
		Node pre = head;
		for (int i = 2; i <= N; i++) {
			Node cur = new Node(i);
			pre.next = cur;
			pre = cur;
		}
		pre.next = head;

		outM(head, M);
	}

	private static void outM(Node head, int m) {
		// TODO Auto-generated method stub

//		if (head == null || head.next == head || m < 1) {
//			System.out.println(head.value);
//		}

		Node last = head;
		while (last.next != head) {
			last = last.next;
		}
		int count = 0;

		StringBuffer bf = new StringBuffer();

		while (head != last) {
			if (++count == m) {
				bf.append(head.value);
				bf.append(" ");
				last.next = head.next;
				count = 0;
			} else {
				last = last.next;
			}
			head = last.next;
		}
		System.out.println(bf);
		System.out.println(head.value);
	}

}
