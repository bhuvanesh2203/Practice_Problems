package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	
	public static String test( List<Integer> a,int no_ , int index) {   //14 1 2 6 8 1
		int sum1=0;
  //		if(no_%2!=0) {
	//		sum1+=a.get(a.size()/2);
//		}
//		sum1+=a.get(index);
	//	a.remove(index);
		int temp=0,k;
		
		for( k=0;k<a.size()-1;k++) {  
			if(index==a.get(k)) {
				temp=k;
			}
		}
		
		
		System.out.println("Index"+index);
		index=k;
		
		
		for(int i=0;i<index;i++) {  // 1
			sum1+=a.get(i);
		}
		System.out.println("sum1:"+sum1);
		int sum2=0;
		for(int j=(a.get(index));j<=a.size()-1;j++) { //2
			     //2
			sum2+=a.get(j);
			
		}
		System.out.println("sum2:"+sum2);
		if(sum1==sum2) {
			return "true";
		}
		else {
			return "false";
		}

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[]= {3,6,8,1,3,13};  1 2 3 4 5
		Scanner scanner=new Scanner(System.in);  
		int no_=scanner.nextInt();
		List<Integer> a = new ArrayList<Integer>(); 
	//	int a[]=new int[6];
		for(int i=0;i<no_;i++) {
			//a[i]=scanner.nextInt();
			a.add(scanner.nextInt());
		}
		System.out.println(Test1.test(a, no_,1));
	
	}

}

//14 1 2 6 8 1
