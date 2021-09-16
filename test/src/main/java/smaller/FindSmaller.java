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
		//find the digit smaller than previous
		for (i = lenght - 1; i > 0; i--) {
			System.out.println("number[i] "+number[i]+" number[i-1] "+number[i-1]);
			if (number[i] > number[i - 1]) {
				break;
			}
		}
//		System.out.println(" ddigit smaller than prev digit position "+i +" smaller digit "+number[i-1]);
		// i=0 means number is in sorted in descending
		if (i == 0) {
			System.out.println("Next Big number is same as input");
			returnNumber = String.valueOf(number);
		} else {
//			int x = number[i - 1];
			int minPosition = i;
			
			//Find smallest to right side from 'i' greater than found 
			//Find the smallest digit on right  side of (i-1)'th digit that is greater than number[i-1] 
			for (int j = i + 1; j < lenght; j++) {
				System.out.println("number[j] "+number[j]+"  number[min]" + number[minPosition]+" number[i-1] "+number[i-1]);
				if (number[j] > number[i - 1] && number[j] < number[minPosition]) {
					minPosition = j;
				}
			}
			//swap numbers
			swap(number, i - 1, minPosition);
			/*char temp;
			for(int j = i+1; j<lenght; j++ ){
		         for(int k = j+1; k<lenght; k++){
		            if(number[j]>number[k]){
		               temp = number[j];
		               number[j] = number[k];
		               number[k] = temp;
		            }
		         }
		      }*/
			//sort numbers right to the digit 
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
