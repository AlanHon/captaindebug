package com.captaindebug.producerconsumer.original;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Producer Consumer Demo Code...");
		new ClassPathXmlApplicationContext("context.xml");
	}
}
