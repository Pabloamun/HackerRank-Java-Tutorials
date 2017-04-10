package tenDaysOfStatistics;

import java.util.Scanner;

public class Day7_PearsonCorrelationCoefficentI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double[] X = new double[n];
		double[] Y = new double[n];
		double sum_X = 0;
		double sum_Y = 0;
		for (int i = 0; i < n; i++) {
			X[i] = in.nextDouble();
			sum_X += X[i];
		}
		for (int i = 0; i < n; i++) {
			Y[i] = in.nextDouble();
			sum_Y += Y[i];
		}
		in.close();
		double mean_X = sum_X / n;
		double mean_Y = sum_Y / n;
		double strDev_X = standardDeviation(X, mean_X, n);
		double strDev_Y = standardDeviation(Y, mean_Y, n);
		double total_sum = 0;
		for (int i = 0; i < n; i++) {
			total_sum += (X[i] - mean_X) * (Y[i] - mean_Y);
		}
		System.out.printf("%.3f", total_sum / (n * strDev_X * strDev_Y));
	}

	static double standardDeviation(double[] numbers, double mean, int n) {
		double mean_sum = 0;
		for (double num : numbers) {
			mean_sum += Math.pow((num - mean), 2);
		}
		return Math.sqrt(mean_sum / n);
	}
}
