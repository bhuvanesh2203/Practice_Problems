package backtracking;


public class Nknights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b[][]=new boolean [4][4];
nknight(b, 0, 0, 4);
	}
	
	
	
	
	static void nknight(boolean b[][],int r,int c,int knight) {
		if(knight==0) {
			dispay(b);
			System.out.println();
			return;
		}
		
		if(r==b.length-1 && c==b[0].length) {
		//
			return;
		}
		
		if(c==b[0].length) {
			nknight(b, r+1, 0, knight);
			return;
		}
		if(isSafe(b, r, c)) {
			b[r][c]=true;
			nknight(b, r, c+1, knight-1);
			b[r][c]=false;
		}
		nknight(b, r, c+1, knight);
		
		
		
	}
	
	static boolean isSafe(boolean b[][],int r ,int c) {
		
		if(check(b, r-2, c+1)) {
			if(b[r-2][c+1]) {
				return false;
			}
		}
		if(check(b, r-2, c-1)) {
			if(b[r-2][c-1]) {
				return false;
			}
		}
		if(check(b, r-1, c+2)) {
			if(b[r-1][c+2]) {
				return false;
			}
		}
		if(check(b, r-1, c-2)) {
			if(b[r-1][c-2]) {
				return false;
			}
		}
		return true;
	}
	
	static void dispay(boolean b[][]) {
		for(boolean b1[]:b) {
			for (boolean eleement:b1 ) {
				if(eleement) {
					System.out.print("K ");
				}
				else {
					System.out.print("X ");
				}
			}
			System.out.println();
		}
	}
	static boolean check(boolean b[][],int r ,int c) {
		if(r>=0 && r<b.length && c>=0 && c<b.length) {
			return true;
		}
		else {
			return false;
		}
	}

}
