package javachobo;
//Quiz.
//첫날에 10원을 예금하고,
//다음날에는 전날의 2배를
//예금하는 방식으로
//보름(15일) 동안 저축한 금액은?
// -> 327670
public class Chobo_10 {
	public static void main(String[] args) {
		     
		int money = 10;     //예금
		int account = 0;    //저축 총 금액
		
		
		for(int day = 0; day<15; day++) {
			
			account += money;
			money *= 2;
		}
		System.out.println("총 저축 금액 : " + account);
	}
}