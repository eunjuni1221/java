package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B13_Lotto {
	/*
	  	1. 1 ~ 45의 중복없는 랜덤 숫자 7개인 로또 당첨번호 배열을 생성해보세요
	  	
	  	2. 1등 또는 2등에 당첨될때까지 6개의 랜덤 로또 번호를 계속 생성하여 몇 번 만에 당첨되었는지 출력해보세요
	  		
	  		- 보너스 번호를 제외하고 6개가 다 맞으면 1등
	  		- 보너스 번호가 포함된채로 6개가 다 맞으면 2등
	  	   
	*/
	public static void main (String [] args) {
		Random ran = new Random();
		
		int[] winNums = new int[7];
		int[] guessNums = new int[6];
		
		for (int i = 0; i <winNums.length; ++i) {
			//i번째에 뽑은 숫자
			winNums[i] = (int)(Math.random() * 45 + 1);
			
			// j: i번째 이전에 뽑은 숫자들의 인덱스
			for (int j = 0; j < i; ++j) {
				if (winNums[i] == winNums[j]) {
				// 같은 숫자를 발견했으므로 다시 뽑아야 한다
				System.out.printf("이전에 뽑은 %d와 " + "방금 뽑은 %d가 중복이라 다시 뽑아야함\n", winNums[j], winNums[i]);
				--i;
				break;
				}
			}
		}
		// Arrays.toString(배열): 해당 배열의 내용을 문자열형태로 반환
		System.out.println("당첨번호: " + Arrays.toString(winNums));
		System.out.println("보너스번호: " + winNums[6]);
		
		boolean winnerExist = false;
		int buyCount = 0;
		
		while (!winnerExist) {
			// 1. 중복없는 랜덤 6개 번호 배열 생성
			for (int i = 0; i < guessNums.length; ++i) {
				guessNums[i] = (int)(Math.random() * 45 + 1);
				
				for (int j = 0; j < i; ++j) {
					if (guessNums[i] == guessNums[j]) {
						--i;
						break;
					}
				}
			}
			System.out.println("구매번호: " + Arrays.toString(guessNums));
			++buyCount;
			int winCount = 0;
			boolean hasBonus = false;
			
			
			// 2. 생성한 배열과 winNums 배열을 비교하여 당첨자 찾기
			for (int i = 0; i < guessNums.length; ++i) {
				
				for (int j = 0; j < winNums.length; ++j) {
					if (guessNums[i] == winNums[j]) {
						++winCount;
						if (j == 6) {
							hasBonus = true;
						}
						break;
					}
				}
			}
			if (winCount == 6 && hasBonus) {
				System.out.println(buyCount +"회 만에 2등 당첨!");
				winnerExist = true;
			} else if (winCount == 6) {
				System.out.println(buyCount +"회 만에 1등 당첨!");
			}
		}

		 System.out.println("당첨번호: " + Arrays.toString(winNums));
		 System.out.println("구매번호: " + Arrays.toString(guessNums));
		}

}


