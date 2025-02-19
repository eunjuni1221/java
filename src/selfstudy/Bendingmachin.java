package selfstudy;

import java.util.Scanner;

public class Bendingmachin {
	/*
	 * ★ 자판기 ★
		<요구 사항>
		3개의 음료를 정하여 가격을 정해주세요.
		ex) 코카콜라=1,500원 / 사이다 = 1,000원 / 쥬스 = 500원
		scanner를 활용하여 금액을 입력 받으세요.
		switch문을 활용하여 주문이 가능한 목록을 보여주세요.
		사용자가 선택을 하면 투입 금에서 주문한 상품의 가격을 뺀 잔돈을 출력해주세요.
		※ 투입 금이 0원일 경우, 음료 선택이 불가능.
		※ 사용자가 1,2,3번이 아닌 다른 번호를 입력 할 경우, 해당 번호가 없음을 알리고 더 이상 주문 진행 불가.
		※ 투입 금이 주문 금액보다 작을 경우, N원을 더 입력 해 달라는 문구 띄우기.

	 */
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int category = 0; // switch로 목록 나타내기 위해 설정한 변수
		
		int coke = 1500;
		int cider = 1000;
		int juice = 500;
		
		int chooseCoke = 1;
		int chooseCider = 2;
		int chooseJuice = 3;
		
		int coinInsert; // 동전 투입
		int smallChange; // 반환금
		int customChoice; // 고객 선택
		

		
		
		
		switch (category) {
		case 0:
			System.out.println("==========Bendingmachine==============");
			System.out.printf("코카콜라: ￦%d %d번\n", coke, chooseCoke);
		case 1:
			System.out.printf("사이다: ￦%d %d번\n", cider, chooseCider);
		case 2:
			System.out.printf("주스: ￦%d% d번\n", juice, chooseJuice);
			System.out.println("======================================");
			break; // 목록을 전체 다 나타내기 위해 case2에만 break문 기입
		}
		
		while (true) {
			System.out.print("동전을 투입해주세요>> ");
			coinInsert = sc.nextInt();
			if(coinInsert <= 0) {
				System.out.println("동전을 투입해주세요 음료 선택이 불가능합니다");
				continue;
			}
			System.out.print("마실 음료를 선택해주세요>> ");
			customChoice = sc.nextInt();
			if(customChoice <= 0 || customChoice > 3) {
				System.out.println("당신은 음료를 드실 자격이 없습니다");
				return;
			}
			
		}
		
	}

}
