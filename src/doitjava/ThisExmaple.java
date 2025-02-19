package doitjava;

public class ThisExmaple {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2001); // 태어난 연도를 2001으로 지정
		System.out.println(bDay);
		bDay.printThis();
	}

}
