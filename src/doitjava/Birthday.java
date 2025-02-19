package doitjava;

public class Birthday {
	int day;
	int month;
	int year;
	
	// 태어난 연도를 지정하는 메서드
	public void setYear(int year) {
		// bDay.year = year;와 같다
		this.year = year;
	}
	
	// this 출력 메서드
	public void printThis() {
		// System.out.println(bDay);와 같음
		System.out.println(this);
	}

}
