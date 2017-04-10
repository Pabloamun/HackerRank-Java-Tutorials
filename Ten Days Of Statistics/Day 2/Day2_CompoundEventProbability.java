package tenDaysOfStatistics;

import java.util.*;

/*
 * Objective 
 In this challenge, we practice calculating the probability of a compound 
 event.  

 * Task 	
 There are 3 urns labeled, X, Y and Z. 
 Urn X contains 4 red balls and 3 black balls.
 Urn Y contains 5 red balls and 4 black balls.
 Urn Z contains 4 red balls and 4 black balls. 

 One ball is drawn from each of the 3 urns. What is the probability that,
 of the 3 balls drawn, 2 are red and 1 is black?
 */

public class Day2_CompoundEventProbability {
	final static char[] X = { 'R', 'R', 'R', 'R', 'B', 'B', 'B' };
	final static char[] Y = { 'R', 'R', 'R', 'R', 'R', 'B', 'B', 'B', 'B' };
	final static char[] Z = { 'R', 'R', 'R', 'R', 'B', 'B', 'B', 'B' };

	public static void main(String[] args) {

		int A = 0;
		int S = 0;
		List<String> SampleSpace = new ArrayList<>();
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < Y.length; j++) {
				for (int h = 0; h < Z.length; h++) {
					String toss = "" + X[i] + Y[j] + Z[h];
					SampleSpace.add(toss);
				}
			}
		}
		S = SampleSpace.size();
		for (String toss : SampleSpace) {
			int red = 0;
			int black = 0;
			for (int i = 0; i < toss.length(); i++) {
				if (toss.charAt(i) == 'R')
					red++;
				else
					black++;
			}
			if (red == 2 && black == 1) {
				A++;
			}
		}
		System.out.println("Probability of 2 balls red and 1 black is " + A
				+ "/" + S);
	}
}
