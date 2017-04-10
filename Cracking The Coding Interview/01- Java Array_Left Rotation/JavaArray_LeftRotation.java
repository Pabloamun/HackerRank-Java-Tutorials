package crackingTheCodingInterview;

import java.util.*;

public class JavaArray_LeftRotation {

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		for (int j = 0; j < k; j++) {
			int c = a[0];
			int i;
			for (i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];

			}
			a[i] = c;
		}
		return a;

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}