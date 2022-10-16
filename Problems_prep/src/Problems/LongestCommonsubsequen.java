package Problems;

public class LongestCommonsubsequen {

	static int m1(String S1,String s2,int m,int n) {
		if(m==0 || n==0) {
			return 0;
		}
		if(S1.charAt(n-1)== S1.charAt(m-1)) {
			return 1 + m1(S1, s2, m-1, n-1);
		}
		
		
		return Math.max(m1(S1, s2, m-1, n),m1(S1, s2, m, n-1) );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "GXTXAYB";
	    String s2 = "AGGTAB";
	 
	    int m = s1.length();
	    int n =  s2.length();
	 
	    System.out.println("Length of LCS is" + " " +
	                                m1( s1, s2, m, n ) );
	}

}
