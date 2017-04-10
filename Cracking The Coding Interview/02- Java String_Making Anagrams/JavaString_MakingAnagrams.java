package crackingTheCodingInterview;

import java.util.*;
import java.util.Map.Entry;

public class JavaString_MakingAnagrams {
	public static Map<Character, Integer> check = new HashMap<>();

	public static int numberNeeded(String first, String second) {
		int count = 0;
		for (int i = 0; i < first.length(); i++) {
			if (null != check.get(first.charAt(i))) {
				check.put(first.charAt(i), check.get(first.charAt(i)) + 1);
			} else {
				check.put(first.charAt(i), 1);
			}
		}

		for (int j = 0; j < second.length(); j++) {
			if (null != check.get(second.charAt(j))
					&& (check.get(second.charAt(j)) != 0)) {
				check.put(second.charAt(j), check.get(second.charAt(j)) - 1);
			} else {
				count++;
			}
		}

		Iterator<Entry<Character, Integer>> it = check.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			count = count + (int) pair.getValue();
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
		in.close();
	}
}
