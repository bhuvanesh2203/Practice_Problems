package Sorting;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Automation testing and manua testing";
		String a1[]=s.split(" ");
		swap(a1,0,1);
		swap(a1,3,4);
		String temp="";
		for(String s2:a1){
		    temp+=s2+" ";

		}
		 System.out.println(temp.trim());
		 
		 String rString="a";
		 String rString1="a";
		 System.out.println(rString==rString1);
		 String bvString="   bhu ava ";
		 Set <Character> s1=new HashSet<Character>();
		 s1.s
		 System.out.println(bvString.strip());
	}

static void swap(String a[],int source,int target){

String temp= a[source];
a[source]=a[target];
a[target]=temp;
}
   
}
