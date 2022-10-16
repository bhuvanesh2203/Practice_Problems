package Problems;

public class ceilofanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,3,5,7,9,10,23,33};
        System.out.println(ceil(a, 8));
        
	}
	static int ceil(int a[], int target) {
		  int start=0;
		  int end=a.length-1;
		  int count=0;
		  boolean b=false;
		   while(start<=end) {
			   int m=start+(end-start)/2;
			   if(target<a[m]) {
				   end=m-1;
			   }
			   else if(target>a[m]){
				start=m+1;
			}
			   else {
				  
				return m;
			}
		   }
		   
		return a[end];
	}

}
