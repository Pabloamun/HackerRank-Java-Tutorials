package tenDaysOfStatistics;

import java.util.Scanner;

public class Day6_CentralLimitTheoremII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tickets = in.nextInt();
		int students = in.nextInt();
		double u = in.nextDouble();
		double v = in.nextDouble();
		in.close();
		System.out.printf("%.4f",
				cumulative(students * u, Math.sqrt(students) * v, tickets));
	}

	public static double cumulative(double mean, double std, double x) {
		double parameter = (x - mean) / (std * Math.sqrt(2));
		return (0.5) * (1 + erf(parameter));
	}

	// fractional error in math formula less than 1.2 * 10 ^ -7.
	// although subject to catastrophic cancellation when z in very close to 0
	// from Chebyshev fitting formula for erf(z) from Numerical Recipes, 6.2
	public static double erf(double z) {
		double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

		// use Horner's method
		double ans = 1
				- t
				* Math.exp(-z
						* z
						- 1.26551223
						+ t
						* (1.00002368 + t
								* (0.37409196 + t
										* (0.09678418 + t
												* (-0.18628806 + t
														* (0.27886807 + t
																* (-1.13520398 + t
																		* (1.48851587 + t
																				* (-0.82215223 + t * (0.17087277))))))))));
		if (z >= 0)
			return ans;
		else
			return -ans;
	}
}
