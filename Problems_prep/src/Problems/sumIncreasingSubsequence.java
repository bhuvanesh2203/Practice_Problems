package Problems;

public class sumIncreasingSubsequence {

	static int m1(int a[]) {
	  int mis[]=new int[a.length];
	  for(int i=0;i<mis.length;i++) {
		  mis[i]=a[i];
	  }
	  int max=a[0];
	  
	  for(int i=1;i<a.length;i++) {
		  for(int j=0;j<i;j++) {
			  if(a[i]>a[j] && mis[j]+a[i]>mis[i]) {
                     mis[i]=mis[j]+a[i];
                     max=Math.max(max, mis[i]);
			  }
		  }
	  }
		
		
		
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a []= {1, 101, 2, 3, 100, 4, 5};
		 System.out.println(m1(a));
	}

}
