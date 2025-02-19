
public class B02_Operator1 {
	/*
	 * # 연산자 (Operator)
	 * 
	 * - 계산을 하기 위해 값과 함께 사용하는 것
	 * - +, - , *, /, %, >, <, >+, <=, ...
	 * 
	 * # 산술 연산자
	 * 
	 *  +: 더하기
	 *  -: 빼기
	 *  *: 곱하기
	 *  /: 나누기 (※ 정수로 나눌 때와 실수로 나눌 때의 결과가 다르다)
	 *  %: 나누고 난 나머지를 구하는 연산
	 * 
	 * 
	 * 
	 */
	public static void main (String [] args) {
		int a= 22, b = 7;
		double c = 7.0;
		
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d - %d = %d\n", b, a, b - a);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		System.out.printf("%d %% %d = %d\n", a, b, a % b);
		
		// 정수끼리 나누면 몫만 구하고 (결과 정수)
		// 연산에 실수가 포함되어 있으면 정확한 값을 구한다 (결과 타입 실수)
		System.out.println("정수끼리 나눌때: " + a / b);
		System.out.println("정수끼리 나눌때: " + b / a);
		System.out.println("실수가 포함되어 있을 때: " + a / c);
		System.out.println("실수가 포함되어 있을 때: " + c / b);
		System.out.println("실수가 포함되어 있을 때: " + c / a);

		// Math.abs(x): x의 절대값을 구하는 함수
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		// Math.round(x): x를 소수 첫째 자리에서 반올림하는 함수
		System.out.println(Math.round(5.5555));
		
		// Math.ceil(x): x를 소수 첫째 자리에서 올림하는 함수
		System.out.println(Math.ceil(5.1111));
		
		// Math.floor(x): x를 소수 첫째 자리에서 내림하는 함수
		System.out.println(Math.floor(5.9999));
		
		/*
		 * # 원하는 자리에서 반올림하기
		 * 
		 *  (1) 반올림하고 싶은 숫자에 10을 곱하거나 나눠서
		 *      반올림하고 싶은 자리를 소수 첫째 자리로 만든다
		 *     
		 *  (2) 반올림한다
		 *  
		 *  (3) (1)에서 곱했던(또는 나누었던)만큼 다시 나눠서(또는 곱해서) 자리를 원래대로 되돌린다.
		 *      이때 곱하거나 나누는 값은 실수타입이어야 한다
		 */
		
		// <연습1> 76.35719를 소수 3번째 자리에서 반올림해보기
		double avg_score = 76.35719;
		
		// (1) 3번째 자리를 1번째 자리로 옮기기 위해 100을 곱한다
		System.out.println(avg_score * 100);
		
		// (2) 반올림한다
		System.out.println(Math.round(avg_score * 100));
		
		// (3) 반올림한 결과를 다시 100으로 나눠서 소수점을 원래대로 되돌린다 (실수로 나눠야 한다)
		System.out.println(Math.round(avg_score * 100) / 100.0);

		// <연습2> 188500을 천의 자리에서 반올림해보기 -> 189500
		// <연습3> 0.754198을 소수 여섯번째 자리에서 내림하기

		// <연습2 풀이>
		/*double d1 = 188500;
		System.out.println(d1 / 10000);
		System.out.println(Math.round(d1 / 10000));
		System.out.println(Math.round(d1/ 10000) * 10000);
		*/
		System.out.println(Math.round(188500/10000.0)*10000);
		// <연습3 풀이>
		/*double d2 = 0.754198;  
		System.out.println(d2 * 100000);
		System.out.println(Math.floor(d2 * 100000));
		System.out.println(Math.floor(d2 * 100000) / 100000.0);
		*/
		System.out.println(Math.floor(0.754198 * 100000) / 100000);
		
        // Math.pow(x, y) : x의 y제곱을 구하는 함수
		System.out.println(Math.pow(2, 10));
		System.out.println(Math.pow(2, 2.2));

		// Math.sqrt(x): x의 제곱근을 구하는 함수
		System.out.println(Math.sqrt(80));
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(81));

		// Math.max(x, y): 두값 중 더 큰 값을 구하는 함수
		System.out.println(Math.max(13, -5));

		// Math.min(x, y): 두값 중 더 작은 값을 구하는 함수
		System.out.println(Math.min(13, -5));


		
		
	}

}
