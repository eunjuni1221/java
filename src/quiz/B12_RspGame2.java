package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_RspGame2 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int win = 0, draw = 0, lose = 0;
		int winStreak = 0;
		
		boolean DEBUG_MODE = false;
		
		
		while(true) {
			
			int comValue = ran.nextInt(3);
			
			if (DEBUG_MODE) {
				System.out.println("테스트용: " + comValue);
			}
			System.out.print("가위, 바위, 보 >> ");
			String user = sc.next();
			
			if (user.equals("종료")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			int userValue; 
			
			switch (user) {
			case "가위":
				userValue = 0;
				break;
			case "바위":
				userValue = 1;
				break;
			case "보":
				userValue = 2;
				break;
			default:
				userValue = -1;
					break;
				
			}
			
			if (userValue == -1) {
				System.out.println("제대로 입력해주세요..");
				continue;
			}
			
			String com = "";
			switch (comValue) {
				case 0:
					com = "가위";
					break;
				case 1:
					com = "바위";
					break;
				case 2:
					com = "보";
					break;
			}
			
			System.out.printf("컴퓨터가 %s를 냈습니다!\n", com);
			if (userValue == comValue) {
				++draw;
				winStreak = 0;
				System.out.println("DRAW");
			} else if ((userValue + 1) % 3 == comValue) {
				++ lose;
				System.out.println("LOSE");
			} else {
				++ win;
				++ winStreak;
				System.out.println("WIN");
			}
			System.out.printf("<전적> %d승 %d무 %d패 (%d연승중)\n", win, draw, lose, winStreak);
			
		}
	}

}
