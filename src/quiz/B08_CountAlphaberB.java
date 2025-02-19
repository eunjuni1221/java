package quiz;

import java.util.Scanner;

public class B08_CountAlphaberB {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">> ");
		
		String text = sc.nextLine();
		
		int lower_count = 0;
		int upper_count = 0;
		
		
		
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z' ) {
				++lower_count;
			} else if (ch >= 'A' && ch <= 'Z') {
				++upper_count;
			}
		}
		System.out.printf("대문자의 개수:%d 소문자의 개수: %d",upper_count, lower_count );
		
	}

}
