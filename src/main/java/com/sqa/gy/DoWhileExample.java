/**
 *   File Name: DoWhileExample.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 19, 2017
 *
 */

package com.sqa.gy;

import java.text.*;

import com.sqa.gy.helpers.*;

/**
 * DoWhileExample Write a Java program which prints the grade average for a user
 * based on a user supplied set of grade values. Repeat execution until user has
 * no more items to be graded. Use a do while for this exercise. You will also
 * have to use two variables to hold the current accumulated grade points as
 * well as the total number of grades entered so that the average will be
 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
 * Scanner, Integer.parseInt.
 *
 * @author Yakovenko, Galina
 */
public class DoWhileExample {
	static DecimalFormat dfOneDecPlace = new DecimalFormat("##.#");

	public static void main(String[] args) {
		boolean moreGrades = true;
		double runningTotalGrades = 0;
		double runningTotalGradesAverage = 0;
		int noOfGrades = 0;

		System.out.println("Welcome!\n" + "Enter each grade when prompted. When finished, " + "enter \"done\".\n");

		do {
			boolean correctInput = false;
			while (correctInput == false) {
				try {
					String response = AppBasics.requestUserInfo("Grade:");
					if (response.equalsIgnoreCase("done")) {
						moreGrades = false;
					} else {
						double newGrade = Double.parseDouble(response);
						if (newGrade < 0 || newGrade > 100) {
							System.out.println("Please enter a grade between 0 and 100.");
						} else {
							noOfGrades++;
							runningTotalGrades += newGrade;
							runningTotalGradesAverage = runningTotalGrades / noOfGrades;
							System.out.println(
									"Current Grade Average: " + dfOneDecPlace.format(runningTotalGradesAverage) + "\n");
						}
					}
					correctInput = true;
				} catch (Exception e) {
					System.out.println("Enter a grade or \"done\" to finish.");
				}
			}
		} while (moreGrades == true);
		AppBasics.farewellUser("student", "Grades Averager");
	}
}
