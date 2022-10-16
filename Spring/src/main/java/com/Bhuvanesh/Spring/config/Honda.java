package com.Bhuvanesh.Spring.config;

import org.springframework.stereotype.Component;

@Component
public class Honda implements BikeInterface {
	public void model() {
		System.out.println("CBR 650R");

	}

}
