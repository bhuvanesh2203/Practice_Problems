package Sorting;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {5,-99,-0,0,10000,Integer.MAX_VALUE};
           insertsort(a);
           System.out.println(Arrays.toString(a));
	}
	static void insertsort(int a[]) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j >0; j--) {
				if(a[j-1]>a[j]) {
					System.out.println(a[i]+"j"+a[j]);
					swap(a, j-1, j);
				}
				else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
  static void swap(int a[],int sorurce,int target) {
	  
	  int temp=a[sorurce];
		a[sorurce]=a[target];
		a[target]=temp;
	// TODO Auto-generated method stub

}
}
