package quiz;

import java.util.Scanner;

public class B05_DateToSeasonA {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일을 입력하세요 >> ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();
		
		int maxDate;
		
		// 0. 이번 달의 최대 날짜를 구해야 한다
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				maxDate = 31;
				break;
			case 4, 6, 9, 11:
				maxDate = 30;
				break;
			case 2:
				if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
					maxDate = 29;
				} else {
					maxDate = 28;
				}
				break;
			default:
				maxDate = -1;
				break;
		}
		
		// 1. 잘못된 값을 없는가?
		if (year < 0) {
			System.out.printf("%d년 %d월 %d일 - 기원전 날짜는 개발중입니다\n", year, month, date);	
		} else if (month < 1 || month > 12 ){
			System.out.printf("%d년 %d월 %d일 - 잘못된 달\n", year, month, date);
		} else if (date < 1 || date > maxDate) {
			System.out.printf("%d년 %d월 %d일 - 잘못된 달\n", year, month, date);
			
		} else { // 2. 계절을 구분한다
			String season;
			
			switch (month) {
				case 3, 4:
					season = "봄";
				case 6, 7:
					season = "여름";
				case 9, 10:
					season = "가을";
				case 12, 1:
					season = "겨울";
				case 2:
					if (date < 3) {
						season = "겨울";
					} else {
						season = "봄";
						
					}
					break;
				case 5: 
					if (date < 5) {
					season = "봄";
				} else {
					season = "여름";
				}
					break;
				case 8:
					if (date < 7) {
						season = "여름";
					}else {
						season = "가을";
					}
					break;
				case 11:
					if (date < 7) {
						season = "가을";
					} else {
						season = "겨울";
					}
					break;
				default:
					season = "?";
					break;
					
			}
			
			System.out.printf("%d년 %d월 %d일은 \"%s\"입니다,\n", year, month, date, season);
		}
		
	}

}
