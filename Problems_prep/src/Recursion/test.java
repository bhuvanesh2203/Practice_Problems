package Recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {2,6,5,7,9,10,5,2};
          int b[]= {6,6,8,10,2,1};
          ArrayList<Integer> l1=new ArrayList<Integer>();
          for(int i=0;i<a.length;i++) {
        	  for(int j=0;j<b.length;j++) {
        		  if(a[i]==b[j]) {
        			  l1.add(a[i]);
        		  }
        	  }
          }
         // System.out.println(l1);
          Set<Integer> s1=new HashSet<Integer>();
          for(int k=0;k<l1.size();k++) {
        	  s1.add(l1.get(k));
          }
          System.out.println(s1);
          System.out.println("_____________________");
          
          List<Integer> P1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
          System.out.println(P1.get(2));
          String ss="99999999999";
          BigInteger q=new BigInteger(ss);
          System.out.println(q.intValue());
          //System.out.println(o);
          
          
	}

}
