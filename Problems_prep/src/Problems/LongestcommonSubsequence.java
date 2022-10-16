package Problems;

import java.util.ArrayList;
import java.util.List;

public class LongestcommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AGGTAB";
		char c1[]=s1.toCharArray();
	    String s2 = "GXTXAYB";
	    char c2[]=s2.toCharArray();
	    List<Character> C1=new ArrayList<Character>();
	    for(char t:c1) {
	    	C1.add(t);
	    }
	    
	    List<Character> C2=new ArrayList<Character>();
	    for(char t:c2) {
	    	C2.add(t);
	    }
	    C1.retainAll(C2);
	    System.out.println(C1);
	    System.out.println(C1.size());

	}
	
	  
}
