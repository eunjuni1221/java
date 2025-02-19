// 주석: 프로그래머가 적고 싶은 내용을 적는 곳
//		하고싶은 말, 코드에 대한 설명 등을 적는 곳
/*
 *  여러 줄을 주석처리할 때 사용하는 문법
*/
// Ctrl + M : 현재 창 최대화
// Ctrl + W : 현재 창 닫기
// Ctrl + Shift + W : 열려있는 모든 창 닫기
// Shift + Home: 커서 맨 뒤에서 문장 전체 블록설정
// Ctrl + A: 전체 선택

/*
	※ 오답노트
	1. 프로그래밍 언어는 대소문자에 민감하다
	2. ;이나 {등 사소해보이는 문자도 중요하므로 놓치면 안된다
	3. 들여쓰기를 할 때 스페이스바 대신 Tab키를 써야한다 
	4. main() 함수를 public class 바깥의 장소에 있으면 안된다
*/

// ★ public class의 이름은 반드시 현재 파일명과 같아야 한다 ★


public class A00_Hello {
	
	/*
		# main() 함수
			
		- 자바에서 어떤 단어 뒤에 ()가 있으면 무조건 함수라고 부른다
		- main() 함수는 프로그램의 시작 지점이다
		- main() 함수의 범위는 {}로 지정한다
		- main() 함수가 끝나면 프로그램도 종료된다
	 */
	public static void main(String[] args) {
		//프로그램 시작
		
		/*
		 	# System.out.println() 함수
		 	
		 	-()안에 전달한 데이터를 콘솔 화면에 출력해주는 함수
		 */

		System.out.println("Hello, world!");
		// 다 적은후 Ctrl + F11
		
		System.out.println("┌───────────┐");
		System.out.println("│1. 게임 시작 │");
		System.out.println("└───────────┘");
		// 프로그램 끝
		
		// System.out.println()에 전달할 수 있는 값의 종류
		
		// 1. 문자열 - ""사이에 아무거나 입력
		System.out.println("가나다라마바사");
		System.out.println("가");
		System.out.println("家");
		System.out.println("ABC");
		System.out.println("1234 + 123");
		
		// 2. 문자 - '' 사이에 딱 한글자만 입력
		System.out.println('가');
		System.out.println('A');
		// 안되는 예시
		// System.out.println('10');
		// System.out.println0('ABC');
		
		// 3. 정수 - 그냥 숫자만 입력하는 것 (숫자는 계산이 가능)
		System.out.println(100);
		System.out.println(100 + 13);
		System.out.println(100 - 33);
		System.out.println(100 * 33);
		System.out.println(100 / 5);
		
		// ※ 숫자끼리 계산할때는 그냥 계산이 되지만
		// 문자열과 다른 타입을 더하면 이어붙인다 (더하기 외의 연산은 안됨)
		System.out.println(1000 + 10);
		System.out.println("1000" + 10);
		System.out.println(1000 + "10");
		System.out.println("몸무게: " + 80);
		System.out.println("등급: " +'A');
		System.out.println("주소: " + "서울시 노원구");
		
		//4. 실수 - 소수점이 있는 숫자를 입력하는 것
		System.out.println(123.1234);
		System.out.println(3.14);
		System.out.println(3.14 * 5 * 5);
		
		System.out.println("총 가격: " + 3000 + '원');
		// ex1. 10퍼센트 할인된 가격을 출력해보세요
		System.out.println("할인된 가격: " + 3000 * 0.9 + '원');
		System.out.println("할인된 가격: " + (3000 - 3000 * 0.1) + '원');

		
		// ex2. 1000원 할인된 가격을 출력해보세요
		System.out.println("1000원 할인 금액: " + (3000 - 1000) + '원');
		// 괄호가 없는경우 문자열과 3000의 계산 결과에
		// 1000원을 빼려고 할 때 에러가 발생한다

	}

}
