package quiz;

import java.util.Scanner;

public class B05_DateToSeason {
	
	/*
	 * 사용자가 년, 월, 일을 입력하면 알맞은 계절을 출력해보세요
	 * 
	 * ※ 주의사항
	 * 
	 * 1. 존재하지 않은 날짜를 입력하면 알맞은 문구를 출력해줘야 한다
	 * 2. 계절의 구분은 절기로 한다
	 * 
	 * 		입춘(봄 시작) - 2월 3일
	 * 		입하(여름 시작) - 5월 5일
	 * 		입추(가을 시작) - 8월 7일
	 * 		입동(겨울 시작) - 11월 7일
	 */
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일 >> ");
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt() ;
		
		if(month == 2 || month == 4 || month == 6 || month == 9 || month == 11 || day >= 31) {
			System.out.println("외계인이세요?");
		}
		if (year < 1800 || month <= 0 || month >= 13 || day >= 32 || day <= 0) {
			System.out.println ("외계인이세요?");
		}else if (month == 2 || month == 3 || month == 4 || month == 5 || day <= 3 ) {
			System.out.println ("봄");
		}else if (month == 5|| month == 6 || month == 7 || month == 8 || day <= 5  ) {
			System.out.println ("여름");
		}else if (month == 8|| month == 9 || month == 10 || month == 11 || day <= 7  ) {
			System.out.println ("가을");
		}else if (month == 11|| month == 12 || month == 1 || month == 2 || day <= 7  ) {
			System.out.println ("겨울");
		}
		
	}

}
