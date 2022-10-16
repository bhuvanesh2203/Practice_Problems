package Recursion;

public class Count0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=m1(1001);
System.out.println(m1(100010));
	}
  static int m1(int n) {
	  int count=0;
	  return help (n, count);
  }
  static int help(int n, int count) {
	  if(n==0) {
		  return count;
	  }
	  
	  int rem=n%10;
	  if(rem==0) {
		  return help(n/10, count+1);
	  }
	  return help(n/10, count);
  }
}
