package quiz;

public class B07_ForQuiz2 {
	
	/*
	 *  # for문을 사용해 숫자를 다음과 같이 출력해 보세요
	 *  
	 *  1. 0 3 6 9 12 ... 93 96 99
	 *  
	 *  2. -35 -28 -21 ... 0 7 14 ... 35
	 *  
	 *  3. 100 200 300 ... 800 900 1000
	 *  
	 *  4. 100 99 98 ... 5 4 3 2 1 0
	 *  
	 *  5. 0 1 2 3 .. 6 7 8 9 0 1 2 3 ... 7 8 9 ... (총 30번)
	 *  
	 *  6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (총 30번)
	 *  
	 *  7. 7 77 777 7777 77777 ... 7777777777
	 */
	public static void main (String [] args) {
		System.out.println ("--------------------(1)--------------------");
		//1
		for (int a = 0; a <= 99; ++a, a+=2) { // if (a%3 == 0)을 집어넣어도 가능 a+=2 지우고
			//System.out.printf("%d ", a);
			System.out.print(a + " ");
		}
		System.out.println ();
		System.out.println ("--------------------(2)----------------------");
		
		//2
		for (int b = -35; b <= 35; b+=7) {
			System.out.printf("%d ",b);
		}
		
		System.out.println ();
		System.out.println ("--------------------(3)--------------------");
		
		//3 
		for (int c = 100; c <= 1000; ++c, c+=99) {
			System.out.printf("%d ",c);
		}
		
		System.out.println ();
		System.out.println ("--------------------(4)--------------------");
		
		//4
		for (int d = 100; d >= 0; --d) {
			System.out.printf("%d ",d);
		}
		System.out.println ();
		
		for (int i = 0; i <= 100; ++i) {
			System.out.print((100- i) + " ");
		}
		
		System.out.println ();
		System.out.println ("--------------------(5)--------------------");
		
		//5
		for (int e = 0; e < 30; ++e) {
			for (int e2 = 0; e2 <= 9; ++e2) {
				System.out.printf("%d ",e2);
			}
			
		}
		System.out.println ();
		for (int i = 0; i <30; ++i) {
			System.out.print(i % 10 + " ");
		}
		
		
		System.out.println ();
		System.out.println ("--------------------(6)--------------------");
		
		//6
		for (int f = 0; f < 30; ++f) {
			for (int f2 = 10; f2 >= 1; --f2) {
				System.out.printf("%d ", f2);
			}
		}
		System.out.println ();
		for (int i = 0; i <300; ++i) {
			System.out.print((10 -i % 10) + " ");
		}
		
		System.out.println ();
		System.out.println ("--------------------(7)--------------------");
		
		//7
		String num = "7";
		for (long g = 1; g <= 10; g++) {
				System.out.printf("%s ",num);
				num += "7";
			}
		System.out.println ();
		
		long innum = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(innum + " ");
			innum = innum * 10 + 7;
		}
		
	}
		
	

}
