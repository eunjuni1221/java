package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz2 {
	/*
	 * # 알맞은 조건식을 만들어보세요
	 * 
	 * 1. char형 변수가 a가 'q'또는 'Q'일 때 true
	 * 2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 * 3. char형 변수 c가 '0'~'9'일 때 true
	 * 4. char형 변수 d가 영문자 (대문자 또는 소문자) 일때 true
	 * 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
	 * 6. 사용자가 입력한 문자열이 quit일 때 true
	 * 
	 */
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
	/* 나의 답	
	 
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q');
		
		char b = ' ';
		System.out.println(b == '\t' || b == ' ');
		
		
		char c = '1';
		System.out.println(c == '0' || c == '1' || c == '2' || c == '3'|| c == '4'|| 
				           c =='5'|| c == '6'|| c == '7'|| c == '8'|| c == '9');

		char d = '^';
		System.out.println (d<=90);
		
		char e = 'A';
	    System.out.println(e<=44032 || e<55203);
	
	
	    System.out.println("비밀번호 >>");
	    String f = sc.nextLine();
	    System.out.println(f.equals("quit"));
	*/    
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q');
		
		char b = '가';
		System.out.println(b!= ' ' && b != '\t');
		System.out.println(!(b == ' ' || b == '\t'));
		
		char c = '0';
		System.out.println(c>= '0' && c <= '9');
		
		char d = 'f';
		System.out.println(d>= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');
		
		char e = '가';
		System.out.println(e >= '가' && e <= '힣');

		System.out.print(">");
		String cmd = sc.nextLine();
		System.out.println(cmd.equals ("quit"));
	}

}
