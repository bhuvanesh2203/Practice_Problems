package Javain;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Maxchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String string="bbhhuua";int macount=0;
     char maxchar=0;
     char c[]=string.toCharArray();
     Map<Character, Integer> m1=new HashMap<Character,Integer>();
     for(char c1:c) {
    	 if(m1.containsKey(c1)) {
    		 m1.put(c1, m1.get(c1)+1);
    	 }
    	 else {
			m1.put(c1, 1);
		}
     }
    // Set<Character> s2=m1.keySet();
     
     
     int temp=0;
     
       Set<java.util.Map.Entry<Character, Integer>> s1=m1.entrySet();
       
       for(java.util.Map.Entry<Character, Integer> entry:s1) {
    	   
		if(entry.getValue()>macount) {
    		   //temp=entry.getValue();
    		   
			macount=entry.getValue();
    		   maxchar=entry.getKey();
    		   
    	   }
		
       }
       System.out.println(maxchar+":"+macount);
     
     
	}

}
