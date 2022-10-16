package com.Bhuvanesh.Spring.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutableClass {

	public static void main(String[] args) {
		ApplicationContext s = new ClassPathXmlApplicationContext("Springconfiguration.xml");

		BikeInterface s1 = (BikeInterface) s.getBean("KTM");
		s1.model();

	}

}
