/**
 *   File Name: MoreLoopsTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

import com.sqa.gy.helpers.*;

/**
 * MoreLoopsTest tests MoreLoops.java
 *
 * @author Yakovenko, Galina
 */
public class MoreLoopsTest {

	@Test
	public void test() {
		AppBasics.printSubtractingEachLoopFor(10, 5, 1, "", "", ", ");

		AppBasics.printAddingingEachLoopFor(0, 5, 1, "[", "]", "");

		AppBasics.printDividingEachLoopFor(1000, 8, 5, "", "", "<<<");

		AppBasics.printDividingEachLoopFor(-9999, -1111, 3, "", "", "{{{{");

		MoreLoopingApp.loopSeriesofSymbols("*", 6, 6, 1, "", "", "");

	}
}
