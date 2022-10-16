package Polimorphism;

public class ClassB extends ClassA {
	public static void start() {
		startA();
		System.out.println("Class B is started");
	}
	public void stop() {
		System.out.println("Class B is stoped");
	}
	public static void main(String []args) {

	startA();
	}
}
