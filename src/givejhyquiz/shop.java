package givejhyquiz;

import java.util.Scanner;

public class shop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int getMoney = sc.nextInt();
		System.out.print("상품 가격: ");
		int price = sc.nextInt();
		
		int tax = (int)(price*0.1);
		int re = getMoney - price;
		
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + re);
	}

}
