
public class B07_For {
	/*
	 *  # 반복문 (Loop)
	 *   
	 *   - for, while, do-while, forEach
	 *   - 똑같은 코드를 여러번 반복하고 싶을 때 사용한다
	 *   
	 *  # for문
	 *   
	 *   - for (초기값; 반복조건; 증감값) {
	 *     	   반복 조건이 참인동안 반복될 코드
	 *     }
	 *    
	 *   - 초기값 : for문이 처음 시작했을 때 딱 한번 실행되는 곳
	 *   		  주로 반복자(iterator)를 초기화하는데에 사용한다
	 *   
	 *   - 반복조건 : 해당 조건이 true인 동안 {}안의 내용을 계속 실행한다
	 *   			해당 조건이 false인 경우 {}안의 내용을 무시하고 반복문이 종료된다
	 *   
	 *   - 증감값 : {}내부의 코드를 모두 실행하고 나면 실행되는 곳
	 *             주로 반복자의 값을 변화시키는 용도로 사용한다 
	 *   
	 */
	public static void main (String [] args) {
		
		for (int i = 0; i < 100; ++i) {
			System.out.println (" /)/)");
			System.out.println ("(	..)");
			System.out.println ("(	>♡");
			System.out.println (" I am rabbit" + i);
			
		}
		
		/*
		 *  1. 가장 기본적인 형태의 for문
		 *  
		 *   - 초기값에는 0을 주고 조건에는 반복하고 싶은 횟수를 적는 방식
		 *   - 원하는 횟수만큼 반복하고 싶을 때 가장 많이 사용하는 형태
		 *   
		 */
		for (int i = 0; i <10; ++i) {
			System.out.printf("Hello~! %02d\n", i);
		}
		for (int i = 0; i <10; ++i) {
			System.out.printf("%02d\n", 87 - i);
		}
		
		/*
		 *  2. 값을 자유롭게 설정한 for문
		 *  
		 *   - for문의 모든 값을 자유롭게 변경하여 용도에 맞게 사용하는 경우
		 */
		for (int i = 87; i >= 50; --i) {
			System.out.println(i);
		}
		for (int i = 1; i < 1000000; i *= 2) {
			System.out.println ("2의 제곱: " + i);
			
		}
		
		// <연습1> 콘솔에 -128 ~ 127까지 출력해보세요
		
//		for (int i = -128; i <= 127; ++i) {
//			System.out.println(i);
//		}
		for (int b = Byte.MIN_VALUE; b <= Byte.MAX_VALUE; ++b) {
			System.out.println(b);
		}
		
		// <연습2> 콘솔에 모든 한글 문자를 출력해보기
		for (char i = '가'; i <= '힣'; ++i) {
			System.out.println(i);
		}
		
		for (char ch = 'ㄱ'; ch <= 'ㅣ'; ++ch) {
			System.out.println(ch);
		}
		
		/*
		 *  3. 각 자리의 값을 생략한 for문
		 *  
		 *   - for문의 각 자리의 값(초기값, 조건, 증감값)은 적지 않아도 된다
		 *   - 조건을 생략하면 무한 반복이 된다
		 */
		short num = 0;
		
		for (;num != 1000;) {
			System.out.println (num++);
		}
	}
}
