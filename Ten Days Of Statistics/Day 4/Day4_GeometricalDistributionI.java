package tenDaysOfStatistics;

public class Day4_GeometricalDistributionI {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		int n = 5;
		double p = 0.333;
		double q = 1 - p;
		System.out.printf("%.3f", Math.pow(q, 4) * p);
	}
}
