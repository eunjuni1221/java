package doitjava;

public class Persontest {
	public static void main(String[] args) {
		
		// 디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		Person person1 = new Person();
		person1.name = "오타니";
		person1.weight = 102.2F;
		person1.height = 193.5F;
		
		// 인스턴스 변수 초기화와 동시에 클래스 생성
		Person person2 = new Person("트라웃", 188, 106);
	}

}
