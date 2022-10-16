package Recursion;

import java.util.ArrayList;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Find three elements in an array that sum to a zero
		
		int a[]= {-1,2,1,-3,5};
		int sum=0;
		ArrayList <Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<a.length-2;i++) {
			for (int j = i; j < i+3; j++) {
				sum +=a[j];
				System.out.println("sum"+sum);
				
			}
			if(sum==0) {
				l1.add(i);
				l1.add(i+3);
			}
			sum=0;
			
		}
	  System.out.println(l1);
	}
  // INSERT INTO (parm1,param2) 
}
