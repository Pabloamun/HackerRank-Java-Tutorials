package crackingTheCodingInterview;

import java.util.Scanner;

public class Sorting_BubbleSort {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		in.close();
		int numberOfSwaps = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				int temp = 0;
				if (s[j] > s[j + 1]) {
					temp = s[j + 1];
					s[j + 1] = s[j];
					s[j] = temp;
					numberOfSwaps++;
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}
		}
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + s[0]);
		System.out.println("Last Element: " + s[n - 1]);
	}
}
