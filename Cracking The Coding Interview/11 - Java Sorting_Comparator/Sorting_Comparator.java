package crackingTheCodingInterview;

import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		Integer score = a.score;
		int order = score.compareTo(b.score) * -1;
		return order == 0 ? a.name.compareTo(b.name) : order;
	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class Sorting_Comparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];
		Checker checker = new Checker();

		for (int i = 0; i < n; i++) {
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
