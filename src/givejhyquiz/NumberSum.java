package givejhyquiz;

public class NumberSum {
	public static void main(String[] args) {
		/*
		 *  for문을 이용하여 자연수 1+2+3+...+n 합이 10,000을 넘지 않는
		 *  최대 자연수 n값과 그때의 합을 구하여라
		 *  
		 *  자연수 1부터 000 까지의 합은 0000이다
		 */
		int i;
		int sum = 0;
		for (i = 0; sum + i <= 10000; i++) {
			sum += i;
		}
		System.out.printf("자연수 1부터 %d까지의 합은 %d 이다", i - 1, sum);
	}
	

}
