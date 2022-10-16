package Problems;

import java.util.Iterator;

public class Concecutive_num_sum {
public static void concecutive(int num) {
	int start=1,end=num,sum=0;
	
	while(start<end) {
		for(int i=start;i<end;i++) {
			sum=sum+i;
			if(sum==num) {
				for(int j=start;j<=i;j++) {
					System.out.print(" "+j);
				}
				System.out.println();
				
			}
			if (sum>num) {
				break;
			}
			
		}
		sum=0;start++;
		
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            concecutive(15);
	}

}
