package test;

public class ApowB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=3;
  int b=3;
  int ans = 1;
    while(b>0) {
    if(( b&1)==1) {
    	ans*=(b & 1)*a;
    
    }
	a*=a;
	b=b >>1;
    	 
    			
    			 System.out.println(b);
    }
    System.out.println("ans"+ans);
	}

}
