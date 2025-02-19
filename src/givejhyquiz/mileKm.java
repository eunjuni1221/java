package givejhyquiz;

import java.util.Scanner;

public class mileKm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오:");
		double m = sc.nextDouble();
		
		double km = m * 1.609;
		
		System.out.printf("%.1f마일은 %.2f킬로미터입니다", m, km);
	}

}
