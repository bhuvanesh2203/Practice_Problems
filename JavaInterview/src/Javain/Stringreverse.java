package Javain;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String string= "fuck";
         String nullsString="";
         for(int i=string.length()-1;i>=0;i--) {
        	 nullsString=nullsString + string.charAt(i);
         }
         System.out.println("reverse is "+nullsString);
         StringBuffer s=new StringBuffer(string);
         System.out.println("reverse of stringbuffer is "+s.reverse());
	}

}
