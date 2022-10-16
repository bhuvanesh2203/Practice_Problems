package javaPracticeImportantprograms;

public class Stringregrex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String string="The w is $500 and 400$";
    string=string.replaceAll("[^ A-Za-z0-9]", "");
    System.out.println(string);
    String s1[]=string.split(" ");
    System.out.println(Integer.valueOf( s1[3])+    Integer.valueOf( s1[5])   );
	}

}
