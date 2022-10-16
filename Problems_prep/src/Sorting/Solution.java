package Sorting;

import java.util.Arrays;

class Solution {
    public static int firstMissingPositive(int[] a) {
        int i=0;
        while(i<a.length){
            if(a[i]>0  && a[i]<=a.length && a[i] != a[a[i]-1]){
                
                swap(a,i,a[i]-1);
            }
            else{
                i++;
            }
        } System.out.println(Arrays.toString(a));
        
        for(int j=0;j<a.length;j++){
            if(a[j]!=j+1){
                return j+1;
            }
        }
      
        
       
        return a.length+1;
    }
    
    static  void swap(int a[],int source,int target){
        int temp=a[source];
        a[source]=a[target];
        a[target]=temp;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,-1,1};
		System.out.println(firstMissingPositive(a));
		
		
    }
}