package Recursion;

public class to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(m1(5));
	}
  static int m1(int n) {
	  if(n==1) {
		  System.out.println("came at last"+n);
		  return n;
	  }
	  System.out.println(n);
	  n=n-1;
	  return m1(n);
  }
}