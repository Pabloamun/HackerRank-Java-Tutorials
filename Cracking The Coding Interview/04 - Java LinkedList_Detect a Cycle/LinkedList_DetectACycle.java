package crackingTheCodingInterview;

import java.util.*;

public class LinkedList_DetectACycle {
	/*
	 * Detect a cycle in a linked list. Note that the head pointer may be 'null'
	 * if the list is empty.
	 * 
	 * A Node is defined as: class Node { int data; Node next; }
	 */

	boolean hasCycle(Node head) {
		List<Node> seenNodes = new ArrayList<Node>();
		if (head == null) {
			return false;
		} else {
			while (head != null) {
				if (seenNodes.contains(head)) {
					return true;
				} else {
					seenNodes.add(head);
					head = head.next;
				}
			}
			return false;
		}
	}
}
