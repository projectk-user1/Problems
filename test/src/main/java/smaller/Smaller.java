package smaller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Smaller {

	public static void main(String[] args) {
		System.out.println("Enter valid number to proceed and stop to exit");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String name = "";
		System.out.println("\n");
		System.out.println("Enter data: ");
		while (!name.equals("stop")) {
			try {
				name = br.readLine();
				Integer.parseInt(name);
				String nextbig = FindSmaller.nextbig(name.toCharArray(), name.toCharArray().length);
				System.out.print("Next number with same" + " set of digits is " + nextbig);
				System.out.println("\n Enter Data");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				if (!name.equals("stop"))
					System.out.println("Provide valid inputs " + name);
			}
		}
	}

}
