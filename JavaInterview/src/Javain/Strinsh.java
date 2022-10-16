package Javain;

import java.util.Scanner;

public class Strinsh {
	public static void main(String[] args) {
	
	String string="Anu.123";
	String replacedString=string.replaceAll("[^a-zA-Z0-9]", "");
	if(string.charAt(0)=='.'||string.charAt(string.length())=='.') {
		System.out.println(string+"is in valid");
		
	}
	
	}
}
