package Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ascendingorder {
	public void method(int a,int b,int c ) {
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(a);
		 list.add(b);
		 list.add(c);
	        Collections.sort(list);
	 
	        System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ascendingorder ascendingorder=new Ascendingorder();
		ascendingorder.method(1, 5, 2);
	}

}
