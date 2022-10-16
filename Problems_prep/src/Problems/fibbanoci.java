package Problems;

public class fibbanoci {
	static int n1=0,n2=1,n3;
	static void method1(int num) {
		int n1=0,n2=1,n3;
		System.out.print("0 1");
	  for(int i=2;i<num;++i) {
		  n3=n1+n2;   // 0 1
		  System.out.print(" ,"+n3);
		  n1=n2;
		  n2=n3;
		  
		  
		 
		 
	  }
	}
	
	static void recurrsive(int num) {
		if(num>0) {
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 System.out.println(","+n3);
			 
			 recurrsive(num-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(7);
		System.out.println("+++++++++++++");
		System.out.println("0 1 ");
		recurrsive(7);

	}

}
