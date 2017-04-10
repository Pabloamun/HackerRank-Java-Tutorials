package crackingTheCodingInterview;

import java.util.Scanner;

public class TimeComplexity_Primality {
	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0 && n != i) {
				return false;
			}

		}

		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		for (int a0 = 0; a0 < p; a0++) {
			int n = in.nextInt();
			System.out.println(isPrime(n) ? "Prime" : "Not prime");
		}
		in.close();
	}
}
