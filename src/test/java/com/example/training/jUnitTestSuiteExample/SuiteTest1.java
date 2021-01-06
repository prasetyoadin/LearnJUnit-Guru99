package com.example.training.jUnitTestSuiteExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.training.common.JUnitMessage;

public class SuiteTest1 {

	public String message = "Sarp Adi";
	
	JUnitMessage junitMessage = new JUnitMessage(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJunitMessage() {
		
		System.out.println("Junit Message is printing ");
		junitMessage.printMessage();
	}
	
	@Test
	public void testJunitHiMessage() {
		
		message = "Hi! " + message;
		System.out.println("Juni Hi Message is printing");
		assertEquals(message, junitMessage.printHiMessage());
		
	}
	
}
