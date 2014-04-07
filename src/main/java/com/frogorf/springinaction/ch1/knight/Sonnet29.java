/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

/** @author Tsurkin Alex
 * @version */
public class Sonnet29 implements Poem {

	private static String[] LINES = { "1", "2", "3", "4", "5" };

	/* @see com.frogorf.springinaction.ch1.knight.Poem#recite() */
	public void recite() {
		for (String line : LINES) {
			System.out.println(line);
		}

	}

}
