package Sorting;

import java.util.Arrays;

public class cyclickstart_video {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,4};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=a[a[i]-1]) {
				swap(a, i, a[i]-1);
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
