/**
 *   File Name: Homework7.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 22, 2017
 *
 */

package com.sqa.gy;

import java.util.*;

import com.sqa.gy.helpers.*;

/**
 * Homework7
 *
 * @author Yakovenko, Galina
 *
 *         pt1 - Create 3 arrays of int arrays display details of those 3 arrays
 *         using different loops <br>
 *         pt2 - Create 3 different types of arrays display details of those
 *         arrays in different orders ( forward, backwards, sorted order) <br>
 *         pt3 -Create an array of 5 People objects Display all details of those
 *         5 People objects. - IN CLASSES PROJECT CLASS: HOMEWORK7 <br>
 *         pt4 -Create an array, not using any built in methods display all even
 *         items, all items with an index divisible by 3, and all items based on
 *         a user defined requirement.
 */
public class Homework7 {
	public static void completePartFour() {
		int[] arrayforPartFour = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };
		// print all even items
		for (int i = 0; i < arrayforPartFour.length; i++) {
			if (((i + 1) % 2) == 0) {
				System.out.print(arrayforPartFour[i] + " ");
			}
		}
		System.out.println("\n");

		// print all items whose place in order (not index) is divisible by 3
		for (int i = 0; i < arrayforPartFour.length; i++) {
			if (((i + 1) % 3) == 0) {
				System.out.print(arrayforPartFour[i] + " ");
			}
		}
		System.out.println("\n");

		// print all items whose place in order (not index) is divisible by user
		// given int
		int divisibleBy = AppBasics.requestUserInt("I will display all the items of the array whose place in the array "
				+ "\nis divisible by the integer you give me. " + "\nPlease enter an integer:");
		for (int i = 0; i < arrayforPartFour.length; i++) {
			if (((i + 1) % divisibleBy) == 0) {
				System.out.print(arrayforPartFour[i] + " ");
			}
		}

	}

	public static void completePartOne() {
		int[] intArray1 = { 1, 2, 3, 4, 5 };
		int[] intArray2 = { 321, 432, 543, 654 };
		int[] intArray3 = { 99, 88, 77, 66, 55, 44, 33 };

		// print intArray1 for each loop
		for (int i : intArray1) {
			System.out.println("Here is item " + (i) + " in intArray1: " + intArray1[i - 1]);
		}

		System.out.println("\n");

		// print intArray2 while loop
		boolean listFinished = false;
		int i = 0;
		while (!listFinished) {
			if (i == 0) {
				System.out.print(intArray2[i]);
			} else {
				System.out.print(", " + intArray2[i]);
			}
			i++;
			if (i >= intArray2.length) {
				listFinished = true;
			}
		}

		System.out.println("\n");

		// call method to printArray3
		printArray3Recursive(intArray3, (intArray3.length - 1));
		System.out.println("\n");
	}

	public static void completePartTwo() {
		String[] pt2Array1 = { "one", "two", "three", "four" };
		boolean[] pt2Array2 = { false, false, true, true, true };
		double[] pt2Array3 = { 1, 10.5, 8, 3, 7.6 };

		// print pt2Array1 backwards
		for (int i = (pt2Array1.length - 1); i >= 0; i--) {
			System.out.print(pt2Array1[i] + " ");
		}
		System.out.println("\n");

		// print pt2Array2 forwards
		for (int i = 0; i < pt2Array2.length; i++) {
			System.out.println(pt2Array2[i]);
		}
		System.out.println("\n");

		//// print pt2Array2 sorted least to greatest
		Arrays.sort(pt2Array3);
		for (int i = 0; i < pt2Array3.length; i++) {
			System.out.println(pt2Array3[i]);
		}
	}

	public static void main(String[] args) {
		// completePartOne();
		// completePartTwo();
		completePartFour();
		System.exit(0);
	}

	// method print intArray3 recursive
	public static void printArray3Recursive(int[] array, int counter) {
		if (counter == array.length - 1) {
			System.out.print(array[counter]);
		} else {
			System.out.print(", " + array[counter]);
		}
		counter--;
		if (counter >= 0) {
			printArray3Recursive(array, counter);
		}
	}
}
