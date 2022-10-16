package Problems;

public class BiggestSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {1,2,4,6,5,6};
          
           for(int i=0;i<a.length;i++) {
        	   for(int j=i+1;j<a.length;j++) {
        		   int temp=0;
        		   if(a[i]>a[j]) {   // 1 2
        			    temp=a[i];   // temp 1
        			   a[i]=a[j];       // 
        			   a[j]=temp;
        		   }
        	   }
           }
           for(int s:a) {
        	   System.out.println(s);
           }
	}

}
