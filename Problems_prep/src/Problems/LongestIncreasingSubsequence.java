package Problems;

public class LongestIncreasingSubsequence {

	static int m1(int a[]) {
		
		int li[]=new int[a.length];
		for(int i=0;i<li.length;i++) {
			li[i]=1;
		}
		int max=1;
		for(int i=1;i<li.length;i++) {
			for(int j=0;j<i;j++) {
				 if(a[i]>a[j] && 1+li[j]>li[i]) {
					 li[i]=1+li[j];
					 max=Math.max(max, li[i]);
				 }
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a []= {7,1,4,8,11,2,14,3};
 System.out.println(m1(a));
	}

}
