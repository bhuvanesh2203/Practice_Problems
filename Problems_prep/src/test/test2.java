package test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
	    int n=3;
	    int base=5;
	    int ans=0;
	    System.out.println();
	    while(n>0) {
	    	int last=n &1;
	    	 ans+=last*base;
	    	 base=base*5;
	    	 n=n>>1;
	    }
	    
	    System.out.println(ans);
	    String string="ab";
	    
	   // System.out.println(string.substring(1,1));
	   System.out.println(string.indexOf("a"));
	          
	}

}
