package Polimorphism;

public class RepeatedAChar {
 public void method(String str,char c) {
	 int count =0;
	 char[] chararr=str.toCharArray();
	 for(int i=0;i<str.length();i++) {
		 if(chararr[i]==c) {
			 count++;
		 }
	 }
	 System.out.println("count of "+c+"is "+count);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedAChar aChar=new RepeatedAChar();
		aChar.method("aba", 'a');
	}

}
