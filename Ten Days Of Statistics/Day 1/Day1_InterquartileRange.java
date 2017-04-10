package tenDaysOfStatistics;

import java.util.*;

public class Day1_InterquartileRange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] elements = new int[n];
		int[] frequency = new int[n];
		List<Integer> dataSet = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			elements[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			frequency[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			while (frequency[i]-- > 0) {
				dataSet.add(elements[i]);
			}
		}
		Collections.sort(dataSet);

		double Q1 = findMedian(dataSet, 0, dataSet.size() / 2 - 1);
		double Q3 = findMedian(dataSet, (dataSet.size() + 1) / 2,
				dataSet.size() - 1);

		System.out.printf("%.1f", Q3 - Q1);

		in.close();
	}

	private static double findMedian(List<Integer> list, int start, int end) {
		if ((end - start) % 2 == 0) { // odd number of elements
			return (list.get((end + start) / 2));
		} else { // even number of elements
			double value1 = list.get((end + start) / 2);
			double value2 = list.get((end + start) / 2 + 1);
			return ((value1 + value2) / 2);
		}
	}
}
