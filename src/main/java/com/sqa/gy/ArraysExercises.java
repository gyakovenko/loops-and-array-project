/**
 *   File Name: ArraysExercises.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

import java.util.*;

import com.sqa.gy.helpers.*;

/**
 * ArraysExercises //ADDD (description of class)
 *
 * @author Yakovenko, Galina
 */
public class ArraysExercises {

	// Ex 1 Declare an array of char with 5 element, try to show 3 forms
	public static void exercise1() {
		System.out.println("Declare, then initiate, then assign each value");
		char[] myCharArray1;
		myCharArray1 = new char[6];
		myCharArray1[0] = 'G';
		myCharArray1[1] = 'a';
		myCharArray1[2] = 'l';
		myCharArray1[3] = 'i';
		myCharArray1[4] = 'n';
		myCharArray1[5] = 'a';
		String myCharArray1AsString = Arrays.toString(myCharArray1);
		System.out.println(myCharArray1AsString + "\n");

		System.out.println("Declare and initiate, then assign each value");
		char[] myCharArray2 = new char[6];
		myCharArray2[0] = 'G';
		myCharArray2[1] = 'a';
		myCharArray2[2] = 'l';
		myCharArray2[3] = 'i';
		myCharArray2[4] = 'n';
		myCharArray2[5] = 'a';
		String myCharArray2AsString = Arrays.toString(myCharArray2);
		System.out.println(myCharArray2AsString + "\n");

		System.out.println("Declare, initial, and assign all at once.");
		char[] myCharArray3 = { 'G', 'a', 'l', 'i', 'n', 'a' };
		String myCharArray3AsString = Arrays.toString(myCharArray3);
		System.out.println(myCharArray3AsString + "\n");
	}

	// Ex 2 Declare an array of int and initialize elements in the array
	public static int[] exercise2() {
		System.out.println("Declare and initialize elements in int[]");
		int[] myIntArray1 = { 2, 4, 0, 3, 8, 3, 6, 3, 4, 2 };
		String myIntArray1AsString = Arrays.toString(myIntArray1);
		System.out.println(myIntArray1AsString + "\n\n");
		return myIntArray1;
	}

	// Ex 3 Write a method which takes a parameter of array of int and print the
	// size of any array.
	public static void exercise3(int[] intArray) {
		System.out.println(Arrays.toString(intArray));
		System.out.println("Length of this array is: " + intArray.length);
		System.out.print("\n");
	}

	// Ex 4 Write a method which takes a parameter of array of String and print
	// all the items in the array using a for or for-each loop
	public static void exercise4(String[] anyString) {
		for (int i = 0; i < anyString.length; i++) {
			System.out.print(anyString[i] + " ");
		}
		System.out.println("\n");
	}

	// Ex 5Create an Simple Employee Entry Application which takes employee
	// details such as Name, Address, Age, City, Phone Number, and Job Title.
	// The number of employees that will be entered into the array should be
	// determined at the start of the application. Upon exiting the employee
	// details should be echoed to the user.
	public static void exercise5() {
		int howManyEmployees = AppBasics.requestUserInt("How many employees would you like to enter into the system?");
		String[] employeeNamesArray = new String[howManyEmployees];
		String[] employeeAddressesArray = new String[howManyEmployees];
		String[] employeeCityArray = new String[howManyEmployees];
		String[] employeePhoneNumberArray = new String[howManyEmployees];
		String[] employeeJobTitleArray = new String[howManyEmployees];
		for (int i = 0; i < howManyEmployees; i++) {
			System.out.println("\nEmployee #" + (i + 1));
			employeeNamesArray[i] = AppBasics.requestUserInfo("Employee Name: ");
			employeeAddressesArray[i] = AppBasics.requestUserInfo("Employee Street Address: ");
			employeeCityArray[i] = AppBasics.requestUserInfo("Employee City: ");
			employeePhoneNumberArray[i] = AppBasics.requestUserInfo("Employee Phone Number: ");
			employeeJobTitleArray[i] = AppBasics.requestUserInfo("Employee Job Title: ");
			System.out.println("\n");
		}
		System.out.println("\nSaved in the system:");
		for (int i = 0; i < howManyEmployees; i++) {
			System.out.println("\nEmployee #" + i);
			System.out.println(employeeNamesArray[i]);
			System.out.println(employeeAddressesArray[i]);
			System.out.println(employeeCityArray[i]);
			System.out.println(employeePhoneNumberArray[i]);
			System.out.println(employeeJobTitleArray[i]);
			System.out.println("\n");
		}

	}

}
