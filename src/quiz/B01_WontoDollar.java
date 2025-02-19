package quiz;

import java.util.Scanner;

public class B01_WontoDollar {
	
	/*
	 * 한국 돈을 입력하면 달러로 환전했을때 얼마를 받을 수 있는지
	 * 출력해주는 프로그램을 만들어보세요
	 * (현재 환율은 검색하여 반영, 달러는 소수점 둘째자리까지 출력)
	 */
	
	// public static void main (String [] args) {
		// Scanner sc = new Scanner (System.in);
		
		//System.out.println("환전할 금액('원')을 입력하세요 >>" );
		//long won = sc.nextLong();
		
		//double exchangeRate = 1451.40;
		
		//System.out.printf ("$%.2f\n", won / exchangeRate);
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("환전할 금액 (￦)");
		int won = sc.nextInt();
		
		double wonTousd = 0.00069;
		
		double usd = won * wonTousd;
		
		System.out.printf("원화 %d원은 %.2f달러입니다.\n", won, usd);
		
		
	}

}
