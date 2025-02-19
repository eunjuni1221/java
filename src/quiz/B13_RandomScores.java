package quiz;

import java.util.Random;

public class B13_RandomScores {
	
	/*
	 *  1. 300개의 랜덤 정수를 생성한다 (각 점수는 0 ~ 100점, 배열에 저장)
	 *  
	 *  2. 배열에 저장된 해당 점수들을 한 줄에 10개씩 보기좋게 출력한다
	 *  
	 *  3. 배열에 저장된 모든 점수들의 평균을 출력한다 (소수 둘째 자리에서 반올림)
	 *  
	 *  4. 배열에 저장된 가장 높은 점수와 가장 낮은 점수를 찾고 그 점수가 몇 번째 점수인지르 출력한다
	 *     (중복되는 점수가 최고 점수 또는 최저 점수일 경우 모든 위치를 출력한다
	 *  
	 */
	public static void main (String [] args) {
		int scores[] = new int[300];
		
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int)(Math.random() * 101);
			
		}
		for (int i = 0; i < scores.length; ++i) {
			System.out.printf("%-4d", scores[i]);
			if (i % 10 == 9) {
				System.out.println();
			}
		}
		int sum = 0;
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		double avg = sum / (double)scores.length;
		
		System.out.println("===================================================");
		System.out.printf("평균 점수: %.1f ", avg);
		
		// 4-1. 최고점수와 최저점수 찾기
		int MAX_SCORE = 100;
		int MIN_SCORE = 0;
		
		int bestScore = MIN_SCORE;
		int worstScore = MAX_SCORE;
		
		for (int i = 0; i < scores.length; ++i) {
			if (bestScore < scores[i]) {
				bestScore = scores[i];	
			}
			if (worstScore > scores[i]) {
				worstScore = scores[i];
			}
		}
		// 4.2 찾은 최고점수와 최저점수의 위치를 출력하기
		System.out.printf("최고점수는 %d점이고 " ,bestScore);
		for (int i = 0; i < scores.length; ++i) {
			if (scores[i] == bestScore) {
				System.out.printf("%d, " , i);
			}
		}
		// \b: 백스페이스 키를 사용하고 싶을 때 필요한 이스케이프 문자
		System.out.println("\b\b번째 위치에 있습니다");
		System.out.printf("\t      최저점수는 %d점이고 " , worstScore);
		for (int i = 0; i < scores.length; ++i) {
			if (scores[i] == worstScore) {
				System.out.printf("%d, ", i);
			}
		}
		System.out.println("번째 위치에 있습니다");
	}

}
