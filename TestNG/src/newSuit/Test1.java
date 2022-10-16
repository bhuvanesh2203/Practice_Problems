package newSuit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="This is repeated is repeated";
		String string1[]=string.split(" ");
     Map< String, Integer> m1=new HashMap<String,Integer>();
     for(String a:string1) {
    	 if(m1.containsKey(a)) {
    		 m1.put(a, m1.get(a)+1);
    	 }
    	 else {
			m1.put(a, 1);
		}
     }
     Set<String> set=m1.keySet();
     for(String a1:set) {
    	 if(m1.get(a1)>1) {
    		 System.out.println(a1+":"+m1.get(a1)+"");
    	 }
     }
	}

}
