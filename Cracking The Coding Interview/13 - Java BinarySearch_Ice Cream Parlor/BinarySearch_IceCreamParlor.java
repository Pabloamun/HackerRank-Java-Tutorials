package crackingTheCodingInterview;

import java.util.*;
import java.util.Scanner;

class IceCream implements Comparable {
	int flavor;
	int index;

	public IceCream(int flavor, int index) {
		this.flavor = flavor;
		this.index = index;
	}

	@Override
	public int compareTo(Object o) {
		IceCream icecream = (IceCream) o;
		return this.flavor - icecream.flavor;
	}

	@Override
	public boolean equals(Object o) {
		IceCream icecream = (IceCream) o;
		return this.flavor == icecream.flavor;
	}

}

public class BinarySearch_IceCreamParlor {

	public static int binarySearch(int first, int last, IceCream[] arr,
			int search) {
		int middle = (first + last) / 2;
		int flavor = arr[middle].flavor;
		if (first > last)
			return -1;
		else {
			if (flavor == search)
				return arr[middle].index;
			if (flavor > search)
				return binarySearch(first, middle - 1, arr, search);
			else
				return binarySearch(middle + 1, last, arr, search);

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int m = in.nextInt();
			int n = in.nextInt();
			IceCream[] arr = new IceCream[n];
			HashMap<Integer, Integer> iceMap = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				arr[i] = new IceCream(in.nextInt(), i + 1);
				int desiredAmount = m - arr[i].flavor;
				if (iceMap.containsKey(desiredAmount)) {
					int currentIndex = i + 1;
					System.out.println(iceMap.get(desiredAmount) + " "
							+ currentIndex);
					// read in and use up all the un-used flavors
					in.nextLine();
					break;
				}
				iceMap.put(arr[i].flavor, arr[i].index);
			}
		}
	}
}
