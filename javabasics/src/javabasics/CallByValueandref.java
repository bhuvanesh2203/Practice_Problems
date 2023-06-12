package javabasics;

import Polimorphism.interfacecar;

public class CallByValueandref {
	int a=20;
	int b=40;
	int c=9;
	public static void main(String[] args) {
		CallByValueandref callByValueandref=new CallByValueandref();
		callByValueandref.sum();
		callByValueandref.a=30; 
		callByValueandref.b=70;
		callByValueandref.swap(callByValueandref); 
		
	
		
		
		
		

	}
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(" sum is "+c);
		
	}
	
	public void swap(CallByValueandref f) {
		f.a=f.b+f.a;//70+30=100 a=100
		f.b=f.a-f.b; // 100-30  b=70
		f.a=f.a-f.b;    //a=30
		System.out.println(f.a+" and "+f.b);
		
		
	}

}
