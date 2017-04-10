package tenDaysOfStatistics;

/*
 * Objective 
 In this challenge, we practice calculating probability.

 * Task 
 In a single toss of 2 fair (evenly-weighted) six-sided dice, 
 find the probability that the values rolled by each die will be different 
 and the two dice have a sum of 6.
 */
public class Day2_MoreDice {
	final static int[] dice = { 1, 2, 3, 4, 5, 6 };
	final static int[] SampleSpace = { 2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 8, 4,
			5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 11, 7, 8, 9, 10,
			11, 12 };

	public static void main(String[] args) {
		int count = 0;
		for (int toss1 : dice) {
			for (int toss2 : dice) {
				if (toss1 != toss2 && toss1 + toss2 == 6) {
					count++;
				}
			}
		}
		System.out.println("The probability is " + count + "/"
				+ SampleSpace.length);
	}
}
