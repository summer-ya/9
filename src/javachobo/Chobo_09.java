package javachobo;

import java.util.Scanner;

public class Chobo_09 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("구구단을 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(num + "x" + i + " = " + num*i);
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수입력하세요 : ");
//		int num = sc.nextInt();
//		
		for(int i = 1; i<=50; i++) {
			if(i%10==3 || i%10==6 ||i%10==9) {
				System.out.print("박수");
			} else if (i%10==5) {
				System.out.println("으악");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
