package givejhyquiz;

import java.util.Scanner;

public class Score {
	/*
	 *  다음과 같이 학생들의 성적을 받아서 평균을 출력하는 프로그램을 작성하라. 
	 *  단, 크기가 5인 정수형 배열(이름: scores)을 만들어 이곳에 성적을 저장한 다음에 
	 *  총점(이름: sum)과 평균(이름: avg)을 계산하여 출력하도록 한다
	 */
	public static void main(String[] args) {
		
		int score[] = new int[5];
		int sum = 0;
		int avg = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하세요: ");
			score[i] = sc.nextInt();
			if(score[i] < 0 || score[i] > 100) {
				System.out.println("입력하신 점수를 다시 확인해주세요");
				i--;
				continue;
			}
			sum += score[i];
		}
		avg = sum / 5;
		System.out.printf("학생들의 총점은 %d이고 평균은 %d입니다", sum, avg);                                                                         
	}

}
