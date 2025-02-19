package quiz;

import java.util.Scanner;

public class B11_WhileNemeric {
	/*
	 *  사용자가 입력한 문자열이 모두 숫자라면 true를 출력
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("숫자 판독기 >> ");
		
		String str = sc.next();
		
		
		boolean isNumeric = true;
		
		int i = 0;
		while (i < str.length()) {
			char ch = str.charAt(i);
			
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				break;
			}
			i++;
		}
		System.out.println("결과: " + isNumeric);

	}

}
