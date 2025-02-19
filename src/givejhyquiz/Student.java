package givejhyquiz;

public class Student {
	/*
	 * 교재 124쪽의 예제를 참조하여 문제를 풀어라. 즉, 학생을 나타내는 클래스 Student
	   와 객체를 만들어 테스트하는 클래스 StudentTest를 만들어라. Student 클래스의 필
	   드 멤버는 이름(name), 학번(rollno), 나이(age)로 한다. 아래의 예와 같이 본인에 대
	   한 객체를 생성하여 필드값을 설정하고 이를 출력하도록 한다.
	   (실행결과 예)
	   학생의 이름: 김전자
 	   학생의 학번: 20190001
	   학생의 나이: 20

	 */
	String name;
	int rollno;
	int age;
	
	public Student(String name, int rollno, int age) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	public void displayInfo() {
		System.out.println("학생의 이름: " + name);
		System.out.println("학생의 학번: " + rollno);
		System.out.println("학생의 나이: " + age);
	}
	

}
