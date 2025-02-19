package doitjava.thisex;

public class Person {
	String name;
	int age;
	
	Person() {
		// Person(String, int) 생성자 호출
		this("이름 없음", 1);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	// 반환형은 클래스형
	Person returnItSelf() {
		return this; // this 반환
	}
}

