package Javain;

public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=5256;
         int num=0;
         while(a!=0) {
        	 num= num*10+a%10;
        	 a=a/10;
         }
         System.out.println(num);
	}

}
