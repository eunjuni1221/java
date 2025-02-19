package doitjava.thisex;

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf(); // this 값을 클래스 변수에 대입
		System.out.println(p);			  // noName.returnItSelf()의 반환 값 출력
		System.out.println(noName); 	  // 참조 변수 출력
	}

}
