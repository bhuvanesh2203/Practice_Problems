import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutableClass {
	protected ExecutableClass() {
		System.out.println("constructor is called");
	}
	 static int a;
	 static int b;
	 int c;
	 static {
	    a = 10;
	    b = 20;
	    
	    System.out.println("check for static block");
	 }
public static void static1() {
	System.out.println("static1");
}
public static void static2() {
	System.out.println("static2");
}
	public static void main(String[] args) {
		
		ExecutableClass sClass=new ExecutableClass();
		System.out.println("came inside main");
		System.out.println("Value of a = " + a);
		  System.out.println("Value of b = " + b);
		
		/*
		 * ApplicationContext s = new
		 * ClassPathXmlApplicationContext("Springconfiguration.xml");
		 * 
		 * BikeInterface s1 = (BikeInterface) s.getBean("Honda"); s1.model();
		 */
		static1();
		Honda.b=5;
		ExecutableClass.a=2;
		System.out.println(a+" "+Honda.b);
		 
	}
	

}
