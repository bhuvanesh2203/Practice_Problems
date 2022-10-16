package Problems;

public class Longcommonsubstring {

	static int m1(String s1,String s2,int m,int n,int count) {
		if(m==0 || n==0) {
			return count;
		}
		if(s1.charAt(m-1) == s2.charAt(n-1)) {
			count=m1(s1,s2,m-1,n-1,count+1);
		}
		int count1=m1(s1, s2, m, n-1, 0);
		int count2=m1(s1, s2, m-1, n, 0);
		return Math.max(count,Math.max(count1, count2));
	}
	
	
	static int m2(String s1,String s2,int m,int n) {
		if(m==0 || n==0) {
			return 0;
		}
		int count=0;
		int a[][]=new int[m+1][n+1];
		//int a2[]=new int[n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=1+a[i-1][j-1];
					count=Math.max(a[i][j], count);
				}
				else {
					a[i][j]=0;
				}
				//count=Math.max(a[i][j], count);
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String X = "OldSite:GeeksforGeeks.org";
		 char s1[]=X.toCharArray();
	        String Y = "NewSite:GeeksQuiz.com";
	        char s2[]=Y.toCharArray();
	        System.out.println("________start__________");
	        //System.out.println(m1(X, Y, X.length(), Y.length(), 0));
	        System.out.println(m2(X, Y, X.length(), Y.length()));
	        System.out.println("__________________");
	}

}
