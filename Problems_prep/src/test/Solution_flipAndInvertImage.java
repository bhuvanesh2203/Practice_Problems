package test;

import java.util.Arrays;

class Solution_flipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] a) {
        
        
       for(int row[]:a){
           for(int i=0;i<(a[0].length+1)/2;i++){
               int temp=row[i]^1;
               row[i]=row[a[0].length -1-i]^1;
               row[a[0].length -1-i]=temp;
           }
       }
        return a;
    }
    
    
    
    static void swap(int a[][],int i,int source,int target){
        int temp=a[i][source];
        a[i][source]=a[i][target];
        a[i][target]=temp;
    }
    public static void main(String args[]) {
    	int a[][]={{1,1,0},{1,0,1},{0,0,0}};
    	a=flipAndInvertImage(a);
    	System.out.println(Arrays.toString(a));
    }
}