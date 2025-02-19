package givejhyquiz;

public class AccountTest {
	/* 은행계좌를 나타내는 클래스 Account와 이를 테스트하는 클래스 AccountTest를 만
	 들어 보자. Account 클래스의 모든 필드는 private 멤버로 하고, 필드명과 자료형은
	다음과 같다. 예금주 이름(String name), 잔고(int balance). 그리고 메소드는 매개
	변수 2개인 생성자 Account(String name, int balance), 예금을 적립하는 메소드
	deposit(int amount), 예금을 인출하는 메소드 withdraw(int amount), 그리고 은행
	계좌 속성을 출력하는 print( ) 메소드를 만들어라. 먼저 생성자를 2번 호출해서 잔액
	은 0원이고, 예금주가 홍길동, 임꺽정인 은행계좌를 만들고, 다음에 홍길동 계좌에
	150,000원을 적립하고, 임꺽정 계좌에 120,000원을 적립한 후, 현재 잔고를 출력한
	다. 마지막으로 홍길동 계좌에서 90,000원을, 임꺽정 계좌에서 50.000원을 인출하고
	현재 잔고를 출력한다. 실행결과는 아래와 같다.
	(실행결과 예)
	새로운 계좌가 만들어졌습니다. 예금주: 홍길동, 잔고: 0원 //생성자 호출시 출력
	새로운 계좌가 만들어졌습니다. 예금주: 임꺽정, 잔고: 0원
	홍길동 님의 현재 잔고는 150,000원 입니다. //print( ) 메소드 호출
	임꺽정 님의 현재 잔고는 120,000원 입니다. 홍길동 님의 현재 잔고는 60,000원 입니다. 임꺽정 님의 현재 잔고는 70,000원 입니다.
	*/
	public static void main(String[] args) {
		Account hong = new Account("홍길동", 0);
		Account lim = new Account("임꺽정", 0);
		
		hong.deposit(150000);
		lim.deposit(120000);
		
		hong.print();
		lim.print();
		
		hong.withdraw(90000);
		lim.withdraw(50000);
		
		hong.print();
		lim.print();
	}
}
