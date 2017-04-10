package crackingTheCodingInterview;

public class Trees_IsThisABinarySearchTree {
	/*
	 * Hidden stub code will pass a root argument to the function below.
	 * Complete the function to solve the challenge. Hint: you may want to write
	 * one or more helper functions.
	 * 
	 * The Node class is defined as follows: class Node { int data; Node left;
	 * Node right; }
	 */
	boolean checkBST(Node root) {
		return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean check(Node node, int minValue, int maxValue) {
		if (node.left == null && node.right == null) {
			return node.data > minValue && node.data < maxValue;
		}
		return node.left.data > minValue && node.right.data < maxValue
				&& check(node.left, minValue, node.data)
				&& check(node.right, node.data, maxValue);
	}

}
