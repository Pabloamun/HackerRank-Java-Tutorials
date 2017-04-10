package tenDaysOfStatistics;

import java.util.Scanner;

public class Day6_CentralLimitTheoremIII {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int u = in.nextInt();
		int v = in.nextInt();
		double P_AB = in.nextDouble();
		double z_score = in.nextDouble();
		in.close();
		System.out.printf("%.2f", u - MarginError(v, z_score, n));
		System.out.println();
		System.out.printf("%.2f", u + MarginError(v, z_score, n));
	}

	static double MarginError(int v, double z_score, int n) {
		double v_error = v / Math.sqrt(n);
		return v_error * z_score;
	}
}
