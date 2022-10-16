package SubsetandSubsequence;

import java.util.List;

public class PermutationsStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String aString="abc";
m1("", aString);
	}
	
	static void m1(String pro, String up) {
		if(up.length()==0) {
			System.out.println(pro);
			
			return;
		}
		
		for (int i = 0; i <= pro.length(); i++) {
			 String firString=pro.substring(0,i);
			 String laString=pro.substring(i,pro.length());
			 m1(firString+up.charAt(0), up.substring(1));
		}
	}
	
	   void m2(String pro,String up,List<String> l1){
	        
	        if(up.length()==0){
	            l1.add(pro);
	           // return l1;
	        }
	        
	        for(int i=0;i<=pro.length();i++){
	            
	            String fir=pro.substring(0,i);
	            String las=pro.substring(i,pro.length());
	             m2(fir+up.charAt(0)+las,up.substring(1),l1);
	        }
	    }

}
