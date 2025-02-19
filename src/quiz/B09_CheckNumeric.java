package quiz;

import java.util.Scanner;

public class B09_CheckNumeric {
	
	/*
	 *  사용자가 입력한 문자열이 모두 숫자로 되어 있으면 true를 출력하는 프로그램을 만들어보세요
	 *  
	 *  > 12345a78 -> false
	 *  > 1234567 -> true
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("숫자를 입력하세요 >> ");
		
		String str = sc.next();
		
		int len = str.length();
		
		boolean isNumeric = true;
		
		
		// 한 글자씩 꺼내면서
		for (int i = 0; i < len; ++i) {
			char ch = str.charAt(i);
			// 꺼낸 한 글자가 숫자가 아니면 더이상 검사할 필요도 없다
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				break;
			}
		}
		System.out.println("결과: " + isNumeric);
		
		
		
		
	
		
	}

	
}
