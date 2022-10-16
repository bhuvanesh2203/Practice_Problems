package Problems;

public class STepsstair {
	
	static int m1(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else {
			return m1(n-1)+m1(n-2)+m1(n-3);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //int a[]= {1,2,3,4};
      System.out.println(m1( 4));
	}
	

}
