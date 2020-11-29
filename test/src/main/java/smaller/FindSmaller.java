package smaller;

import java.util.Arrays;

public class FindSmaller {
	private FindSmaller() {
		// Nothing to do here
	}

	/*
	 * 1.) If input is not number dont process the input 2.) Check if input is
	 * already in sorted manner (descending order) if so no need to swap digits 3.)
	 * Traverse the input from right to left till we find smaller digit than
	 * previous 4.) Now search the right side of above found digit ‘d’ for the
	 * smallest digit greater than ‘d’. For "534976", the right side of 4 contains
	 * "976". The smallest digit greater than 4 is 6. 5.) swap the both the digits =
	 * 536974 6.) Sort remaining digits next to digit'd' to get next big number
	 */
	public static String nextbig(char[] number, int lenght) {
		try {
			Integer.parseInt(String.valueOf(number));
		} catch (NumberFormatException e) {
			return String.valueOf(number);
		}
		int i;
		String returnNumber = null;
		for (i = lenght - 1; i > 0; i--) {
			if (number[i] > number[i - 1]) {
				break;
			}
		}
		if (i == 0) {
			System.out.println("Next Big number is same as input");
			returnNumber = String.valueOf(number);
		} else {
			int x = number[i - 1];
			int min = i;
			for (int j = i + 1; j < lenght; j++) {
				if (number[j] > x && number[j] < number[min]) {
					min = j;
				}
			}
			swap(number, i - 1, min);
			Arrays.sort(number, i, lenght);
			returnNumber = String.valueOf(number);
		}
		return returnNumber;
	}

	private static void swap(char ar[], int i, int j) {
		char temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
}
