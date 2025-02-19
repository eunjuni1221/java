package selfstudy;

public class sum10000 {
	public static void main(String[] args) {
		
		int n = 0;
		int sum = 0;
		for(int i = 1; sum + i <= 10000; i++) {
			sum += i;
			n = i;
		}
		System.out.printf("1부터 %d까지의 합은 %d이다", n, sum);
	}

}
