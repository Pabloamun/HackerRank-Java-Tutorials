package tenDaysOfStatistics;

import java.util.Scanner;

public class Day4_BinomialDistributionI {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		double boy = in.nextDouble();
		int girl = in.nextInt();
		double boyPerCent = boy / (1 + boy);

		double output = 0;
		for (int i = 3; i <= 6; i++) {
			output += binProbability(i, 6, boyPerCent);
		}
		System.out.printf("%.3f", output);
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
