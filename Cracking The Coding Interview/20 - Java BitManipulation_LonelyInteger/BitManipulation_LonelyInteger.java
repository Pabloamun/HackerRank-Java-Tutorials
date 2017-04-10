package crackingTheCodingInterview;

import java.util.Scanner;

public class BitManipulation_LonelyInteger {
	public static int lonelyInteger(int[] a, int n) {
		int k = a[0];
		for (int i = 1; i < n; i++) {
			k = k ^ a[i];
		}
		return k;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		System.out.println(lonelyInteger(a, n));
	}
}
