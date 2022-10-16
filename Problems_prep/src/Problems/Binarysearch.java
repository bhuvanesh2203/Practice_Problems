package Problems;

import java.util.Arrays;


public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,7,9,11,23};
		//Arrays.sort(a);
		//System.out.println();
		int a1=searchindex(a, 23);
		
		System.out.println("find index:"+ a1);
		
		int b[]= {2,3,1,4,-1};
		Arrays.sort(b);
		for(int c1: b) {
			System.out.println(c1);
		}
		
		int d[]= {87,62,4,2,1};
		System.out.println(searchindexdec(d, 1));
	}
	static int searchindex(int a[], int target) {
		int start=0;
		int end =a.length-1;
		while(start<=end) {
			
			int m= start+ ((end-start)/2);
			 if(target<a[m]){
				end=m-1;
			}
			else if(target >a[m]) {
				start=m+1;
			}
			 else {
				 return m;
			}
			
		}
		return -1;
	}
	
	static int searchindexdec(int a[], int target) {
		int start=0;
		int end =a.length-1;
		
		while(start<=end) {
			int m=start+(end-start)/2;
			if(target>a[m]) {
				end=m-1;
			}
			else if (target<a[m]) {
				start=m+1;
			}
			else {
				return m;
			}
		}
		
		return -1;
	}
	
	
	public String generateTheString(int n) {

		StringBuilder s = new StringBuilder();
		int n1 = n;
		for(char c='a' ; c<='z' ; c++){
		    if(n1%2 == 0){
		        
		        n1 -= 1;
		    }
		    for(int i=0 ; i<n1 ; i++){
		        
		        s.append(c);
		    }
		    if(s.toString().length() >= n){
		        
		        break;
		    }
		}
		return s.toString().substring(0,n);
		}
}
