/**
 * 
 */
package com.frogorf.springinaction.ch1.springdol;

import com.frogorf.springinaction.ch1.knight.Performer;

/** @author Tsurkin Alex
 * @version */
public class Instrumentalist implements Performer {

	public Instrumentalist() {

	}

	/* @see com.frogorf.springinaction.ch1.knight.Performer#perform() */
	public void perform() {
		System.out.println(song);
		instrument.play();
	}

	private String song;

	public void setSong(String song) {
		this.song = song;
	}

	/** @return the song */
	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
