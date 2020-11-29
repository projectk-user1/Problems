package dayout;

public class DayOut {
	private DayOut() {
		// Do nothing
	}

	public static String check(int[][] m) {
		String rtrnString = " Invalid Inputs ";
		if (preConditionsCheck(m)) {
			rtrnString = " POSSIBLE ";
			// Calculates number of rows and columns present in given matrix

			for (int i = 0; i < m.length; i++) {
				int rowSum = 0;
				int columnSum = 0;
				for (int j = 0; j < m[0].length; j++) {
					rowSum = rowSum + m[i][j];
					columnSum = columnSum + m[j][i];
				}
				// System.out.println("\nThe Sum of Matrix Items " + "in Row " + i + " = " +
				// rowSum);
				// System.out.println("\nThe Sum of Matrix Items " + "in Column " + i + " = " +
				// columnSum);
				if (rowSum != columnSum) {
					rtrnString = " IMPOSSIBLE ";
					break;
				}
			}
		}
		return rtrnString;
	}

	private static boolean preConditionsCheck(int[][] m) {
		boolean flag = true;
		// check row size = column size
		int rowLength = m.length;
		for (int j = 0; j < rowLength; j++) {
			if (rowLength != m[j].length) {
				flag = false;
				break;
			}
		}
		// check for non zero positive number
		if (flag) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[0].length; j++) {
					if (m[i][j] < 0) {
						flag = false;
					}
				}
			}
		}
		return flag;
	}
}
