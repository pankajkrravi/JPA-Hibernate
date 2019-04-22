package com.goomo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {
	MyMathClass myMathClass = new MyMathClass();

	// sum 1,2,3--->6
	@Test
	public void sum_with_ThreeNumber() {

		// check whether the result is 6
		// i.e result==6
		assertEquals(6, myMathClass.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void sum_with_twoNumber() {
		assertEquals(3, myMathClass.sum(new int[] { 1, 2 }));
	}
}
