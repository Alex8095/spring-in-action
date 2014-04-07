/**
 * 
 */
package com.frogorf.springinaction.ch1.springdol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frogorf.springinaction.ch1.knight.Performer;

/** @author Tsurkin Alex
 * @version */
public class InstrumentMain {

	/** @param args */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:ch1/instrument.xml");

		Performer performer = (Performer) context.getBean("kenny");
		performer.perform();

	}

}
