package Problems;

public class longestcommonsubstring {
	static int m1(String s1,String s2,int n,int m,int count) {
		if(n==0||m==0) {
			return 0;
		}
		if(s1.charAt(n-1)==s2.charAt(m-1)) {
			return m1(s1, s2, n-1, m-1, count+1);
		}
		
		int c1=m1(s1, s2, n-1, m, 0);
		int c2=m1(s1, s2, n, m-1, 0);
		return Math.max((Math.max(c1, c2)),count);
	}
	
	static int longestpalindromesubstring(String s1,int start,int end) {
		int remcount=0;
		if(start==end) {
			return 1;
		}
		if(start>end) {
			return 0;
		}
		if(s1.charAt(start+1)==s1.charAt(end-1)) {
			remcount=end-start-1;
			if (remcount==longestpalindromesubstring(s1, start+1, end-1)) {
				return 2+remcount;
				
			}
		}
		return  Math.max(longestpalindromesubstring(s1, start+1, end),longestpalindromesubstring(s1, start, end-1));
	}
	static int LongestPalindromeSequence(String s1, int start,int end) {
		int remcount=0;
		if(start==end) {
			return 1;
		}
		if(start>end) {
			return 0;
		}
		if(s1.charAt(start+1)==s1.charAt(end-1)) {
			return 2+LongestPalindromeSequence(s1,start+1,end-1);
		}
		
		return  Math.max(longestpalindromesubstring(s1, start+1, end),longestpalindromesubstring(s1, start, end-1));
	}
	
	static int mincrcttoeq(String s1,String s2,int n,int m) {
		int a[][]=new int[n+1][m+1];
		if(n==m) {
			return 0;
		}
		if(n==0) {
			return m;
		}
		if(m==0) {
			return n;
		}
		for(int i=0;i<=n;i++) {
			a[0][i]=i;
		}
		for(int j=0;j<=m;j++) {
			a[j][0]=j;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=a[i-1][j-1];
				}
				else {
					a[i][j]=1+Math.min(Math.min(a[i-1][j-1], a[i][j-1]),a[i-1][j]);
				}
			}
		}
		return a[n][m];
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
