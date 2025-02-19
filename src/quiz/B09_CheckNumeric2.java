package quiz;

import java.util.Scanner;

public class B09_CheckNumeric2 {
	/*
	 * /*
	 *  사용자가 입력한 문자열이 모두 숫자로 되어 있으면 true를 출력하는 프로그램을 만들어보세요 (16진수 까지 가능)
	 *  
	 *  > 12345a78 -> false
	 *  > 1234567 -> true
	 */
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print(">> ");
//		
//		String str = sc.next();
//		
//		int nums = str.length();
//		
//		boolean numeric = true;
//		
//		for (int i = 0; i < nums; ++i) {
//			char ch = str.charAt(i);
//			
//			if (!((ch >= '0' && ch <= '9')||(ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f')))  {
//				numeric = false;
//				break;
//				
//			}
//			
//		}
//		System.out.println("결과: " + numeric);
		
		String str = sc.next();
		boolean isNumeric = true;
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			// 숫자가 아닌 조건
			// (1) 0 ~ 9를 벗어난 문자
			// (2) a ~ f를 벗어난 문자
			// (3) A ~ F를 벗어난 문자
			if (ch < '0' || ch > '9' && ch < 'a' || ch > 'f' && ch < 'A' || ch > 'F') {
				isNumeric = false;
				break;
				}
		}
		System.out.println(isNumeric);
		
	} 


	
}
