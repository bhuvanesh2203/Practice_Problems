package Javain;

import java.util.*;

public class BiggestandSmallesteleemntinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {1,3,4,6,2,1,45};
         Arrays.sort(a);
         for(int a1:a) {
        	 System.out.print(a1+" ");
        	 
        }
         System.out.println();
         
         System.out.println("______");
         
         int b[]= {1,3,4,6,2,1,45};
         
         int temp=0;
         for(int i=0;i<b.length;i++) {
        	 for (int j = i+1; j < b.length; j++) {
				if(b[i]<b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}
         }
         for(int b1:b) {
        	 System.out.print(b1+" ");
         }
 System.out.println();
         
         System.out.println("______");
         for(int i=0;i<b.length;i++) {
        	 for (int j = i+1; j < b.length; j++) {
				if(b[i]>b[j]) {
					temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}
         }
         for(int b1:b) {
        	 System.out.print(b1+" ");
         }
	}

}
