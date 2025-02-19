package givejhyquiz;

public class Fibonacci {
	/*
	 *  피보나치 수열은 컴퓨터에서도 탐색문제 등에 사용되기도 한다
	 *  피보나치 수열을 생성하는 방법을 알아보고 반복문을 이용하여
	 *  피보나치 수열 20개를 구하는 프로그램을 작성하라
	 */
	public static void main(String[] args) {
		int fibonacci[] = new int[20];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		int sum = 0;
		System.out.print("피보나치 수열: ");
		System.out.print(fibonacci[0] + ", " + fibonacci[1]);

				
		for(int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
			if(i < fibonacci.length - 1) {
				System.out.print(", " + fibonacci[i]);
			}
			sum += fibonacci[i];
		}
		System.out.println();
		System.out.println(sum);
	}

}
