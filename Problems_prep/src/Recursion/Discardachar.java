package Recursion;

public class Discardachar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s1=m1("", "bacdaaaappled");
String s2=skipApple("baappled");
System.out.println(s2);
//System.out.println(s1);
 	}
	static String m1(String pro, String unpro) {
		if(unpro.length()==0) {
			return pro;
		}

		if(unpro.charAt(0)=='a') {
			return m1(pro, unpro.substring(1));
		}
		else {
			return		m1(pro+unpro.charAt(0), unpro.substring(1));
			
		}
	}
	
	static String skipApple(String pro) {
		if(pro.isEmpty()) {
			return "";
		}
		if(pro.startsWith("apple")) {
			return skipApple(pro.substring(5));
		}
		else {
			return pro.charAt(0)+skipApple(pro.substring(1));
		}
		
		
	}

}
