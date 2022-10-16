package Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string="bhuvanesh";
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
      Set<Entry<Character, Integer>> s2=m1.entrySet();
      for(Entry<Character, Integer> m3:s2) {
    	  System.out.println(m3.getKey()+":"+m3.getValue());
      }
      System.out.println(m1.get('a'));
      
	}

}
