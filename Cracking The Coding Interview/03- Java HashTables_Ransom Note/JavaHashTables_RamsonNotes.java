package crackingTheCodingInterview;

import java.util.*;

public class JavaHashTables_RamsonNotes {

	public static Map<String, Integer> check = new HashMap<>();

	public static String ramsonNote(String[] first, String[] second) {
		String answer = "No";
		for (int i = 0; i < first.length; i++) {
			if (null != check.get(first[i])) {
				check.put(first[i], check.get(first[i]) + 1);
			} else {
				check.put(first[i], 1);
			}
		}

		for (int j = 0; j < second.length; j++) {
			if (null != check.get(second[j]) && (check.get(second[j]) != 0)) {
				check.put(second[j], check.get(second[j]) - 1);
				answer = "Yes";
			} else {
				answer = "No";
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}
		System.out.println(ramsonNote(magazine, ransom));
		in.close();
	}
}