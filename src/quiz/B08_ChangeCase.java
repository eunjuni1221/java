package quiz;

import java.util.Scanner;

public class B08_ChangeCase {
	/*
	 *  사용자가 영어로 된 문장을 입력하면 대소문자를 반대로 바꿔서 출력해보세요
	 *  
	 *  입력 >> abcdEFG
	 *  출력 >> ABCDefg
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("문장을 입력하세요 >>");
		
		String text = sc.nextLine();
		
		String result = "";

		
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				result += (char)(ch - 32);
			} else if (ch >= 'A' && ch <= 'Z' ) {
				result += (char)(ch + 32);
			} else {
				result += ch;
			}
		}
		System.out.println(result);
	}

}
