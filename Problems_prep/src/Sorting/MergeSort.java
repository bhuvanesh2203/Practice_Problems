package Sorting;

import java.util.Arrays;

import Recursion.mergeSort;

public class MergeSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        int  a[]= {4,3,5,1,-1};
        int res[]=mergeSort(a);
        System.out.println(Arrays.toString(res));
        
        
    }
    
    public static int[] mergeSort(int a[]) {
        if(a.length==1) {
            return a;
           
        }
        int m= a.length/2;
        int left[]=mergeSort(Arrays.copyOfRange(a, 0, m));
        int right[]=mergeSort(Arrays.copyOfRange(a,m,a.length));
        return mergeFun(left,right);
        
    }

    private static int[] mergeFun(int[] left, int[] right) {
        // TODO Auto-generated method stub
        int i=0;
        int j=0;
        int k=0;
        int res[]= new int[left.length+right.length];
        while(i<left.length && j<right.length) {
            if(left[i]>right[j]) {
                res[k]=right[j];
                j++;
            }
            else {
                res[k]=left[i];
                i++;
            }
            k++;
        }
       
        
        while(i<left.length) {
            res[k++]=left[i++];
        }
        while(j<right.length) {
            res[k++]=right[j++];
        }
        
        
        return res;
    }

}
