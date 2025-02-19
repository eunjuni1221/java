package selfstudy;

import java.util.Scanner;

public class Star {
	public static void main (String [] args) {
		
		/*
		 *  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 *  하지만
		 *   			 *
		 				**
		 			   ***
		 			  ****
		 			 *****
		 *   				그림 기준으로 정렬한 별을 출력해야한다
		 *   
		 *   			
		 */
		
		Scanner sc = new Scanner(System.in);
		int star; // for문을 사용할 때 문제방지를 위해 변수를 밖에 선언
		
		while (true) {
			System.out.print("별 갯수를 입력해보세요 >> ");
			star = sc.nextInt();
			
			if (star <= 0) {
				System.out.println("먹구름");
				continue;
			}
			break;
		}
		
		for (int i = 1; i <= star; i++) { 	// 입력한 값만큼 줄이 반복 (행 출력)
			for (int j = 1; j <= star - i; j++) { 	// star - i 만큼 공백을 출력 (별이 늘어날 수록 공백갯수가 줄어야 함) 
				System.out.print(" "); 	// 공백을 출력
			}
			for (int k = 1; k <= i; k++) {	 // 행의 번호만큼 별을 출력
				System.out.print("★");
			}
			System.out.println();
			
		}
	}
	
}
