package javachobo;

public class Chobo_13 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.print("*");
		}	
		System.out.println();

		System.out.println("------------------");

		for(int i=0; i<5; i++) {
			System.out.println("*");
		}

		System.out.println("------------------");

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");

		//Quiz_04
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("------------------");
		//Quiz_05
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("------------------");

		//Quiz_06
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(i+j+1);
			}
			System.out.println();
		}
		System.out.println("------------------");

		//Quiz_07
		for(int i=5; i>0; i--) {
			for(int j=0; j<5; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		System.out.println("------------------");

		//Quiz_08
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");

		//Quiz_09
		for (int i=4; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------");

		//Quiz_11
		for(int i=0; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=5; k>i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


