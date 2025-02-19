package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {
	
	/*
	 * 사과를 10개씩 담을 수 있는 바구니가 있을 때 사용자가 사과 개수를 입력하면
	 * 사과를 모두 담기 위해 필요한 바구니의 개수를 얄려주는 프로그램을 만들어보세요
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print ("담을 사과를 입력하세요 > ");
		int apple = sc.nextInt();
		
		int sizePocket = 10;
		
		int pocket = apple / sizePocket + 1;
		
		boolean notBuyApple = apple < 0;
		
		if (notBuyApple) {
			System.out.println ("살 사과를 정확히 입력해주세요");
		} else {
		  System.out.printf ("사과 %d개의 담을 수 있는 바구니는 %d개 입니다", apple , pocket);
		}
*/	
		System.out.println("구매할 사과의 개수를 입력하세요 >> ");
		int appleQty = sc.nextInt();
		
		if (appleQty < 0) {
			System.out.println("사과의 개수를 정확히 입력하세요");
		} else {
			int basketQty = (int) Math.ceil(appleQty/ 10.0);
/*			int basketQty = appleQty / 10;
			
			// 10개씩 담고 났을 때 나머지가 0보다 크다면
			if (appleQty % 10 > 0) {
				// 바구니의 개수를 1 증가시킨다
				basketQty = basketQty + 1;
			}
*/			
			System.out.printf("필요한 바구니 개수는 %d 입니다\n", basketQty);
		}
	}

}
