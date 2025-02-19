package givejhyquiz;

public class ArraySeven {
	public static void main(String[] args) {
		
		int scores[] = new int[20];
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (i + 1) * 7;
			sum += scores[i];
		 }	
		System.out.println("7의 배수의 합은 " + sum);
	}
}
