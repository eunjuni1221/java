import java.util.Scanner;

public class B01_Scanner {
	
	/*
	 *  # java.util.Scanner 클래스
	 *  
	 *  - 사용자로부터 프로그램으로 입력을 받을 수 있는 여러 기능들이 모여있는 클래스
	 *  - 새 스캐너를 생성한 후 해당 스캐너에 달려있는 기능을 사용해 입력을 받을 수 있다
	 *  - 새 스캐너를 생성할 때 어느곳으로부터 입력을 받을지 설정할 수 있다
	 *  
	 *    System: 현재 운영체제의 콘솔
	 *    System.out : 현재 운영체제의 콘솔로 데이터를 내보낼 수 있는 통로
	 *    System.in : 현재 운영체제의 콘솔로부터 데이터를 받아오는 통로
	 *    
	 *   # 생성된 스캐너에 내장되어있는 기능들
	 *   
	 *    (1) nextInt() : 입력통로에 있는 정수를 하나 꺼낸다
	 *                    입력통로에 아무것도 없으면 입력을 기다린다
	 *    
	 *    (2) next다른타입 : 입력 통로에 있는 해당 타입 값을 꺼낸다
	 *                     입력 통로에 아무것도 없으면 입력을 기다린다.
	 *                     String 타입과 char 타입은 없다
	 *                     
	 *    (3) next() : 한 단어 단위로 입력 통로에 있는 값을 문자열 형태로 꺼낸다.
	 *                 입력통로에 아무것도 없으면 입력을 기다린다.
	 *                 (공백, \t, \n을 기준으로 한 단어를 구분한다
	 *     
	 *    (4) nextLine() : 한 줄 단위로 입력 통로에 있는 값을 문자열 형태로 꺼낸다
	 *                     입력통레이 아무것도 없으면 입력을 기다린다
	 *                     (\n을 만나기전까지의 모든 내용을 한번에 꺼내버린다)
	 *   
	 */
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in); // Ctrl + Shift + O
		
//		System.out.print("아무거나 신나게 입력해보세요 >> ");
//	    String line = sc.nextLine(); 
//	    System.out.println(line);
		
//		System.out.print("아무거나 신나게 입력해보세요 >>");
//		String word1 = sc.next();
//		System.out.println(word1);
//		String word2= sc.next();
//		System.out.println(word2);
//		String word3 = sc.next();
//		System.out.println(word3);
		
		
		
		
		
		// Ctrl + / : 블록 지정한 범위의 코드들을 한번에 주석 처리,해제
				System.out.print("int 범위의 정수를 입력해주세요 >>");
				int a = sc. nextInt();
				
				String trash =sc. nextLine();
				System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash);
				
				System.out.print("short 범위의 정수를 입력해주세요 >>");
				short b =sc. nextShort();
				System.out.print("byte 범위의 정수를 입력해주세요 >>");
				byte c = sc.nextByte();
				System.out.print("float 범위의 정수를 입력해주세요 >>");
				float d =sc.nextFloat();
				System.out.print("double 범위의 정수를 입력해주세요 >>");
				double e =sc.nextDouble();
				
				System.out.printf("입력하신 숫자의 모든 합은 %.3f 입니다. \n", a + b + c + d + e);
	}

}
