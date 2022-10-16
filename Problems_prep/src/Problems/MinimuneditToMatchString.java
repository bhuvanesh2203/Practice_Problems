package Problems;

import java.util.Iterator;



public class MinimuneditToMatchString {

	
	static int m1(String s1,String s2,int n,int m) {
		int a[][]=new int[n+1] [m+1];
		if (s1==s2) {
			return 0;
		}
		if(n==0) {
			return m;
		}
		if(m==0) {
			return n;
		}
		for(int i=0;i<=m;i++) {
			a[0][i]=i;
		}
		for(int j=0;j<=n;j++) {
			a[j][0]=j;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					a[i][j]=a[i-1][j-1]; 
				}
				else {
					a[i][j]=1+  Math.min(Math.min(a[i-1][j-1], a[i][j-1]),a[i-1][j]);
				}
			}
		}
		return a[n][m];
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="acd";
        String s2="abd";
        System.out.println(m1(s1, s2, s1.length(), s2.length()));
	}

}
