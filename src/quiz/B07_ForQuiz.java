package quiz;

public class B07_ForQuiz {
	
	/*
	 *  1. 1000~2000 사이의 13 배수를 모두 출력해보세요
	 *  
	 *  2. 50부터 100사이의 모든 숫자의 총합을 구해서 출력해보세요
	 *  
	 *  3. 1부터 100사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
	 *  
	 *  4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요
	 *  
	 *  5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	 */
	public static void main (String [] args) {
		
		// 1)
		for (int i = 1000; i<= 2000; ++i) {
			if (i%13==0) {
				System.out.println (i);
			}
		}
		// 2)
		int b = 0;
		
		for (int a = 50; a<=100; ++a) {
			System.out.println (b+=a);
		}
		// 3)
		for (int c = 1; c<=1000; ++c) {
			if (c%10==0) {
				
			System.out.print(c);
		}
	}
		//4)
		long d = 1;
		
		for (long e = 1; e<=19; ++e) {
			System.out.println (d*=e);
		}
		
		//5)

		

	}
}
