/**
 * 
 */
package com.frogorf.springinaction.ch3;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

/** @author Tsurkin Alex
 * @version */
public class TigerReplacer implements MethodReplacer {

	/* @see
	 * org.springframework.beans.factory.support.MethodReplacer#reimplement(
	 * java.lang.Object, java.lang.reflect.Method, java.lang.Object[]) */
	public Object reimplement(Object target, Method method, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		return "A foerocious tiger";
	}

}
