package givejhyquiz;

import java.util.Random;
import java.util.Scanner;

public class nansu {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int i = ran.nextInt(101);
		
		int heart = 0;
		
		while(true) {
			System.out.print("정답을 추측하여 보시오>> ");
			int answer = sc.nextInt();
			
			if(answer < 0 || answer > 100) {
				System.out.println("0 ~ 100까지의 숫자만 입력해주세요");
				continue;
			}
			if(answer < i) {
				System.out.println("up");
				heart++;
			} else if (answer > i) {
				System.out.println("down");
				heart++;
			} else {
				System.out.println("정답입니다!!");
				heart++;
				break;
			}
		}
		System.out.println("축하합니다! 시도 횟수 =" + heart);
	}

}
