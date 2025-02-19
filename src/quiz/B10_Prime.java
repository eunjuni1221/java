package quiz;

import java.util.Scanner;

public class B10_Prime {
	/*
	 *  사용자가 정수를 입력하면 1부터 입력한 정수 사이에 존재하는 모든 소수를 출력해보세요
	 *  
	 *   * 소수 : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 *   
	 *   > 10
	 *   2, 3, 5, 7
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print(">> ");
		int target = sc.nextInt();
		
		for (int num = 2; num <= target; ++num) {
			System.out.printf("%d: ", num);
			
			// 2부터 자기자신 전까지 나누어 보았을때 약수가 0개라면 소수
			int count = 0;
			for (int i = 2; i <= Math.sqrt(num); ++i) {
				if (num % i == 0) {
					System.out.print(i + " ");
					++count;
					break;
				}
			}
			if (count == 0) {
			System.out.printf("소수\n", count);
			} else {
				System.out.printf("(약수 있음)\n", count);
			}
		
		}
			
	}

}