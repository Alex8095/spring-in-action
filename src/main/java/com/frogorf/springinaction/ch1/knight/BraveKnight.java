/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

/** @author Tsurkin Alex
 * @version */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	/* (non-Javadoc)
	 * 
	 * @see org.springinaction.chapter1.Knight#embarkOnQuest() */
	public void embarkOnQuest() {
		quest.embark();
	}
}