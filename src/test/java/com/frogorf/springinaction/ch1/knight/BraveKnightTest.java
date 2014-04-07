/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

import static org.mockito.Mockito.*;
import org.junit.Test;

/** @author Tsurkin Alex
 * @version */
public class BraveKnightTest {

	/** Test method for
	 * {@link com.frogorf.springinaction.ch1.knight.BraveKnight#embartOnQuest()}
	 * . */
	@Test
	public void testEmbartOnQuest() {
		Quest mockQuest = mock(Quest.class);

		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, timeout(1)).embark();

	}

}
