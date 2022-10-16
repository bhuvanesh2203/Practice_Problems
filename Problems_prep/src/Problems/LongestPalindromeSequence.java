package Problems;

public class LongestPalindromeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="aea";
          
          StringBuffer stringBuffer=new StringBuffer(s1);
          stringBuffer.reverse();
          String s2=stringBuffer.toString();
          System.out.println("s2:"+s2);
          System.out.println(s1.equals(s2));
          System.out.println("S1 length"+s1.length()+" content"+s1.charAt(s1.length()-1));
          System.out.println("S2 length"+s2.length()+" content"+s1.charAt(s2.length()-1));
          System.out.println(s1.charAt(s1.length()-1) == s2.charAt(s2.length()-1));
          
	}

}
