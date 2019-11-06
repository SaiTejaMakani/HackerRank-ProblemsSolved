package com.hackerRankPractice.DataStructures.LinkedList;

public class PrintLinkedList {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] data = { 1, 4, 5, 6, 7, 8, 9, 90, 2, 3, 4, 5 };
		for (int nodeData : data)
			llist.insertNode(nodeData);
		printLinkedList(llist.head);
	}

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static void printLinkedList(SinglyLinkedListNode head) {
		if (head != null)
			do {
				System.out.println(head.data);
				head = head.next;
			} while (head != null);
	}

}
