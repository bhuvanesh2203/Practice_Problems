package Recursion;

import java.util.ArrayList;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,1,3,3,4,4,4};
		ArrayList<Integer>l1=new ArrayList<Integer>();
		// TODO Auto-generated method stub
//System.out.println(m1(a, 4, 0, l1));
		 l1=m2(a, 4, 0);
		 System.out.println(l1);
	}
    static ArrayList<Integer> m1(int a[],int target,int index,ArrayList<Integer> l1){
    	if(index==a.length) {
    		return l1;
    	}
    	if(a[index]==target) {
    		l1.add(index);
    	}
    	
    	
    	return m1(a, target,index+1, l1);
    }
    
    static ArrayList<Integer> m2(int a[],int target,int index){
    	ArrayList<Integer>l1=new ArrayList<Integer>();	
    	if(index==a.length) {
    		return l1;
    	}
    	if(a[index]==target) {
    		l1.add(index);
    	}
    	
    	
    	ArrayList<Integer>l2= m2(a, target,index+1);
    	l1.addAll(l2);
    	return l1;
    }
}
