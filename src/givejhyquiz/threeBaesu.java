package givejhyquiz;

public class threeBaesu {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 1; i <= 100; i++) {
			if(!(i % 3 == 0 || i % 4 == 0)) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 100사이에서 3 또는 4의 배수의 합" + sum);
	}

}
