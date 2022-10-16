package Problems;

public class LargestSubsequent {

	static int m1(int a[]) {
		int max=0;
		int i;
		int dp[]=new int[a.length+1];
		
		dp[0]=1;
		for( i=1;i<a.length;i++) {
			for(int j=0;j<i;j++) {
				if(a[j]<a[i])
				  dp[i]=Math.max(dp[i], dp[j]+1);    // 
				max=dp[i];
			}
			if(dp[i]==0) {
				dp[i]=1;
			}
			max=Math.max(dp[i], max);
		}
		
		return max==0?1:max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr[] = { 10, 22, 9, 33 , 21, 50, 41, 60 };
	        int n = arr.length;
	        System.out.println("Length of lis is " + m1(arr)
	                           + "\n");
	}

}
