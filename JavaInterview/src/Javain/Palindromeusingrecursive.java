package Javain;

public class Palindromeusingrecursive {
	
	public static int palin(char c[],int start,int end) {
		int last = 0;
		if(start==end || end-start==1) {
			last=1;
			
		}
		else {
			if(c[start]==c[end]) {
				return (palin(c, start+1, end-1));
				
			}
			else {
				last=0;
			}
		}
		return last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string="moma";
      char c1[]=string.toCharArray();
      int n=string.length();
      if(palin(c1, 0, n-1)==1) {
    	  System.out.println("trur");
      }
      else {
		System.out.println("false");
	}
      
	}

}
