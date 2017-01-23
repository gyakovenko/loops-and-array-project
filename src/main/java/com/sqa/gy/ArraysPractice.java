/**
 * File Name: ArraysPractice.java<br>
 * Created: Jan 21, 2017
 */
package com.sqa.gy;

import java.util.*;

/**
 * ArraysPractice Galina Yakovenko
 */
public class ArraysPractice {

	public static void sampleArrays() {
		int[] numbers = new int[5];
		numbers[0] = 4;
		numbers[1] = 8;
		numbers[2] = 9;
		numbers[3] = 1;
		numbers[4] = 0;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
