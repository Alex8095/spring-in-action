/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

/** @author Tsurkin Alex
 * @version */
public class Stage {

	private Stage() {

	}

	private static class StageSingletonHolder {

		static Stage instance = new Stage();
	}

	public static Stage getIntance() {
		return StageSingletonHolder.instance;
	}
}
