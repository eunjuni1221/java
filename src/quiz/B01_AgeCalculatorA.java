package quiz;

import java.util.Scanner;

public class B01_AgeCalculatorA {
	
	public static void main (String [] args) {
		
		// 1. 입력을 받기위해 새 스캐너를 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요> ");
		String name = sc.nextLine();
		
		System.out.print("태어난 해를 입력하세요");
	    int bornYear = sc.nextInt();
		
		System.out.println("이름:" + name);
		System.out.println("태어난 해:" + bornYear);
		
		int thisYear = 2024;
		int age = thisYear - bornYear + 1;
		
		System.out.println("나이: " + age + '세');
		
		
	}

}
