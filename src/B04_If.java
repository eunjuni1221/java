
public class B04_If {
	
	/*
	 * # if문
	 * 
	 *  - ()안의 값이 true면 {}안의 코드를 실행하는 문법
	 *  - ()안의 값이 false면 {}안의 코드를 무시한다
	 *  
	 *  # else if문
	 *   
	 *   - 위에있는 if문이 flase라서 실행되지 않았다면 if문처럼 동작한다
	 *   - 위에있는 if문이 true여서 실행되었다면 체크하지 않는다
	 *     
	 *  # else문
	 *   
	 *   - 위에있는 if문, else if문이 모두 false라면 {}안의 내용을 무조건 실행
	 *   - 무조건 실행하는 문법이기 때문에 ()가 없다
	 */
	public static void main (String [] args) {
		System.out.println ("프로그램 시작!");
		
		if (true) {
			System.out.println("if문 {}안의 내용!!");
		}
		
		int a = 8;
		if (a>7) {
			System.out.println ("a가 7보다 클 때 실행되는 내용1");
			System.out.println ("a가 7보다 클 때 실행되는 내용1");
			System.out.println ("a가 7보다 클 때 실행되는 내용1");
			
		}
		
		int b = -1;
		
		if (b >=100) {
			System.out.println ("b는 3자리 이상의 숫자입니다.");
			
		} else if (b>=10) {
			System.out.println("b는 2자리 숫자입니다");
		} else if (b >= 0) {
			System.out.println("b는 1자리 숫자입니다");
		}
		
		int c = 3;
		
		if (c % 2 == 0){
			System.out.println("c에 들어있는 값이 짝수입니다.");
		} else {
			System.out.println("c에 들어있는 값이 홀수입니다.");
		}
		
		 System.out.println("프로그램 끝!!");
		
	}

}
