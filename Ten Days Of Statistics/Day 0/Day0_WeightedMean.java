package tenDaysOfStatistics;

import java.util.Scanner;

public class Day0_WeightedMean {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] X = new int[n];
		int[] W = new int[n];
		for (int i = 0; i < n; i++) {
			X[i] = in.nextInt();
		}
		int w = 0;
		for (int i = 0; i < n; i++) {
			W[i] = in.nextInt();
			w += W[i];
		}
		double weight = 0.0;
		for (int i = 0; i < n; i++) {
			weight += X[i] * W[i];
		}
		System.out.printf("%.1f", weight / w);
		in.close();
	}
}
