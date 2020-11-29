package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import smaller.FindSmaller;

public class TestSmaller {

	@Test
	public void sameNumberTest() {

		// assert statements
		assertEquals("1111", FindSmaller.nextbig("1111".toCharArray(), 4));
	}

	@Test
	public void validInputsTest() {

		assertEquals("abc", FindSmaller.nextbig("abc".toCharArray(), 3));
	}

	@Test
	public void positiveTest() {

		assertEquals("75436", FindSmaller.nextbig("75436".toCharArray(), 4));
	}

}
