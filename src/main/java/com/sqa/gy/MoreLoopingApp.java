/**
 *   File Name: MoreLoopingApp.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

/**
 * MoreLoopingApp
 *
 * @author Yakovenko, Galina
 */
public class MoreLoopingApp {

	public static void loopSeriesofSpacesSymbols(String theSymbol, int numOfLines, int numOfSpaces, int numOfStars,
			int numToInDecrementby, String symbolBefore, String symbolAfter, String symbolBetween) {
		for (int i = 0; i < numOfLines; i++, numOfSpaces--, numOfStars++) {
			for (int j = numOfSpaces; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < numOfStars; k++) {
				System.out.print(theSymbol);
			}
			System.out.print("\n");
		}
	}

	public static void loopSeriesofSymbols(String theSymbol, int numOfLines, int numOfStars, int numToInDecrementby,
			String symbolBefore, String symbolAfter, String symbolBetween) {
		for (int i = 0; i < numOfLines; i++, numOfStars--) {
			for (int j = 0; j < numOfStars; j++) {
				System.out.print(theSymbol);
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		MoreLoopingApp.loopSeriesofSymbols("*", 6, 6, 1, "", "", "");
		MoreLoopingApp.loopSeriesofSpacesSymbols("*", 6, 5, 1, 1, "", "", "");
	}
}
