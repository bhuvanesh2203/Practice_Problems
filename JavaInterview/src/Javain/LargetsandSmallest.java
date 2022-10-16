package Javain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargetsandSmallest {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,3,4,8,0,-1,5,7,7};
         int b[]=new int[a.length];
         b=a;
       
        
         
         
      
         int largest=b[0];
         int smallest=b[0];
           
           for( int j = 1;j<b.length;j++) {
        	   if(b[j]>largest) {
        		   largest=b[j];
        	   }
        	   else if (b[j]<smallest) {
        		   smallest=b[j];
    			
    		}
           }
           
           System.out.println("latgest"+largest);
           System.out.println("small"+smallest);
         
   
	}

}
