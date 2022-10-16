package Javain;


import java.util.Arrays;
import java.util.List;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String revString="buffer";
          System.out.println(revString.split("f", 3)[1]);
          String revString1="bvauffer";
          System.out.println(revString1.split("a")[1]);
          StringBuffer stringBuffer=new StringBuffer();
          stringBuffer.append(revString);
          stringBuffer.reverse();
          System.out.println(stringBuffer);
          String string[]= {"1","2"};
          List<String> l1=Arrays.asList(string);
          System.out.println(l1);
          System.out.println(l1.toArray()[0]);
	}

}
