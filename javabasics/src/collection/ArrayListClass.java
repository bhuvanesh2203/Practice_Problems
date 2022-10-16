package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListClass {
	public void finalize() {
		System.out.println("cleanup");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee("Bhuvaneh", 23);
Employee e2=new Employee("Aishwayra", 25);

ArrayList<Employee> ar= new ArrayList<Employee>();
ar.add(e1);
ar.add(e2);
ArrayList<String> s1=new ArrayList<String>();
s1.add("bhuvanesh");
s1.add("Aishwarya");
//s1.remove("Aishwarya");


System.out.println("index of"+s1.indexOf("Aishwarya"));

ArrayList<Integer> s2=new ArrayList<Integer>();
s2.add(1);
s2.add(1);

System.out.println(s2);
Iterator<Employee> itr=ar.iterator();
while (itr.hasNext()) {
	Employee employee=itr.next();
	System.out.println(employee.name);
	System.out.println(employee.age);
	
}
System.gc();

	}

}
