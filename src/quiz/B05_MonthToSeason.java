package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {
	/*
	 * 사용자가 몇 월인지 입력하면 해당하는 계절을 출력해보세요
	 * (switch-case문, if문으로 한번씩 만들기)
	 */
	
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("당신의 생일을 입력해 주세요! >>");
		int month = sc.nextInt();
		
/*		switch (month) {
		case 12 : case 1 : case 2 :
			System.out.println("당신은 눈내리는 추운 겨울에 태어났습니다!!");
			break;
		
		case 3 : case 4 : case 5 : case 6 :
			System.out.println("당신은 꽃이 내리는 봄에 태어났습니다!!");
			break;
		
		case 7 : case 8 : case 9 :
			System.out.println("당신은 너무 더운 여름에 태어났습니다!!");
			break;
		
		case 10 : case 11 : 
			System.out.println("당신은 낙엽이 내리는 가을에 태어났습니다!!");
			break;
		default:
			System.out.println("혹시 외계인이세요?");
			break;
*/	
		if (month <=0 ||month >= 13) {
			System.out.println ("혹시 외계인이세요?");
		}
		else if (month == 12 || month == 1 || month == 2 ) {
			System.out.println ("당신은 눈내리는 추운 겨울에 태어났습니다!!");
		}
		else if (month == 3 || month == 4 || month == 5 || month == 6) {
			System.out.println ("당신은 꽃이 내리는 봄에 태어났습니다!!");
		}
		else if (month == 7 ||month == 8 || month == 9) {
			System.out.println ("당신은 너무 더운 여름에 태어났습니다!!");
		} 
		else if (month == 10 || month == 11) {
			System.out.println("당신은 낙엽이 내리는 가을에 태어났습니다!!");
		}

	
	}

}