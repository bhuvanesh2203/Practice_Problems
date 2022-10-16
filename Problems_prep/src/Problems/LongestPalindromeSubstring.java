package Problems;

public class LongestPalindromeSubstring {
	// TODO Auto-generated method stub
	static int m1(String s1,int start,int end) {
		if(start==end) {
			return 1;
		}
		if(start>end) {
			return 0;
		}
		if(s1.charAt(start)==s1.charAt(end)) {
			int remcount=end-start-1;  
			if(remcount==m1(s1,start+1,end-1)) {
				return 2+remcount;
			}
		}
		return Math.max(m1(s1,start+1, end),m1(s1,start, end-1));
	

}
	static int m2(String s1,int start,int end) {
		if(start==end) {
			return 1;
		}
		if(start>end) {
			return 0;
		}
		if(s1.charAt(start)==s1.charAt(end)) {
		//	int remcount=end-start-1;
			
				return 2+m2(s1,start+1,end-1);
			
		}
		return Math.max(m2(s1,start+1, end),m2(s1,start, end-1));
	

}
	public static void main(String[] args) {
		String s="abefbac";
	    System.out.println(m1(s, 0, s.length()-1));
	    
	    System.out.println(m2(s, 0, s.length()-1));
}
}
