package Javain;



public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=20,count=0;
		
		while(n<50) {
			boolean flag=false;
		for(int i=2;i<n/2;i++) {
			if(n %i ==0) {
				flag=true;
				break;
				
			}
			
		}
		if (flag==false) {
			System.out.println("number "+n+"is prime");
			
		}
		
		n++;
	}
	}

}
