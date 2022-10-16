package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PathsinMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count(3, 3);
System.out.println(count(3, 3));
List<String> s1=new ArrayList<>();
//pathsdiag("",3,3,s1);

boolean b[][] = {{true,true,true},
		{true,false,true},
		{true,true,true}
};
pathswithobstacke(b, "", 0, 0, s1);


System.out.println(s1);
	}
	
	static int count(int r,int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left=count(r-1,c);
		int right=count(r,c-1);
		return left+right;
	}
	
	static void paths(String pro, int r, int c,List<String> s1) {
		if(r==1 & c==1) {
			s1.add(pro);
			System.out.println(pro);
			return;
		}
		
		if(r>1) {
			paths(pro+'D', r-1, c, s1);
		}
		if(c>1) {
			paths(pro+'R', r, c-1, s1);
		}
	}
	
	static void pathsdiag(String pro, int r, int c,List<String> s1) {
		if(r==1 & c==1) {
			s1.add(pro);
			System.out.println(pro);
			return;
		}
		if(r>1 && c>1) {
			pathsdiag(pro+'f', r-1, c-1, s1);
		}
		if(r>1) {
			pathsdiag(pro+'D', r-1, c, s1);
		}
		if(c>1) {
			pathsdiag(pro+'R', r, c-1, s1);
		}
	}
	
	
	static void pathswithobstacke(boolean b[][] ,String pro, int r, int c,List<String> s1) {
		if(r==b.length-1 & c==b[0].length-1) {
			s1.add(pro);
			System.out.println(pro);
			return;
		}
		if(!b[r][c]) {
			return;
		}
		if(r<b.length-1) {
			pathswithobstacke(b,pro+'D', r+1, c, s1);
		}
		if(c<b[0].length-1) {
			pathswithobstacke(b,pro+'R', r, c+1, s1);
		}
	}

}
