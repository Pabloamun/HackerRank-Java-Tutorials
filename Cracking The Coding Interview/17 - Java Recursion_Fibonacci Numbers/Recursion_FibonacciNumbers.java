package crackingTheCodingInterview;

import java.util.*;

public class Recursion_FibonacciNumbers {

	public static int fibonacci(int n) {
		// Complete the function.
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2)
			return 1;
		else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}
}
