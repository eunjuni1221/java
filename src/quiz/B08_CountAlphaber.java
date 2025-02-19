package quiz;

import java.util.Scanner;

public class B08_CountAlphaber {
	
	/*
	 *  사용자가 문장을 입력하면
	 *  대문자의 개수와 소문자의 개수를 세어서 출력해주는 프로그램을 만들어보세요
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("문장을 입력하세요 >> ");
		
		String sentence = sc.nextLine();
		
		int A_count = 0;
		int a_count = 0;
		
		for (int i = 0; i < sentence.length(); ++ i) {
			char ch = sentence.charAt(i);
			
			if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
				A_count++;
				
			}	if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
					a_count++;
					
				}

			
			
			
		}
		System.out.printf("대문자 갯수 %d, 소문자 갯수 %d " , A_count, a_count);
		
		
		
	}

}
