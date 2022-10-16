package Javain;

public class Pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________");
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("__________________________________________");
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
				
			}
			for (int j = 0; j < i; j++) {
System.out.print(" *");				
			}
			System.out.println();
		}
	}

}
