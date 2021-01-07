package com.example.training.jUnitTestExpectedExample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.training.common.JUnitMessageArithmatic;

public class ArithmaticTest {

	public String message = "Sarp Adi";
	
	JUnitMessageArithmatic junitMessage = new JUnitMessageArithmatic(message);
	
	@Test(expected = ArithmeticException.class)
	public void testJUnitMessage() {
		System.out.println("Junit Message is printing");
		junitMessage.printMessage();
	}
	
	@Test
	public void testJUnitHiMessage() {
		message = "Hi! " + message;
		System.out.println("Junit Hi Message is printing");
		assertEquals(message, junitMessage.printHiMessage());
	}
}
