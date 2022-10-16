package Javain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Duploicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="abcsab";
            char a[]=s.toCharArray();
            Set<Character> set1=new HashSet<Character>();
            for(char a1 :a) {
            	if(set1.add(a1)==false) {
            		System.out.println("duplicate is "+a1);
            	}
            }
            int[] a5= {1,3,4,8,0,-1,5,7,7};
            Set<Integer> set2=new HashSet<Integer>();
    		Arrays.sort(a);
    		  for(int b :a5) {
              	if(set2.add(a5[b])==false) {
              		System.out.println("duplicate is "+a5[b]);
              	}
              }
            Iterator<Integer> it =set2.iterator();
            int n=0;
            int correct[]=new int[a5.length];
            while(it.hasNext()) {
            	correct[n]=it.next();
            	n++;
            	
            }
         
	}

}
