package DataStructure;

import java.util.Arrays;



public class TwoStack {
    
    
    public static int twostack(int maxSum,int a[], int[] b, int count) {
        return helpMethod( maxSum, a,  b,0,  count-1);
    }
    
    

  private static int helpMethod(int maxSum, int[] a, int[] b, int countsum,int count) {
        // TODO Auto-generated method stub
      if(countsum >maxSum) {
          return count;
      }
      if(a.length==0 || b.length==0) {
          return count;
      }
      int ans1= helpMethod(maxSum, Arrays.copyOfRange(a, 1, a.length), b, countsum+a[0],count+1);
      int anss= helpMethod(maxSum,a,  Arrays.copyOfRange(b, 1, b.length), countsum+b[0],count+1);
      
      return Math.max(ans1, anss);
    }



public static void main(String args[]) {
      int a[]= {4,2,4,6,1};
      int b[]= {2,1,8,5};
      System.out.println(twostack(10,a,b,0));
      
  }
}
