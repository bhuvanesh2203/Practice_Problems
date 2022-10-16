package javaPracticeImportantprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatedStrings {
	public static void main(String args[]) {
		String aString="abxcaddbb";
		char[]aStrings=aString.toCharArray();

		Map<Character, Integer> map1 =new HashMap<Character, Integer>();
		int count=0;
		for(char c:aStrings) {
			if(map1.containsKey(c))
			{
				map1.put(c, map1.get(c)+1);
			}
			else {
				map1.put(c, 1);
			}
		}
		
		
		
		
		
		
		
		Set <Map.Entry<Character,Integer>> entryset=map1.entrySet();
		for( Map.Entry<Character,Integer> entry :entryset) {
			if(entry.getValue()>1) {
				System.out.println("repeated element :"+entry.getKey()+" is"+entry.getValue());
			}
		}
	
		
	}

}
