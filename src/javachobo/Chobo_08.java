package javachobo;

import java.util.Scanner;

public class Chobo_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input : ");
		
		int num = sc.nextInt();
		for (int dan = 1; dan <=9; dan++) {
			System.out.println(num + "x" + dan + " = " + num * dan);
		}
	}
}