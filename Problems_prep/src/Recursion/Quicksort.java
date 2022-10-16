package Recursion;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
m1(a,0,a.length-1);
System.out.println(Arrays.toString(a));
	}
	
	static void m1(int a[], int low,int high) {
		int s=low;
		int e=high;
		int m=s+(e-s)/2;
		int  pivot=a[m];
		if(low>=high) {
			return;
		}
		
		while(s<=e) {
			System.out.println(a[s]+":"+a[e]);
			while(a[s]<pivot) {
				s++;
			}
			while(pivot<a[e]) {
				e--;
			}
			
			if(s<=e) {
				int temp=a[s];
				a[s]=a[e];
				a[e]=temp;
				s++;
				e--;
			}
			m1(a, low, e);
			m1(a, s, high);
		}
		
	}

}
