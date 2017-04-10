package tenDaysOfStatistics;

import java.util.Scanner;

public class Day5_PoissonDistributionI {
	public static void main(String[] args) {
		/* Read and save input */
		Scanner in = new Scanner(System.in);
		double lambda = in.nextDouble();
		int k = in.nextInt();
		in.close();

		System.out.printf("%.3f", poisson(k, lambda));
	}

	private static double poisson(int k, double lambda) {
		return (Math.pow(lambda, k) * Math.pow(Math.E, -1 * lambda))
				/ factorial(k);
	}

	private static Long factorial(int n) {
		if (n < 0) {
			return null;
		}
		long result = 1;
		while (n > 0) {
			result *= n--;
		}
		return result;
	}
}
