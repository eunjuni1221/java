package doitjava;

public class Opertion3 {
	public static void main (String [] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); // AND 연산에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음
		System.out.println (value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10); // OR 연산에서 앞 항의 결과 값이 참이므로 이 문장은 실행하지 않는다
		System.out.println (value);
		System.out.println(num1);
		System.out.println(i);
	}

}
