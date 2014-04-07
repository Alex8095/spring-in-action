/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Tsurkin Alex
 * @version */
public class KnightMain {

	/** @param args */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ch1/knight.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();

	}

}
