package Problems;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Regrex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
          String s1="#abc anf*";
          s1=s1.replaceAll("[^a-zA-Z0-9]", "");
          System.out.println(s1);
          int a=15;
          a=a>>2;
          System.out.println(a);
          int a1=10;
          int b1=20;
          b1=b1+a1; //20+10=30
          a1=b1-a1; //30-10=20
          b1=b1-a1;
          System.out.println(a1+","+b1);
          String m1="abc";
          String m2="def";
          m1=m1+m2; //abcdef
          m2=m1.substring(0,m1.length()- m2.length()); //abc
          m1=m1.substring(m2.length());
          System.out.println(m1+":nect:"+m2);
          
          
          System.out.println( " read the file");
          try {
			BufferedReader bufferedReader =new BufferedReader(new FileReader("C:\\Users\\Bhuvanesh\\Desktop\\textkafka.txt"));
			
			String contentString=bufferedReader.readLine();
			while(contentString!=null) {
				System.out.println(contentString);
				contentString=bufferedReader.readLine();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
          int i, j, row = 6;       
  		//Outer loop work for rows  
  		for (i=0; i<row; i++)   
  		{  
  		//inner loop work for space      
  		for (j=row-i; j>1; j--)   
  		{  
  		//prints space between two stars  
  		System.out.print(" ");   
  		}   
  		//inner loop for columns  
  		for (j=0; j<=i; j++ )   
  		{   
  		//prints star      
  		System.out.print(" *");   
  		}   
  		//throws the cursor in a new line after printing each line  
  		System.out.println();   
  		}   
  		java.lang.String str1= "abcbc";
		char arr[]=str1.toCharArray();
		int count=0;
		for(int i1=0;i1<arr.length;i1++) {
			 count = 1;  
			for(int j1=i1+1;j1<arr.length;j1++) {
				if(arr[i1]==arr[j1]) {
					count++;
					
				}
			}
			  if(count > 1 )  
				 
		             System.out.println(arr[i1]);  
		     }
          
		
		int i1=10;
		for(i1=0;i1<5;i1++) {
			
		}
		System.out.println(i1);
	} 

}
