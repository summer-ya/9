package javachobo;

import java.util.Scanner;

public class Chobo_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���. :");
		
		Scanner sc = new Scanner(System.in);
		String no = sc.nextLine();
		char gender = no.charAt(7);
		
		switch(gender) {
		case 1: case 3:
			switch(gender) {
				case 1:
				System.out.println("����� 2000�� ������ ����� �����Դϴ�");
				break;
				case 3:
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�");
			}
			break;
			
		case 2: case 4:
			switch(gender) {
				case 2:
				System.out.println("����� 2000�� ������ ����� �����Դϴ�");
				break;
				case 4:
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�");
			}
			break;
		default :
		System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		

	}

}
