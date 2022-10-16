package Recursion;

public class reverseaNUM {
public static void main(String args[]) {
	System.out.println(m1(123456789));
}
	
	static int m1(int n) {
		int digit =(int)(Math.log10(n))+1;
		return help(n, digit);

	}
	
	
	static int help(int n,int digit) {
		if(digit==1) {
			return n;
		}
		int rem=n%10;
		return rem*(int)Math.pow(10, digit-1)+help(n/10, digit-1);
	}
}
