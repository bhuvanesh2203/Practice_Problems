package com.Bhuvanesh.Springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	private static ApplicationContext s;

	public static void main(String[] args) {
		s = new ClassPathXmlApplicationContext("Spring.xml");
		
		BikeInterface s1 = (BikeInterface) s.getBean("KTM");
		s1.model();
	}

}
