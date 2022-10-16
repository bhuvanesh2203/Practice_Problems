package Javain;

public class SeperateCharnumandSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String string="bhuvanesh123@#!";
         String num="";
         String alpahaString="";
         String special="";
         char c[]=string.toCharArray();
         for(char c1:c) {
        	 if(Character.isAlphabetic(c1)) {
        		 alpahaString=alpahaString+c1;
        	 }
        	 else if (Character.isDigit(c1)) {
        		 num=num+c1;
				
			}
        	 else {
				special=special+c1;
			}
         }
         
         System.out.println(alpahaString);
         System.out.println("_________");
         System.out.println(num);
         System.out.println("_________");
         System.out.println(special);
	}

}
