package quiz;

public class B11_WhileQuiz {
	/*
	 *  1. 555~2222 사이의 13 배수를 모두 출력해보세요
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
		
		//1)
		System.out.println("====================(1)=======================");
		
		int a = 555;
		while (a <= 2222) {
			
			if (a % 13 == 0) {
				
				System.out.println(a);
			}
			a++;
		}
		
		// 2)
		System.out.println("====================(2)=======================");
		
		int b = 0;
		int c = 50;
		while (c <= 100) {
			System.out.println(b+=c);
			c++;
		}
		
		// 3)
		System.out.println("====================(3)=======================");
		
		int printCount = 0;
		int d = 1;
		while (d <= 1000) {
			if (d%10==0) {
				System.out.printf("%-4d", d);
				++printCount;
				if (printCount %8 == 0) {
					System.out.println();
				}
			}
			d++;
		}
		//4)
		System.out.println();
		System.out.println("====================(4)=======================");
		int result = 1;
		int f = 1;
		while (f <= 19) {
			result *= f;
			f++;
		}
		System.out.println ("결과: " + result);
		
		//5)
		System.out.println("====================(5)=======================");
		int count = 0;
		int g = 8999;
		while (g >= 4999) {
			if (g % 287 == 0) {
				++count;
				if (count == 5) {
					System.out.println(g);
				}
				
			}
			g--;
		}
	}


}