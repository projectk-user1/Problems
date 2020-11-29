package dayout;

import java.util.Arrays;
import java.util.Scanner;

public class DayOutCaptureInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" No of Games to be palyed ");

		while (!sc.hasNextInt()) {
			System.out.println(" That's not a number! ");
			sc.next(); // this is important!
		}
		int games = sc.nextInt();
		for (int g = 0; g < games; g++) {
			System.out.println(" No of Teams Participating ");
			while (!sc.hasNextInt()) {
				System.out.println(" That's not a number! ");
				sc.next(); // this is important!
			}
			int n = sc.nextInt();
			int[][] m = new int[n][n];
			for (int i = 0; i < n; i++) {
				System.out.println(" Enter Initial Configuaration of Zone " + i);
				for (int j = 0; j < n; j++) {
					while (!sc.hasNextInt()) {
						System.out.println(" That's not a number! ");
						sc.next(); // this is important!
					}
					m[i][j] = Integer.valueOf(sc.next());
				}
			}
			 System.out.println(Arrays.deepToString(m));// use this api to print arrays
			System.out.println(DayOut.check(m));
		}
		sc.close();

	}
}
