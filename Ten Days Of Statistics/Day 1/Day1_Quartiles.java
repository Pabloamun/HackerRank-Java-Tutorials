package tenDaysOfStatistics;

import java.util.*;

public class Day1_Quartiles {
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
		Arrays.sort(numbers);

		System.out.println(findMedian(numbers, 0, (n / 2) - 1));
		System.out.println(findMedian(numbers, 0, n - 1));
		System.out.println(findMedian(numbers, (n + 1) / 2, n - 1));
		in.close();
	}

	private static int findMedian(int[] array, int start, int end) {
		if ((end - start) % 2 == 0) { // odd number of elements
			return (array[(end + start) / 2]);
		} else { // even number of elements
			int value1 = array[(end + start) / 2];
			int value2 = array[(end + start) / 2 + 1];
			return Math.round((value1 + value2) / 2);
		}
	}
}
