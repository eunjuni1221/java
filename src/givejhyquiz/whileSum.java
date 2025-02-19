package givejhyquiz;

public class whileSum {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum + i <= 10000) {
			sum += i;
			i++;
		}
		System.out.printf("자연수 1부터 %d까지의 합은 %d 이다", i, sum);
	}

}
