package doitjava;

public class Person {
	String name;
	float height;
	float weight;
	
	// 디폴트 생정자 직접 추가 (디폴트 생성자)
	public Person() {
		
	}
	
	// 사람 이름을 매개변수로 입력받아서 Person 클래스를 생성하는 생성자 (이름을 매개변수로 입력받은 생성자
	public Person(String pname) {
		name = pname;
	}
	// 이름, 키, 몸무게를 매개변수로 입력 받는 생성자
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
