package doitjava;

public class Operator {
	public static void main(String[] args) {
		int num = 10;
		
		System.out.println(+num); // 값 10이 그대로 출력됨
		System.out.println(-num); // 값 10에 -가 붙어서 -10이 출력되지만 num값이 실제로 바뀌지는 않는다
		System.out.println(num); // 값 10이 그대로 출력됨
		
		num = -num;
		System.out.println(num); // 값 -10이 출력됨
	}
}
