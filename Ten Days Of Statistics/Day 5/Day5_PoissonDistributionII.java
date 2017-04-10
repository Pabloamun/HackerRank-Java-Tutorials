package tenDaysOfStatistics;

import java.util.Scanner;

public class Day5_PoissonDistributionII {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		double lambda_A = in.nextDouble();
		double lambda_B = in.nextDouble();

		System.out.printf("%.3f",
				160 + (40 * (lambda_A + Math.pow(lambda_A, 2))));
		System.out.println();
		System.out.printf("%.3f",
				128 + (40 * (lambda_B + Math.pow(lambda_B, 2))));
	}
}
