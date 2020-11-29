package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dayout.DayOut;

public class TestDayOut {

	// Zero Nuetral test
	@Test
	public void zeroNeutralTest() {
		int[][] input = { { 0, 0 }, { 0, 0 } };
		assertEquals(" POSSIBLE ", DayOut.check(input));
	}

	// Positive
	@Test
	public void positiveTest() {
		int[][] input = { { 1, 1 }, { 1, 1 } };
		assertEquals(" POSSIBLE ", DayOut.check(input));
	}

	@Test
	public void positiveTest2() {
		int[][] input = { { 0, 2 }, { 1, 1 } };
		assertEquals(" IMPOSSIBLE ", DayOut.check(input));
	}
	// Negative Test

	@Test
	public void negativeTest() {
		int[][] input = { { -1, -1 }, { 1, 1 } };
		assertEquals(" Invalid Inputs ", DayOut.check(input));
	}

	// Boundary Conditions Test
	@Test
	public void boundaryConditionsTest() {
		int[][] input = { { 0, 0 }, { 1, 1 } };
		assertEquals(" IMPOSSIBLE ", DayOut.check(input));
	}

	@Test
	public void unSymmetricMatrixTest() {
		int[][] input = { { 1, 1 }, { 1, 1, 1 } };
		assertEquals(" Invalid Inputs ", DayOut.check(input));
	}
}
