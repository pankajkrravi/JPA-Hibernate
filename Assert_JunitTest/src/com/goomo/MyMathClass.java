package com.goomo;

public class MyMathClass {

	public int sum(int[] numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}
