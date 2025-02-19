package quiz;

public class B07_ForQuizA {
	
	public static void main (String [] args) {
		
		// 1)
		for (int num = 1000; num <= 2000; ++num) {
			if (num % 13 == 0) {
				System.out.println(num);
		
/*		for (int num = 0; num <= 2000; num += 13) {
			if (num >=1000) {
			System.out.println(num);
*/
		}
		
	   }
		
		// 2)
		int sum = 0;
		
		for (int num = 50; num <= 100; ++num) {
			System.out.println(num);
			sum+= num;
		}
		
		System.out.println ("50 ~ 100의 총합: " + sum);
	
		// 3)
		int printCount = 0;
		for (int num = 1; num <= 1000; ++num) {
			if (num % 10 == 0) {
				//System.out.printf ("%d번째 출력: %d\n", printCount, num);
				System.out.printf("%-4d", num);
				++printCount;
			
			// 10의 배수를 8번 출력할때마다 \n을 출력해 줄바꿈
			if (printCount %8 == 0) {
				System.out.println();
				//printCount = 0;
			}
		}
	}		
		// 4)
		int result = 1;
		for (int num = 1; num <= 19; ++num ) {
			result *= num;
		}
			System.out.println ("결과: " + result);
			
		
	
		//5)
		int count = 0;
		
		for (int num = 8999; num >= 4999; --num) {
			if (num % 287 == 0) {
				System.out.println(num);
				++count;
			}
			
		}
	}
	
	

}
