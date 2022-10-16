package Javain;

public class Consecutiveoptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15;
		int start=1;
		int end=(n+1)/2;
		int sum=0;
		while(start<end) {
			for(int i=start;i<=end;i++) {
				sum=sum+i;
			if(sum == n) {
				for(int j=start;j<=i;j++) {
					System.out.print(j +" ");
					
					}
				System.out.println();
				break;
				}
				if(sum>n) {
					break;
				}
				
				
			
			}
			sum=0;
			start++;
		}
		
		System.out.println("___________________________________________________________");
		int m=76541;
		 n=0;
		while(m>0) {
			n=n*10+m%10;
			m=m/10;
		}
		System.out.println(n);
	}

}
