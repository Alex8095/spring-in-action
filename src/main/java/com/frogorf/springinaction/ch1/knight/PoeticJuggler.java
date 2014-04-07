/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

/** @author Tsurkin Alex
 * @version */
public class PoeticJuggler extends Juggler {

	private Poem poem;

	/** @param poem */
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	/** @param poem */
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
	}

	public void perform() {
		super.perform();
		System.out.println("while reciting ...");
		poem.recite();
	}

}
