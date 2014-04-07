/**
 * 
 */
package com.frogorf.springinaction.ch3;

/** @author Tsurkin Alex
 * @version */
public class MagixBoxImpl implements MagicBox {

	public MagixBoxImpl() {

	}

	/* @see com.frogorf.springinaction.ch3.MagicBox#getContents() */
	public String getContents() {
		return "A beautiful assistant";
	}

}
