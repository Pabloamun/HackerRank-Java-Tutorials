package tenDaysOfStatistics;

import java.util.Scanner;

public class Day4_BinomialDistributionII {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int n = 10;
		double p = 0.12;
		double output1 = 0;

		for (int i = 0; i <= 2; i++) {
			output1 += binProbability(i, n, p);
		}
		System.out.printf("%.3f", output1);
		System.out.println();

		double output2 = 0;
		for (int i = 2; i <= n; i++) {
			output2 += binProbability(i, n, p);
		}
		System.out.printf("%.3f", output2);
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else
			return n * factorial(n - 1);
	}

	static double binProbability(int x, int n, double p) {
		double facValue = factorial(n) / (factorial(x) * factorial(n - x));
		return facValue * Math.pow(p, x) * Math.pow((1 - p), (n - x));
	}
}
