package tenDaysOfStatistics;

import java.util.Scanner;

public class Day1_StandardDeviation {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
			sum += numbers[i];
		}
		double mean = sum / n;
		double mean_sum = 0;
		for (int num : numbers) {
			mean_sum += Math.pow((num - mean), 2);
		}
		System.out.printf("%.1f", Math.sqrt(mean_sum / n));
		in.close();
	}
}
