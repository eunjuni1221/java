package quiz;

import java.util.Scanner;

public class B12_UpdownGame2 {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 100 +1);
		System.out.print("정답이 생성되었습니다.");
		
		int chance = 5;
		int guessCeil = 101;
		int guessFloor = 0;
		
		while (chance > 0) {
			System.out.printf(" %d ~ %d(남은횟수: %d)> ", guessFloor + 1, guessCeil - 1, chance);
			int guess = sc.nextInt();
			
			if(guess >= guessCeil || guess <= guessFloor) {
				System.out.println("유효 범위를 벗어났습니다 기회가 소진되지 않습니다");
				continue;
			}
			
			if (answer == guess) {
				System.out.println("정답을 맞추셨습니다~ 축하합니다!!");
				break;
				
			} else if (guess > answer) {
				System.out.println("Down!");
				guessCeil = guess;
			} else if (guess < answer) {
				System.out.println("Up!");
				guessFloor = guess;
			}
			
			--chance;
			
		}
		System.out.println("게임이 종료되었습니다");
	}

}
