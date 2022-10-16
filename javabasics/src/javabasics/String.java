package javabasics;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		java.lang.String str1= "abcbc";
		char a[]=str1.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
			 count = 1;  
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					
				}
			}
			  if(count > 1 )  
				 
		             System.out.println(a[i]);  
		     }
			
		}
	
	String string="dddd";
	m1;
	m2;
		
	     
		

	}


