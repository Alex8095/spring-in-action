/**
 * 
 */
package com.frogorf.springinaction.ch1.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** @author Tsurkin Alex
 * @version */
public class JugglerMain {

	/** @param args */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ch1/juggler.xml");
		Juggler juggler = (Juggler) context.getBean("duke");
		juggler.perform();
		System.out.println("Juggler end");
		PoeticJuggler poeticDuke = (PoeticJuggler) context.getBean("poeticDuke");
		poeticDuke.perform();
		System.out.println("PoeticJuggler end");

	}

}
