package backtracking;

import java.util.Iterator;



public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  boolean b[][]=new boolean[4][4];
  ways(b, 0);
System.out.println(ways(b, 0));
	}
	
	static int ways(boolean b[][],int row) {
		if (row==b.length) {
			dispay(b);
			System.out.println();
			return 1;
		}
			int count=0;
		 
			for (int j = 0; j < b[0].length; j++) {
				 if(check(b, row, j)) {
					 b[row][j]=true;
					 count=count+ways(b, row+1);
				 b[row][j]=false;
				 }
			}
		
			
		
		return count;
	}
	
	static void dispay(boolean b[][]) {
		for(boolean b1[]:b) {
			for (boolean eleement:b1 ) {
				if(eleement) {
					System.out.print("Q");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
	
	static boolean check(boolean b[][],int r,int c) {
		//check for straight line
		for(int i=0;i<r;i++) {
			if(b[i][c]) {
				return false;
			}
		}
			//check for the left diagonal
		 int minleft=Math.min(r, c);
		 for (int j = 1; j <=minleft; j++) {
			  if(b[r-j][c-j]) {
				  return false;
			  }
		}
		 
		 //check for right diagonal
		 int minright=Math.min(r,b.length-c-1 );
		 for (int k = 1; k <= minright; k++) {
			if(b[r-k][c+k]) {
				return false;
			}
		}
			
		
		
		
		
		
		return true;
	}

}
