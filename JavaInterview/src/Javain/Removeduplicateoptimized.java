package Javain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Removeduplicateoptimized {
	public static void main(String[] args) {
		int[] a= {1,3,4,8,0,-1,5,7,7,7,7,4,3,2,21,1};
		Arrays.sort(a);
		
		
		/*
		 * int temp[]=new int[a.length]; int j = 0;//for next element for (int i=0; i <
		 * a.length-1; i++){ if (a[i] != a[i+1]){ a[j++] = a[i]; } } a[j++] =
		 * a[a.length-1]; for(int k = 0;k<a.length;k++) { System.out.print(a[k]); }
		 */
		/*int count=0;
		int b[]=new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(b[count]!=a[i] ) {
					b[count++]=a[i];
				}
			}
		}
		for(int m=0;m<b.length;m++) {
			System.out.println(b[m]);*/
		int j=0;
		int temp[]=new int[a.length];
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[a.length-1];
		for(int m=0;m<j;m++) {
			System.out.println(temp[m]);
	}}
}
