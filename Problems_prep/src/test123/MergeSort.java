package test123;

import java.util.Arrays;



public class MergeSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[]= {4,1,6,5,2,3};
        System.out.println(mergeRecussion(a).toString());
        System.out.println("Strinfg is"+Arrays.toString(mergeRecussion(a)));
    }
    public static int[] mergeRecussion(int a[]) {
        int s=0;
        int m=a.length/2;
     int e=a.length;
        if (a.length==1) {
           
            return a;
            
        }
       
        int res1[]=mergeRecussion(Arrays.copyOfRange(a, 0, m));
        int res2[]=mergeRecussion(Arrays.copyOfRange(a,m, e));
        
        return merge(res1, res2);
        
    }
    
    
    public  static int[] merge(int a[],int b[]) {
        int alen=a.length;
        int blen=b.length;
        int n=a.length+b.length;
        int i=0,j = 0,k=0;
        int res[]=new int [n];
        
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                res[k]=a[i];
                i++;
            }
            else {
                res[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length) {
            res[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length) {
            res[k]=b[j];
            j++;
            k++;
        }
        
        
        
        return res;
        
    }

}
