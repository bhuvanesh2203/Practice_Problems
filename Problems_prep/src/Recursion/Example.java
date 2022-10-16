package Recursion;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m(1);
	}
	static void m(int n) {
		
		System.out.println(n);
		m(n+1);
	}

}
