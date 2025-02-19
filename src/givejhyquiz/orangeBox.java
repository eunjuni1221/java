package givejhyquiz;

import java.util.Scanner;

public class orangeBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("오랜지의 개수를 입력하시오: ");
		int orange = sc.nextInt();
		
		int box = orange / 10;
		int re = orange % 10;
		
		System.out.printf("%d박스가 필요하고 %d개가 남습니다", box , re);
	}

}
