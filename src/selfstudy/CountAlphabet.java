package selfstudy;

import java.util.Scanner;

public class CountAlphabet {
	/*
	 *  알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성
	 *  첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
	 *  첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
	 *  알파벳 이외에 단어는 오류
	 *  ex) 입력: apple 출력: 5
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String word;
		
		// while문을 통해 허용조건을 벗어날시 다시 입력할 수 있는 기회
		while(true) {
			System.out.print("영어를 입력하세요>> ");
			word = sc.next();
			
			boolean isAlphabet = true; // 알파벳이면 true 아니면 false를 구분하기 위해 boolean값 사용
			
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				
				// 알파벳 A부터 Z까지 맞는지 확인 (소문자 포함)
				if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
					isAlphabet = false; // 알파벳이 아닌 문자가 있으면 false
					break;
				}
			}
			// 유효하지 않는 조건들 기입
			if (word.length() > 100) {
				System.out.println("알파고의 인식 범위 100자를 넘었습니다 다시 입력해주세요");
			} else if (!isAlphabet) {
				System.out.println("알파고가 인식할 수 있는 문자는 오직 알파벳 대, 소문자 입니다");
			} else {
				break; // 알파벳만 포함되어 있으면 빠져나갈 수 있게 설정
			}
		}
		System.out.println("입력한 알파벳 수: " + word.length());

	}

}
