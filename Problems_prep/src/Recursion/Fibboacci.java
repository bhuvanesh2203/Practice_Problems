package Recursion;

public class Fibboacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=m1(50);
System.out.println(ans);
	}
	static int m1(int n) {
  		if(n<2) {
			return n;
		}
		return m1(n-1)+m1(n-2);
	}

}
