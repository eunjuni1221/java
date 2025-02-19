import java.util.Random;

public class B12_Random {
	/*
	   # 무작위 숫자 생성하기
	   
	     1. java.util.Random 클래스 사용하기
	     
	     2. Math.random() 함수 활용하기
	     
	    
	*/
	public static void main (String [] args) {
		// 랜덤숫자기계 생성
		Random ran = new Random();
		
		// 만들어져있는 랜덤으로부터 nextInt()로 숫자 뽑기
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran.nextInt(50)); // 0 ~ 49
		}
		System.out.println("=================");
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran.nextInt()); // int의 전 범위
		}
		System.out.println("=================");
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran.nextInt(30, 50)); // 30 ~ 49
		}
		System.out.println("=================");
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran.nextBoolean()); 
		}	
		System.out.println("=================");
		// Math.random(): 0 <= x < 1 범위의 실수를 랜덤으로 생성
		for (int i = 0; i < 5; ++i) {
			System.out.println(Math.random()); 
		}
		/*
		   # Math.random()을 사용해 원하는 범위의 정수 만들기
		   
		    1. 원하는 숫자의 개수를 곱한다
		    2. 원하는 숫자 중 가장 작은 숫자를 더한다
		    3. 소수점 아래는 삭제한다
		*/
		
		// ex> Math.random()으로 100~150 범위의 정수 만들기
		
		// 1. 100 ~ 150은 51개의 숫자이므로 51을 곱한다
		//	  0 <= x < 1 -----------> 0 <= x < 51
		// 2. 가장 작은 숫자가 100이므로 100을 더한다
		// 	  0 <= x < 51 -----------> 100 <= x < 151
		for (int i = 0; i < 20; ++i) {
		System.out.println((int)(Math.random() * 51 + 100));
		}
		
		// 연습1) 20 ~ 39의 랜덤 정수 만들기
		System.out.println("========(1-1)=========");
		for (int i = 0; i < 10; ++i) {
			System.out.println (ran.nextInt (20, 40));
		}
		System.out.println("========(1-2)=========");
		for (int i = 0; i < 10; ++i) {
			System.out.println((int)(Math.random() * 20 + 20));
		}
		
		// 연습2) -30 ~ 5 범위의 랜덤 정수 만들기
		System.out.println("========(2-1)=========");
		for (int i = 0; i < 10; ++i) {
			System.out.println (ran.nextInt (-30, 6));
		}
		System.out.println("========(2-2)=========");
		for (int i = 0; i < 10; ++i) {
			System.out.println ((int)(Math.random() * 36 - 30 ));
		}
	
	}

}
