package crackingTheCodingInterview;

import java.util.*;

public class Tries_Contacts {

	private static Map<Character, List<String>> contacts = new HashMap<>();

	private static void find(String input) {
		int count = 0;
		List<String> subContacts = contacts.get(input.charAt(0));
		if (subContacts == null) {
			System.out.println(count);
			return;
		}
		for (String contact : subContacts) {
			if (contact.startsWith(input))
				count++;
		}
		System.out.println(count);
	}

	private static void add(String input) {
		List<String> temp = contacts.get(input.charAt(0));
		if (temp == null)
			temp = new ArrayList<>();
		temp.add(input);
		contacts.put(input.charAt(0), temp);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine().trim());
		for (int i = 0; i < n; i++) {
			String[] input = in.nextLine().trim().split(" ");
			if (input[0].equals("add"))
				add(input[1]);
			else
				find(input[1]);
		}
		in.close();
	}

}
