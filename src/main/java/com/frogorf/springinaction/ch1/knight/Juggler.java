/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

/** @author Tsurkin Alex
 * @version */
public class Juggler implements Performer {

	private int beanBags = 3;

	/**
	 * 
	 */
	public Juggler() {
		super();
	}

	/** @param veanBags */
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() {
		System.out.println("juggling " + beanBags + " beanBags");
	}

}
