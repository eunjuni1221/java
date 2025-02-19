package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz {
	/*
	 * # 알맞은 비교 연산을 만들어보세요
	 * 
	 * 1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 * 2. int형 변수 b가 짝수일 때 true
	 * 3. int형 변수 c가 7의 배수일 때 true
	 * 4. int형 변수 d와 e의 차이가 30일 때 true
	 * 5. int형 변수 year가 (400으로 나누어 떨어지거나) 또는
	 *    (4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때) true
	 * 6. boolean형 변수 powerOn이 false일 때 true
	 * 7. 문자열 참조변수 str이 "yes"일 때 true
	 */
	public static void main (String [] args) {
		int a = 12;
		int b = 2;
		int c = 49;
		int d = 400;
		int e = 430;
		int year = 4000;
		boolean powerOn = false;
		String str = "yes";

		System.out.println(a > 10 && a < 20); // 변수명이 왼쪽에 있는 것이 좋다 10 < a && a < 20 (x)
		System.out.println(b%2 == 0);
		System.out.println(c%7 == 0);
		//System.out.println(d-e == 30 || e-d == 30);
		System.out.println(Math.abs(d-e) == 30);
		//System.out.println(year%400 == 0 || year%4 == 0 || year%100 == 0);
		
		// 윤년 계산 공식
		int years = 2024;
		System.out.println(years % 400 == 0 || (years %4 == 0 && years % 100 !=0));
		
		//System.out.println(powerOn == false);
		System.out.println(!powerOn);
		
		System.out.println ("------------------------------");
		// 문자열 끼리 비교할 때는 ==을 사용하면 안된다.
		// 비교가 잘 되는 경우도 있지만 안되는 경우도 있다.
		Scanner sc = new Scanner(System.in); //(임마 돌릴때)
		
		//System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		System.out.println("Yes or NO?");
		String input = sc.nextLine();
		System.out.println(input.equals("yes"));
		
	
	}

}
