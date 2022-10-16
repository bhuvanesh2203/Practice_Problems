package javabasics;

public class Static {
	int a=3;
	static int b=6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static aStatic=new Static();
		b=7;
		System.out.println(Static.b);
		staticmethod();
		System.out.println(aStatic.a);
		aStatic.nonstatic();

	}

	
	public void nonstatic() {
		System.out.println("nonstatic");
		
	}
	public static void staticmethod() {
		System.out.println("static method");
	}
}
