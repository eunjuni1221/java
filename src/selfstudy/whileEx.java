package selfstudy;

public class whileEx {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 20) {
			sum = sum + num;
			num++;
			System.out.println("1부터 10까지의 합은 sum입니다");
		}
	}
}
