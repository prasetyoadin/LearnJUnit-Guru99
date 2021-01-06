package com.example.training.common;

public class JUnitMessage {

	private String message;

	public JUnitMessage(String message) {
		super();
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
	
	public String printHiMessage() {
		message = "Hi! " + message;
		System.out.println(message);
		return message;
	}
	
}
