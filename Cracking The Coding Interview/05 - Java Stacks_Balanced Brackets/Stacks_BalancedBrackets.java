package crackingTheCodingInterview;

import java.util.*;

public class Stacks_BalancedBrackets {
	private static final char[] PAR = new char[] { '[', ']', '{', '}', '(', ')' };

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Stack<Character> stack = new Stack<Character>();
		while (sc.hasNext()) {
			boolean isBalanced = true;
			String input = sc.next();
			for (Character c : input.toCharArray()) {
				if (isOpen(c)) {
					stack.push(c);
					continue;
				}

				if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
					isBalanced = false;
					break;
				}
			}
			// make sure there is nothing left over
			if (!stack.isEmpty()) {
				isBalanced = false;
				stack.clear();
			}
			System.out.println(isBalanced ? "YES" : "NO");
			sc.close();
		}
	}

	private static boolean isMatching(char last, char current) {
		int i = getIndex(current);
		return i >= 1 && PAR[i - 1] == last;
	}

	private static int getIndex(char c) {
		for (int i = 0; i < PAR.length; i++) {
			if (PAR[i] == c) {
				return i;
			}
		}
		return -1;
	}

	private static boolean isOpen(char c) {
		// odd numbered index values are closed parentheses
		return getIndex(c) % 2 != 1;
	}
}
