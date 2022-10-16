package Problems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Sumtriplets {
	

	public static boolean triplet  (List a1,int sum) {
		List<Integer> a=new ArrayList<Integer>();
		a.addAll(a1);
		  for(int i=0;i<a.size()-2;i++) {
			  for(int j=i+1;j<a.size()-1;j++) {
				  for(int k=j+1;k<a.size();k++) {
					  if(a.get(i) + a.get(j)+ a.get(k)==sum) {
						  System.out.println("1:"+a.get(i)+" 2:"+a.get(j)+" 3:"+a.get(k));
						  return true;
						  
					  }
				  }
			  }
		  }
		
		return false;
	}
	
	public static boolean twolet  (List a1,int sum) {
		List<Integer> a=new ArrayList<Integer>();
		a.addAll(a1);
		  for(int i=0;i<a.size()-1;i++) {
			  for(int j=i+1;j<a.size();j++) {
				  
					  if(a.get(i) + a.get(j)==sum) {
						  System.out.println("1:"+a.get(i)+" 2:"+a.get(j));
						  return true;
						  
					  
				  }
			  }
		  }
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		
	//	Collection<? extends Integer> a = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        l1.add(1);
        l1.add(4);
        l1.add(45);
        l1.add(6);
        l1.add(10);
        l1.add(8);
        l1.add(11);
        l1.add(11);
       
		/*
		 * Boolean boolean1=triplet(l1,sum); if(boolean1==true) {
		 * System.out.println("found"); }else { System.out.println("not found"); }
		 */
        System.out.println("________________________");
        
        Boolean boolean2=twolet(l1,sum);
        if(boolean2==true) {
        	System.out.println("found");
        }else {
			System.out.println("not found");
		}
        

	}

}
