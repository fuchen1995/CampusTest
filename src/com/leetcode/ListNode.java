package com.leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}


class Solution1 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode result = null;
		int up = 0;
		while (l1 != null && l2 != null) {
			int cur = l1.val + l2.val + up;
			if (cur >= 10) {
				if (head == null) {
					head = new ListNode(cur % 10);
					result = head;
				} else {
					head.next = new ListNode(cur % 10);
					head = head.next;
				}
				up = 1;
			} else {
				if (head == null) {
					head = new ListNode(cur);
					result = head;
				} else {
					head.next = new ListNode(cur);
					head = head.next;
				}
				up = 0;
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		if (l1 != null) {
			while (l1 != null) {
				int sum = l1.val + up;
				if (sum >= 10) {
					head.next = new ListNode(sum % 10);
					up = 1;
				} else {
					head.next = new ListNode(sum);
					up = 0;
				}
				head = head.next;
				l1 = l1.next;
			}
		}
		if (l2 != null) {
			while (l2 != null) {
				int sum = l2.val + up;
				if (sum >= 10) {
					head.next = new ListNode(sum % 10);
					up = 1;
				} else {
					head.next = new ListNode(sum);
					up = 0;
				}
				head = head.next;
				l2 = l2.next;
			}
		}
		if (up > 0) {
			head.next = new ListNode(1);
		}

		return result;

	}
}