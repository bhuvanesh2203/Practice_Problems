package Javain;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a[]= {4,2,78,4,6};
		  int temp=0;
		  for(int i=0;i<a.length;i++) {
			  for(int j=i+1;j<a.length;j++) {
				  if(a[i]<a[j]) {
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
				  }
			  }
		  }
		  for(int a1:a) {
			  System.out.println(a1);
		  
	}
}
}
