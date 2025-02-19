package doitjava;

public class Opearation {
	public static void main (String [] args) {
		
		int num = 10;
		
		System.out.println(num);
		System.out.println(-num); // 값 10에 -가 붙어서 -10이 출력되지만 num값이 실제로 바뀌지는 않음
		System.out.println(num);
		
		num = -num; // num 값을 음수로 바꿔서 다시 num에 대입함
		System.out.println(num);
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 95;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
	}

}
