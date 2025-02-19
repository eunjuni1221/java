package givejhyquiz;

public class Array {
	/*
	 *  크기가 20인 int 형 배열 scores를 선언하고 반복문을 사용하여 배열의 요소에
	 *  7의 배수 7, 14, 21, 28 ...을 저장한다. 다음에 모든 배열 요소를 출력한 후에 모든 요소를
	 *  더하여 합을 출력하는 프로그램을 작성하라
	 *  
	 *  (실행결과 예)
	 *  7의 배수: 7, 14, 21, 28, ...
	 *  7의 배수의 합: 0000
	 */
	public static void main(String[] args) {
		int[] scores = new int[20];
		int sum = 0;
		
		System.out.print("7의 배수:");
		for(int i = 0; i < scores.length; i++) {
			scores[i] = (i + 1) * 7;
			System.out.print(scores[i]);
			if(i < scores.length - 1) {
				System.out.print(", ");
			}
			sum += scores[i];
		}
		System.out.println();
		System.out.print("7의 배수의 합: " + sum);
	}

}
