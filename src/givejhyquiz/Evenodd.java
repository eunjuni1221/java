package givejhyquiz;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("양수만 가능합니다");
			} else if (num % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다");
			}
		
		}
		
	}

}
