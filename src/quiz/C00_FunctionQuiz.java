package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz {
	/*
	 *  # 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 *  
	 *   1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 *   2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 *   3. 숫자를 하나 전달하면 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 *   4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 *   5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 *   6. 메시지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 */
	public static void repeat(char ch, int times) {
		for (int i = 0; i < times; ++i) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	// 1)
	public static boolean word (char a) {
//		if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
//			return true;
//		} else {
//			return false;
//		}
		return a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z';
	}
	
	// 2)
	public static boolean threeMulti (int num) {
//		if(num % 3 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		return num % 3 == 0;
	}
	
	// 3)
	public static String number (int arabiaNum) {
		if (arabiaNum % 2 == 0) {
			return "\"짝수입니다\"";
		} else {
			return "\"홀수입니다\"";
		}
	}
	// 4)
	public static int[] getDivisors(int num) {
		if (num < 0) {
			num = Math.abs(num);
		}
		
		int count = 0;
		
		for (int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				++count;
			}
		}
		
		int[] divisors = new int[count];
		
		int index = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				// ++이 뒤에 붙었으므로 대입 이후에 값이 증가함
				divisors[index++] = i;	
			}
		}
		return divisors;
	}
	
	// 5)
	public static boolean minor(int num) {
//		if (num < 0) {
//			return false;
//		}
//		for (int i = 2; i <= Math.sqrt(num); ++i) {
//			if (num % i == 0) {
//			return false;
//			}
//			
//		}
//		return true;
		
		num = Math.abs(num);
		
		// 2에서 해당 숫자의 루트까지 나눠보면서 나누어 떨어지는 것이 없을 때 소수
		double root = Math.sqrt(num);
		for (int i = 2; i <= root; ++i) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// 6)
	public static void repeatMessage(String message, int repeat) {
		for (int i = 0; i < repeat; ++i) {
			System.out.println(message);
		}
	}

	
	
	public static void main (String[] args) {
		
		// 1)
		repeat('=', 30);
		System.out.println(word('!'));
		
		// 2)
		repeat('=', 30);
		System.out.println(threeMulti(5));
		
		// 3)
		repeat('=', 30);
		System.out.println(number(2));
		
		// 4)
		repeat('=', 30);
		System.out.println(Arrays.toString(getDivisors(100)));
		
		// 5)
		repeat('=', 30);
		System.out.println(minor(6));
		// return 타입이 boolean인 함수는 조건 자리에 사용될 수 있다
		if (minor(15)) {
			System.out.println("소수입니다");
		} else {
			System.out.println("소수가 아닙니다");
		}
		
		// 6)
		repeat('=', 30);
		repeatMessage("안녕", 10);
		
	}

}
