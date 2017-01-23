/**
 *   File Name: ArraysExercieseTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

/**
 * ArraysExercieseTest
 *
 * @author Yakovenko, Galina
 */
public class ArraysExercieseTest {

	static int[] intArray = { 2, 4, 0, 3, 8, 3, 6, 3, 4, 2 };
	static String[] stringArray = { "Galina", "is", "cooler", "than", "Isha", "\nOk", "maybe", "just", "as", "cool",
			"as", "Isha", "\nFine", "not", "nearly", "as", "cool", "as", "Isha" };

	@Test
	public void testExercise1() {
		ArraysExercises.exercise1();
	}

	@Test
	public void testExercise2() {
		ArraysExercises.exercise2();
	}

	@Test
	public void testExercise3() {
		ArraysExercises.exercise3(intArray);
	}

	@Test
	public void testExercise4() {
		ArraysExercises.exercise4(stringArray);
	}

	@Test
	public void testExercise5() {
		ArraysExercises.exercise5();
	}
}
