/**
 * 
 */
package com.frogorf.springinaction.ch1.springdol;

import java.util.Collection;
import java.util.Iterator;

import com.frogorf.springinaction.ch1.knight.Performer;

/** @author Tsurkin Alex
 * @version */
public class OneManBand implements Performer {

	private Collection<Instrument> instruments;

	public OneManBand() {
	}

	/** @param instruments the instruments to set */
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	/* @see com.frogorf.springinaction.ch1.knight.Performer#perform() */
	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}
}
