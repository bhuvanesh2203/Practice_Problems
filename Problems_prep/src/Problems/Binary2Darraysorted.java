package Problems;

import java.util.Arrays;


public class Binary2Darraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
System.out.println( Arrays.toString(search(a, 9))   );
System.out.println( Arrays.toString(searchsim(a, 5))   );
	}
	static int[] binary(int matrix[][],int row,int start,int end,int target ) {
		
		while(start<=end) {
			int m=start+(end-start)/2;
			if(matrix[row][m]==target) {
				return new int[] {row,m};
			}
			else if (target>matrix[row][m]) {
				 start=m+1;
			}
			else {
				end=m-1;
			}
		}
		
		
		return new int [] {-1,-1};
	}
     static int[] search(int matrix[][],int target) {
    	 int row=matrix.length;
    	 int col= matrix[0].length;
    	 if(col==0) {
    		 return new int[] {-1,-1};
    	 }
    	 if(row==1) {
    		 return binary(matrix, 0, 0, col-1, target);
    	 }
    	 int rstart=0;
    	 int rend=row-1;
    	 int mcol=col/2;
    	 int m;
    	 
    	 while(rstart<(rend-1))
    	 {
    		  m= rstart+(rend-rstart)/2;
    		 if(matrix[m][mcol]==target) {
    			 return new int[] {m,mcol};
    		 }
    		 if(target>matrix[m][mcol]) {
    			 rstart=m;
    		 }
    		 else {
				rend=m;
			}
    		 
    		 
    		 
    	 }
    	 
    	 if (matrix[rstart][mcol] ==target) {
			return new int[] {rstart,mcol};                             // 1 2 3 
			                                                            // 4 5 6 
		}
    	 if(matrix[rstart+1][mcol]==target) {
    		 return new int[] {rstart+1,mcol};
    	 }
    	 if(target>=matrix[rstart][mcol+1] && target<=matrix[rstart][col-1]  ) {
    		 return binary(matrix, rstart, mcol+1, col, target);
    	 }
    	 if(target>=matrix[rstart+1][mcol+1] && target<=matrix[rstart+1][col-1]  ) {
    		 return binary(matrix, rstart+1, mcol+1, col, target);
    	 }
    	 //ok
    	 if(target<=matrix[rstart][mcol-1] ) {
    		 return binary(matrix, rstart, 0, mcol-1, target);
    	 }
    	 
    	 if(target<=matrix[rstart+1][mcol-1] && target>=matrix[rstart][col-1]  ) {
    		 return binary(matrix, rstart+1, 0, mcol-1, target);
    	 }
    	 return new int[] {-1,-1};
     }
     
     
     //  1 2 3   
     //  4 5 6
     //  7 8 9
     static int[]  searchsim(int matrix[][],int target) {
    	 int row=0;
    	 int col=matrix[0].length-1;
    	 while(row<matrix.length && col>=0) {
    		 if(matrix[row][col]==target) {
    			 return new int[] {row,col};
    		 }
    		 if(target<matrix[row][col]) {
    			 col--;
    		 }
    		 else {
				row++;
			}
    		 
    	 }
    	 
    	 return new int[] {-1,-1};
     }
}
