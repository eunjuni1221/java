
public class C03_Constructor {
	/*
	 *  # 클래스의 생성자(Constructor)
	 *  
	 *   - 해당 클래스의 새 인스턴스를 생성할 때 new와 함께 호출되는 것
	 *   - 클래스 이름과 똑같은 이름 뒤에 ()를 붙여 사용한다
	 *   - 생성자를 정의하지 않은 클래스에는 자동으로 아무것도 없는 기본 생성자가 생성되어 있다
	 *   - 생성자는 주로 인스턴스 변수의 값을 초기화하는 용도로 많이 사용한다
	 *   - 생성자는 메서드처럼 오버로딩이 가능하다 (매개변수의 타입 또는 개수가 다르면 성립)
	 */
	public static void main (String [] args) {
		Apple a1 = new Apple(1300, "A+");
		Apple a2 = new Apple(999, 8.8);
		
		a1.info();
		a2.info();
		
		System.out.println("===============================");
		BaseballCard ohtani = new BaseballCard("오타니", "Showtime", "L/L", "1994.07.05", "2018.03.29");
		
		ohtani.playerBasicInfo();
	}

}
class Apple {
	// 인스턴스 변수는 기본적으로 초기화가 되어있다 (배열과 유사함)
	// (인스턴스 변수 aka 멤버 변수, 필드......)
	int price;
	String grade;
	double sweet;
	double weight;
	
	// 생성자 (이 클래스로 인스턴스를 생성하기 위해서 반드시 호출해야 하는 것)
	Apple(int price, String grade) {
		// 지역변수와 멤버변수의 이름이 같은 경우 this를 사용해 구분해 줄 수 있다
		this.price = price;
		this.grade = grade;
		
	}
	// 생성자 오버로딩 (메서드 오버로딩과 마찬가지로 개수 또는 타입이 다르면 성립
	Apple(int price, double sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	void info() {
		System.out.printf("[%d원/%s/%.1f/%.1f]\n", price, grade, sweet, weight);
		
	}
	
}
/*
 *  실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후 해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상태를 출력해보세요
 *  (인스턴스 3개 이상, 인스턴스 변수 3개 이상, 인스턴스 메서드 2개 이상, 생성자 2개 이상, 아까 했던것 금지)
 */
class BaseballCard {
	String name;
	String nickname;
	String batterThrow;
	String born;
	String debut;
	int salaly;
	double height;
	double weight;
	
	BaseballCard(String name, String nickname, String batterThrow, String born, String debut) {
		this.name = name;
		this.nickname = nickname;
		this.batterThrow = batterThrow;
		this.born = born;
		this.debut = debut;
	}
	void playerBasicInfo () {
		System.out.printf("[이름]: %s\n[별명]: %s\n[투/타]: %s\n[생년월일]: %s\n[데뷔날짜]: %s\n"
				, name, nickname, batterThrow, born, debut );
	}
	
}