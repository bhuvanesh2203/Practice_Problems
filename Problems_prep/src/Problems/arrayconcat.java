package Problems;

import java.util.Arrays;

public class arrayconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,1};
System.out.println(Arrays.toString(getConcatenation(a)));
	}
    public static int[] getConcatenation(int[] nums) {
        int []a=new int[nums.length * 2];
        int count=0;
        for(int c:nums) {
        	a[count++]=c;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[2]);
        System.out.println(a[3]);
        for(int i=0;i<nums.length;i++){
        	//System.out.println("nums=i"+ a[nums.length+i]+"element pos"+ nums.length+i);
            a[nums.length+i]=nums[i];
        }
        return a;
    }

}
