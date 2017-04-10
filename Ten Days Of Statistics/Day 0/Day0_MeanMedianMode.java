package tenDaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day0_MeanMedianMode {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = in.nextInt();
		}
		mean(numbers);
		System.out.println("");
		median(numbers);
		System.out.println("");
		mode(numbers);
		in.close();
	}

	public static void mean(int[] numbers) {
		double sum_mean = 0;
		for (int num : numbers) {
			sum_mean += num;
		}
		System.out.printf("%.1f", sum_mean / numbers.length);
	}

	public static void median(int[] numbers) {
		Arrays.sort(numbers);
		double total_median = 0.0;
		if (numbers.length % 2 == 0) {
			total_median = (0.5 * numbers[(numbers.length) / 2] + 0.5 * numbers[(numbers.length / 2) - 1]);
			System.out.printf("%.1f", total_median);
		} else {
			System.out.printf("%.1f", numbers[(numbers.length / 2) - 1]);
		}
	}

	public static void mode(int[] numbers) {
		int n = numbers.length;
		int[] count = new int[n];
		for (int i = 0; i < n; i++) {
			int cou = 0;
			for (int j = i + 1; j < n; j++) {
				if (numbers[i] == numbers[j]) {
					cou++;
				}
			}
			count[i] = cou;
		}
		int max = count[0];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (max < count[i]) {
				max = count[i];
				index = i;
			}
		}
		int mode = numbers[index];
		System.out.println(mode);
	}
}
