package newSuit;

import org.testng.annotations.Test;

public class candle {
 public static void main(String args[]) {
	 int arr[]=new int[] {4,13,6,9,2};
	 int n=arr.length;
	 System.out.println(cout(arr,n));
 }
 public static int cout(int arr[],int n) {
	 //Start your function here
	 int cnt=0;
	 for(int i=0;i<n;i++) {
		 for(int j=i+1;j<n;j++) {
			 for(int k=j+1;k<n;k++) {
				 if(arr[i]>arr[j] && arr[j]>arr[k]) {
					 cnt+=1;
				 }
			 }
		 }
	 }
	return cnt; 
 }

}

