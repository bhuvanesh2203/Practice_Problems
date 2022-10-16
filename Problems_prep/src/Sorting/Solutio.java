package Sorting;

import java.util.ArrayList;
import java.util.List;

class Solutio {
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       // boolean b[]=new boolean[candies.length];
        List <Boolean> l1=new ArrayList<Boolean>();
        //Arrays.fill(b,true);
        int low=lowest(candies);
         System.out.println("low"+low);
        int min=Integer.MIN_VALUE;
        for(int a1=0;a1<candies.length;a1++){
            System.out.println("candies valie"+candies[a1]);
            if(candies[a1]+extraCandies>=min){
                l1.add(true);
               // min=candies[a1]+extraCandies;
            }
            else {
				l1.add(false);
			}
         
            
           
        }
        return l1;
        
    }
    
    static int lowest(int []a){
        int low=Integer.MIN_VALUE;
        for(int a1:a){
            if(a1>low){
                low=a1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,-1,1};
		System.out.println(kidsWithCandies(a,3));
		
		
    }
}