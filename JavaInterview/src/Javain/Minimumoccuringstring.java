package Javain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Minimumoccuringstring {
	public static void main(String args[]) {
		
	
String str ="bbbbhhhuuuvva ";
Map<Character, Integer> m1=new HashMap<Character,Integer>();
  str=str.replaceAll("\\s", "");
 System.out.println(str);
 
 char s[]=str.toCharArray();
 for(char c:s) {
	 
	 if(m1.containsKey(c)) {
		 m1.put(c, m1.get(c)+1);
	 }
	 else {
		m1.put(c, 1);
	}
 }
 Set<Entry<Character, Integer>> s1=m1.entrySet();
 
 int mincount=Integer.MAX_VALUE;
 System.out.println(mincount+"   :ha");
 char minchar=0;
 for(Entry<Character, Integer> map:s1) {
	 System.out.println(map.getValue());
	 if(map.getValue()<mincount) {
		 minchar=map.getKey();
		 System.out.println("11111111");
		 mincount=map.getValue();
	 }
 }
 System.out.println(minchar+"   "+mincount);
 
 
}
}