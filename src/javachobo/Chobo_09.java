package javachobo;

import java.util.Scanner;

public class Chobo_09 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�������� �Է��ϼ��� : ");
//		int num = sc.nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(num + "x" + i + " = " + num*i);
//		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("�����Է��ϼ��� : ");
//		int num = sc.nextInt();
//		
		for(int i = 1; i<=50; i++) {
			if(i%10==3 || i%10==6 ||i%10==9) {
				System.out.print("�ڼ�");
			} else if (i%10==5) {
				System.out.println("����");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
