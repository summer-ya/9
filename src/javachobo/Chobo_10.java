package javachobo;
//Quiz.
//ù���� 10���� �����ϰ�,
//���������� ������ 2�踦
//�����ϴ� �������
//����(15��) ���� ������ �ݾ���?
// -> 327670
public class Chobo_10 {
	public static void main(String[] args) {
		     
		int money = 10;     //����
		int account = 0;    //���� �� �ݾ�
		
		
		for(int day = 0; day<15; day++) {
			
			account += money;
			money *= 2;
		}
		System.out.println("�� ���� �ݾ� : " + account);
	}
}