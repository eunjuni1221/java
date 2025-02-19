package selfstudy;

import java.util.Scanner;

public class WordCount {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력하세요>> ");
		
		int wordCount = 0;
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			if(word.length() > 1_000_000) {
				System.out.println("백만개 이상 너가 세봐");
			}
			
		}
		System.out.println(wordCount);
	}

}
