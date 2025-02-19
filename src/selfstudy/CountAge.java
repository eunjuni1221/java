package selfstudy;

import java.time.LocalDate;
import java.util.Scanner;

public class CountAge {
	/*
	 *  한국식 나이: 현재 연도 - 출생 연도 + 1
	 *  연 나이: 현재 연도 - 출생 연도
	 *  
	 *  출생 연도를 나타내는 정수 year와 구하려는 나이의 종류를 나타내는 문자열 ageType이 주어질 때 2030년에 몇살인지
	 *  출력하도록 빈칸을 채워 코드를 완성해 주세요
	 *  age_type이 "Korea"라면 한국식 나이를, "Year"라면 연 나이를 출력합니다.
	 *  
	 *  1950 < year < 2030
	 *  age_type은 "Korea" 또는 "Year"만 주어집니다.
	 */
	public static void main (String [] args) {
		
	    // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)        
		LocalDate now = LocalDate.now();
		
		Scanner sc = new Scanner(System.in);
		
		int bornYear;
		int thisYear = now.getYear();
		
		String ageType;
		
		while(true) {
			System.out.print("나이 계산기>> ");
			bornYear = sc.nextInt(); // 태어난 해 입력
			ageType = sc.next(); // 한국 or 국제 표준입력
			
			// 처리 범위 필터링 (먼저 나이)
			if (bornYear < 1950 || bornYear > 2030) {
				System.out.println("알파고가 처리할 수 있는 연도 한계치를 넘으셨습니다");
				continue;
			} 
			
			// ageType에 맞게 나이 계산을 하기위해 equals로 받음
			if (ageType.equals("korea")) {
				System.out.println(thisYear - bornYear + 1);
			} else if (ageType.equals("year")) {
				System.out.println(thisYear - bornYear);
			} else { // korea, year 입력을 잘못했을 시
				System.out.println("한국식 나이를 보고싶다면 korea, 국제 표준 나이를 보고싶다면 year 정확히 입력해주세요");
			}
			break;
		}
	}

}
