package quiz;

import java.util.Scanner;

public class B08_CountE {
	/*
	 *  사용자가 문장을 입력하면 해당 문자에 포함된 알파벳 e의 개수를 출력해주는 프로그램을 만들어보세요
	 *  ( ※ 대/소문자 모두 세어야함)
	 */
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력해주세요 >> ");
		
		String str = sc.nextLine ();
		
		int e_count = 0;
		
		// 한 글자씩 꺼내보면서 꺼낸 문자가 'e' 또는 'E'인지 확인
		
		for (int index = 0; index < str.length (); ++ index) {
			char ch = str.charAt(index);
			
			if (ch == 'e' || ch == 'E' ) {
				++ e_count;
			}
		}
		System.out.println("e 등장 횟수: " + e_count);
			
		
	
	}

}