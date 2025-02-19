package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_ShuffleText {
	/*
	 *  사용자로부터 입력받으면 해당 단어를 무작위로 뒤섞은 결과를 
	 *  char[] 타입으로 다섯개 생성해보세요
	 *  
	 *  
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print(">> ");
		
		String keyword = sc.next();
		
		int len = keyword.length();
		
		
		
//		for (int i = 0; i < len; i++) {
//			System.out.printf("shuffled[%d]: %c(%d)\n", i , shuffled[i], (int)shuffled[i]);
//		}
		for (int j = 0; j < 5; ++j) {
			char[] shuffled = new char [len];
			int i = 0;
			while(i < len) {
				char ch = keyword.charAt(i);
				
				int ranIndex = ran.nextInt(len);
				
				if (shuffled[ranIndex] == 0) {
					shuffled[ranIndex] = ch;
				} else {
					continue;
				}
				i++;
			}
		System.out.println(shuffled);
		}
//		int len = keyword.length();
//		
//	for (int j = 0; j < 5; j++) {	
//		// 문자열은 수정이 불가능하기 때문에 뒤섞는 방식을 사용할 수 없다
//		// 문자열을 그래도 char[]로 전환
//		char[] keywordArr = new char [len];
//		
//		for (int i = 0; i < len; i++) {
//			keywordArr[i] = keyword.charAt(i);
//		}
//		
//		int shuffleSize = len * ran.nextInt(2, 4);
//		for (int i = 0; i < shuffleSize; i++) {
//			int ranIndex = ran.nextInt(1, len);
//			
//			char firstCh = keywordArr[0];
//			char ranCh = keywordArr[ranIndex];
//			
//			// 첫 번째 문자와 랜덤 위치의 문자를 교환한다
//			char temp = firstCh;
//			keywordArr[0] = ranCh;
//			keywordArr[ranIndex] = temp;
//			
//		  	char temp = keywordArr[0];
//			keywordArr[0] = keywordArr[ranIndex];
//			keywordArr[ranIndex] = temp;
//			
//			
//			
// 		}
//		System.out.println(keywordArr);
//	
//	}
	

	}


}
