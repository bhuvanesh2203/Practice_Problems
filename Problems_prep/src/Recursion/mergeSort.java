package Recursion;

import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {5,4,2,1,3};
  a=method(a);
  System.out.println(Arrays.toString(method(a)));
	}
	
	
	static int[] method(int a[]) {
		if (a.length==1) {
			System.out.println(Arrays.toString(a));
			return a;
			
		}
		int s=0;
		int m=a.length/2;
		int e=a.length;
		int a1[]=method(Arrays.copyOfRange( a,0, m));
		int a2[] =method(Arrays.copyOfRange(a,m, e));
				
				return mergeSort(a1,a2);
	}


	private static int[] mergeSort(int[] a,int b[]) {
		// TODO Auto-generated method stub
	
		int i = 0,j=0,k=0;
		int res[]=new int[a.length+b.length];
		while(i<a.length && j<b.length) {
			if(a[i]< b[j]) {
				res[k]=a[i];
				i++;
				k++;
			}
			else {
				res[k]=b[j];
				j++;
				k++; 
			}
		}
		while(i<a.length) {
			res[k]=a[i];i++;
			k++;
		}
		while(j< b.length) {
			res[k]=b[j];j++;
			k++;
		}
		
		return res;
	}
	
	

}
