package Sorting;

import java.util.Arrays;

public class Cyclicsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,1,5,6,3,8,7,2,4,};
		//  1,7,2,3,5,6,4
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=i+1) {
				System.out.println(a[i]);//6 != 3
				//System.out.println(a[a[i]-1]);
				swap(a, i, a[i]-1);    //5  . 
				if((a[i])!=i+1) {
					swap(a, i, a[i]-1); 
				}
			}
			else {
				continue;
			}
		}
		
		System.out.println(Arrays.toString(a));

	}
	static void swap(int a[],int source,int target) {
		int temp=a[source];
		a[source]=a[target];
		a[target]=temp;
	}

}
