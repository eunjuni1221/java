package quiz;

import java.util.Scanner;

public class B01_TotalPrice {
	/*
	 * 콜라 - 2000
	 * 환타 - 1900
	 * 제로콜라 - 2200
	 * 솔의눈- 2500
	 * 
	 * 위의 4가지 음료수의 개수를 입력하면 총 가격이 출력되는 프로그램을 만들어보세요
	 * 
	 * 입력 > 0 1 0 1
	 * 출력 > 4400
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		/*int colaPrice = 2000;
		int fantaPrice = 1900;
		int zerocolaPrice = 2200;
		int solnoonPrice = 2500;
		
		System.out.println("콜라, 환타, 제로콜라, 솔의 눈 왼쪽 부터 음료수 개수를 입력하세요");
		
		int cola = sc.nextInt();
		int fanta = sc.nextInt();
		int zerocola = sc.nextInt();
		int solnoon = sc.nextInt();
		
		//System.out.println ((cola * colaPrice) + (fanta * fantaPrice) + (zerocola * zerocolaPrice) + (solnoon * solnoonPrice));
		System.out.printf("총 가격은 ￦%d 입니다.\n", 
				(cola * colaPrice) + (fanta * fantaPrice) + (zerocola * zerocolaPrice) + (solnoon * solnoonPrice));
		*/
		
		int colaPrice = 2000;
		int fantaPrice = 1900;
		int zerocolaPrice = 2200;
		int solnoonPrice = 2500;
		
		System.out.println("콜라 - 2000");
		System.out.println("환타 - 1900");
		System.out.println("제로콜라 - 2200");
		System.out.println("솔의눈 - 2500");
		System.out.println("음료 개수 입력 >");
		
		int colaQty = sc.nextInt();
		int fantaQty = sc.nextInt();
		int zerocolaQty = sc.nextInt();
		int solnoonQty = sc.nextInt();
		
		int totalPrice = colaQty * colaPrice + fantaQty * fantaPrice + zerocolaQty * zerocolaPrice + solnoonQty * solnoonPrice ;
		System.out.println ("총 가격: " + totalPrice); // f ln 가능
		
	}

}
