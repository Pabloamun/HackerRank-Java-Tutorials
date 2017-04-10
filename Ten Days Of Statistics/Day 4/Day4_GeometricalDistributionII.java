package tenDaysOfStatistics;

public class Day4_GeometricalDistributionII {

	public static void main(String[] args) {
		int n = 5;
		double p = 0.333;
		double q = 1 - p;
		double output = 0;
		for (int i = 1; i <= 5; i++) {
			output += geometric(i, p);
		}
		System.out.printf("%.3f", output);
	}

	private static double geometric(int n, double p) {
		return Math.pow(1 - p, n - 1) * p;
	}

}
