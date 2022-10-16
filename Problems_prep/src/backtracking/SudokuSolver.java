package backtracking;

import java.util.Iterator;



public class SudokuSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = new int[][]{
             {3, 0, 6, 5, 0, 8, 4, 0, 0},
             {5, 2, 0, 0, 0, 0, 0, 0, 0},
             {0, 8, 7, 0, 0, 0, 0, 3, 1},
             {0, 0, 3, 0, 1, 0, 0, 8, 0},
             {9, 0, 0, 8, 6, 3, 0, 0, 5},
             {0, 5, 0, 0, 9, 0, 6, 0, 0},
             {1, 3, 0, 0, 0, 0, 2, 5, 0},
             {0, 0, 0, 0, 0, 0, 0, 7, 4},
             {0, 0, 5, 2, 0, 6, 3, 0, 0}
     };
     if (solve(a)) {
		display(a);
	}
     else {
		System.out.println("not possble");
	}
     
    int  test='5'-'0';
    char n1='.';
    if(n1=='.') {
    	System.out.println( "check");
    	System.out.println('.'-',');
    }
     System.out.println(test);
     
	}
	
	
	static boolean solve(int a[][]) {
		int n=a.length;
	   int row=-1;
	   int col=-1;
	   boolean safe=true;
	   for(int i=0;i<n;i++) {
		   for (int j = 0; j < n; j++) {
			if(a[i][j]==0) {
				row=i;
				col=j;
				safe=false;
				break;
			}
		
		}
			if(safe==false) {
				break;
			}
	   }
	   
	   if(safe==true) {
		 //  display(a);
		   return true;
	   }
	   
	   
	   for (int num = 1; num <= 9; num++) {
		   
		  if(isSafe(a, row, col, num)) {
			  a[row][col]=num;
			  if (solve(a)) {
				  return true;
			}
			  
		  
		  else {
			a[row][col]=0;
		}
	}
	   }
	   
	   return false;
	}
	
	static void display(int a[][]) {
		for(int k[]:a) {
			for (int i = 0; i < k.length; i++) {
				System.out.print(k[i]+" ");
			}
			System.out.println();
		}
	}
	
	static boolean isSafe(int a[][],int row,int col,int num) {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i][col]==num) {
				return false;
			}
			
			
		}
		
		for (int k[]:a) {
			if(k[col]==num) {
				return false;
			}
		}
		int sqroot= (int) Math.sqrt(a.length);
		int rowstart= row-row%sqroot;
		int colstart= col-col%sqroot;
		for(int r=rowstart;r<rowstart+sqroot;r++) {
			for (int c = colstart; c < colstart+sqroot; c++) {
				if(a[r][c]==num) {
					return false;
				}
			}
		}
		return true;
	}

}
