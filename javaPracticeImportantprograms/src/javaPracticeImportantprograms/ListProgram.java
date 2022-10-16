package javaPracticeImportantprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListProgram {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,1,2));
		Set<Integer> s1=new HashSet<Integer>();
		s1.addAll(l1);
		l1.clear();
		l1.addAll(s1);
		for(int s:l1) {
			System.out.println(s);
		}
	}
}
