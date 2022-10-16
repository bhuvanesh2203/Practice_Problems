package Javain;

import java.util.Iterator;

public class Treepattern {
	static int m1(String word) {
		if(word == null || word.length() == 0) {
	        return 0;
	    }

	    int[] count = new int[26];
	    for(char ch : word.toCharArray()) {
	        count[ch - 'a']++;
	        System.out.println(ch-'a');
	    }

	    int oddcount = 0;
	    for(int i=0; i<26; i++) {
	        if(count[i] % 2 != 0) {
	            oddcount++;
	        }
	    }

	    return oddcount - 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++) {
        	for(int k=3;k>=i;k--) {
        		System.out.print(" ");
        	}
        	for(int m=1;m<=i;m++) {
        		System.out.print(" *");
        	}
        	System.out.println();
        }
        System.out.println(m1("abc"));
        
        int c[]=new int[10];
        System.out.println(c[0]++);
        System.out.println(c[0]);
        static {
        	
        }
	}

}
