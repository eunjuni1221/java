package doitjava;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	// 학생 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 학생 이름을 매개변수로 전달
	public void setStudentName(String name) {
		studentName = name;
	}
public static void main(String[] args) {
	
	Student student1 = new Student();
	
	student1.studentName = "오타니"; // 멤버 변수 사용
	System.out.println(student1.getStudentName()); // 메서드 사용
}
}

