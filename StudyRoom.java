package selfstudy;

import java.util.Random;

public class StudyRoom {
	/*	학생은 4명있고 스터디룸에 무조건 참여한다
		스터디룸은 9시부터 23시까지 운영하며 랜덤으로 출퇴근 시간이 정해진다(정각마다 출근, 분은 따지지 말자)
		스터디룸이 1시간에 4000원이라면 각각의 학생들은 얼마씩 내야 하는가?
		오늘 풀 문제입니다 풀어보실 분은 해보세요
	*/
	public static void main(String[] args) {
		int students = 4;
		
		final int HOURS_EXPENSE = 4000;
		
		Random ran = new Random();
		
		int[]dutchpay = new int[students];
		int totalExpense = 0;
		int startTime[] = new int[students];
		int endTime[] = new int[students];

		
		for (int i = 0; i <= students; i++) {
			startTime[i] = 9 + ran.nextInt(15);
			endTime[i] = startTime[i] + 1 + ran.nextInt(14-(startTime[i] - 9));
		}
		for(int j = 9; j <= 23; j++) {
			for(int k = 0; k <= students; k++) {
				
			}
		}
	}
}

