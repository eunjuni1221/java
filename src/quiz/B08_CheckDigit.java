package quiz;

import java.util.Scanner;

public class B08_CheckDigit {
	
	/*
	 *  사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지 알아내는 프로그램을 만들어보세요
	 *  
	 *  (1) 문자열을 활용하여 구현하기
	 *  
	 *  (2) 문자열을 활용하지 않고 구현하기
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요>> ");
		
		int num = sc.nextInt();
		
		// 1)
		String numStr = "" + num;
		
		if (numStr.length() == 1 && numStr.charAt(0) == '0') {
			System.out.println("0입니다.");
		}else if(numStr.charAt(0) == '-') {
			System.out.println(numStr + "은(는) " + (numStr.length() -1) + "자리 숫자입니다.");
		
		
		} else {
			System.out.println(numStr + "은(는) " +numStr.length() + "자리 숫자입니다.");
	  }
	    //12345 
		int digit = 0;
		
		for (int i = Math.abs(num); i > 0; i /= 10) {
//			System.out.printf("curr num: %d, curr digit: %d\n ", i ,++digit);
		}
		System.out.println(num + "은 " + digit + "자리 숫자입니다.");
	}
}
