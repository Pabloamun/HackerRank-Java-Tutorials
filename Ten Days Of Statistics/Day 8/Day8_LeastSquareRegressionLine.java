package tenDaysOfStatistics;

import java.util.Scanner;

public class Day8_LeastSquareRegressionLine {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);

		int[] X = new int[5];
		int[] Y = new int[5];
		for (int i = 0; i < X.length; i++) {
			X[i] = in.nextInt();
			Y[i] = in.nextInt();
		}
		double b = finding_b(X, Y);
		double a = finding_a(b, mean(X), mean(Y));
		System.out.printf("%.3f", solve(a, b, 80));
		in.close();
	}

	static double mean(int[] array) {
		int mean = 0;
		for (int i : array) {
			mean += i;
		}
		return mean / array.length;
	}

	static double finding_a(double b, double x, double y) {
		return (y - b * x);
	}

	static double finding_b(int[] x, int[] y) {
		int n = x.length;
		int xy = 0;
		int sum_x = 0;
		int sum_y = 0;
		int sum_x2 = 0;

		for (int i = 0; i < n; i++) {
			sum_x += x[i];
			sum_y += y[i];
			xy += x[i] * y[i];
			sum_x2 += Math.pow(x[i], 2);
		}
		return (n * xy - sum_x * sum_y) / (n * sum_x2 - Math.pow(sum_x, 2));
	}

	static double solve(double a, double b, int X) {

		return a + b * X;
	}
}
