package crackingTheCodingInterview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_ConnectedCellinaGrid {

	public static class Coord {
		private int x;
		private int y;

		public Coord(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}

	/** BFS to visit all regions for a given matrix **/
	public static int getBiggestRegion(int[][] matrix, int n, int m) {
		int max = 0;
		Queue<Coord> queue = new LinkedList<>();
		// Find the filled cells and put it into the queue
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 1) {
					int currMax = 0;
					queue.offer(new Coord(i, j));
					// BFS
					while (!queue.isEmpty()) {
						Coord cd = queue.poll();
						int x = cd.getX();
						int y = cd.getY();
						// Avoid duplicate counting
						if (matrix[x][y] == 1) {
							currMax++;
							matrix[x][y] = 0;
						}
						// Visit all neighbors
						if (isInBound(x - 1, y - 1, n, m)
								&& matrix[x - 1][y - 1] == 1)
							queue.offer(new Coord(x - 1, y - 1));
						if (isInBound(x - 1, y, n, m) && matrix[x - 1][y] == 1)
							queue.offer(new Coord(x - 1, y));
						if (isInBound(x - 1, y + 1, n, m)
								&& matrix[x - 1][y + 1] == 1)
							queue.offer(new Coord(x - 1, y + 1));
						if (isInBound(x, y - 1, n, m) && matrix[x][y - 1] == 1)
							queue.offer(new Coord(x, y - 1));
						if (isInBound(x, y + 1, n, m) && matrix[x][y + 1] == 1)
							queue.offer(new Coord(x, y + 1));
						if (isInBound(x + 1, y - 1, n, m)
								&& matrix[x + 1][y - 1] == 1)
							queue.offer(new Coord(x + 1, y - 1));
						if (isInBound(x + 1, y, n, m) && matrix[x + 1][y] == 1)
							queue.offer(new Coord(x + 1, y));
						if (isInBound(x + 1, y + 1, n, m)
								&& matrix[x + 1][y + 1] == 1)
							queue.offer(new Coord(x + 1, y + 1));
					}
					max = Math.max(max, currMax);
				}
			}
		}
		return max;
	}

	/** Check if a given coordinates is in bound **/
	public static boolean isInBound(int x, int y, int n, int m) {
		if (x >= n || y >= m || x < 0 || y < 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int grid[][] = new int[n][m];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			for (int grid_j = 0; grid_j < m; grid_j++) {
				grid[grid_i][grid_j] = in.nextInt();
			}
		}
		System.out.println(getBiggestRegion(grid, n, m));
		in.close();
	}
}
