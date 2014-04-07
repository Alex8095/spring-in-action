/**
 * 
 */
package com.frogorf.springinaction.ch3;

import com.frogorf.springinaction.ch1.knight.Performer;

/** @author Tsurkin Alex
 * @version */
public class Magician implements Performer {

	private MagicBox magicBox;
	private String magicWords;

	/** @param magicBox the magicBox to set */
	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}

	/** @param magicWords the magicWords to set */
	public void setMagicWords(String magicWords) {
		this.magicWords = magicWords;
	}

	/* @see com.frogorf.springinaction.ch1.knight.Performer#perform() */
	public void perform() {
		System.out.println(magicWords);
		System.out.println("the maic box contains....");
		System.out.println(magicBox.getContents());
	}

}
