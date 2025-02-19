import java.util.Random;

public class C02_OOP {
	/*
	 *  # 객체 지향 프로그래밍 (Object Oriented Programming)
	 *  
	 *   - 변수와 함수들을 하나의 개념으로 묶어서 생각하는 프로그래밍 방식
	 *   - 변수와 함수들을 무분별하게 사용하다보면 여러가지 문제들이 발생하기 때문에
	 *     우리에게 친숙한 개념으로 묶어서 생각하기 시작했다
	 *   - 변수는 주로 해당 객체의 현재 상태를 나타낸다
	 *   - 함수는 주로 해당 객체의 여러 기능(method)을 나타낸다 기능(method)은 해당 객체의 상태를 변화시킨다
	 *   
	 *   ex) 책
	 *   
	 *   - 책의 현재 상태 (변수로 지정할만한 것들)
	 *     제목, 글쓴이, 엮은이, 발행일, 고유번호(ISBN), 전체페이지, 현재 페이지, 책갈피가 꽃힌 위치
	 *     
	 *    - 책의 기능 (함수로 만들어볼만한 것들)  
	 *    	책장 넘기기(현재 페이지 + 1)
	 *    	책 펴기(특정 페이지로 바로 이동)
	 *    	책 덮기(페이지를 0으로 이동)
	 *    	책갈피 꽃기(책갈피 위치 배열에 현재 페이지 추가)
	 *    
	 *  # 클래스 (class)
	 *   
	 *   - 객체지향에서 말하는 객체를 프로그래밍 언어로 표현하는 문법
	 *   - 클래스는 해당 객체의 설계도 역할을 한다
	 *   - 클래스는 설계도에 불과하기 때문에 정의한 시점에서는 실체가 없다
	 *   - 클래스를 사용해 찍어내는 실체를 인스턴스(instance)라고 부른다
	 *   - 클래스를 사용해 새로운 인스턴스를 생성할 때 new를 사용한다
	 */
	public static void main (String [] args) {
		// 하나의 클래스로 여러 인스턴스를 찍어낼 수 있다
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		
		// 클래스 내부의 변수는 인스턴스가 생성된 뒤에 .을 찍어 접근할 수 있다
		
		// 각 인스턴스는 각자의 값을 지닐 수 있다
		book1.title = "컴퓨터활용능력 1급 실기";
		book2.title = "PERFECT 전산세무 2급";
		book3.title = "성낙현의 JSP 자바 웹 프로그래밍";
		
		System.out.println("book1의 현재 페이지: " + book1.currPage);
		System.out.println("book2의 현재 페이지: " + book2.currPage);
		System.out.println("book3의 현재 페이지: " + book3.currPage);
		
		// 클래스 내부의 메서드도 생성된 인스턴스에 .을 찍고 사용할 수 있다
		// 해당 메서드는 다른 인스턴스를 변화시킬 수 없고
		// 자기 자신의 인스턴스(this)만 변화시킬 수 있다
		
		for (int i = 0; i < 120; i++) {
			book1.nextPage();
		}
		
		book3.gotoPage(30);
		
		System.out.println("=========================================");
		System.out.println("book1의 현재 페이지: " + book1.currPage);
		System.out.println("book2의 현재 페이지: " + book2.currPage);
		System.out.println("book3의 현재 페이지: " + book3.currPage);
		
		Subway subway1 = new Subway();
		subway1.station1 = "당고개역";
		subway1.station2 = "상계역";
		subway1.station3 = "노원역";
		subway1.engineer = "트라웃";
		subway1.price = 1000;
		
		System.out.println("=================(Line 1)=======================");
		subway1.showStatus();
		subway1.nowPrice();
		subway1.nextStation();
		
		Subway subway2 = new Subway();
		subway2.station1 = "창동역";
		subway2.station2 = "쌍문역";
		subway2.station3 = "수유역";
		subway2.engineer = "오타니";
		subway2.price = 1200;
		
		System.out.println("=================(Line 2)=======================");
		subway2.showStatus();
		subway2.nowPrice();
		subway2.nextStation();
		
		Subway subway3 = new Subway();
		subway3.station1 = "미아역";
		subway3.station2 = "미아사거리역";
		subway3.station3 = "길음역";
		subway3.engineer = "하퍼";
		subway3.price = 1500;
		
		System.out.println("=================(Line 3)=======================");
		subway3.showStatus();
		subway3.nowPrice();
		subway3.nextStation();
		
		System.out.println("=================(Weapon)=======================");
		
		Weapon w1 = new Weapon();
		Weapon w2 = new Weapon();
		
		w1.attack();
		
		for (int i = 0; i < 1000; i++) {
			w1.upgrade();
		}
		w1.attack();
	}

}
class Book {
	// static 키워드가 붙지 않는 변수들을 인스턴스 변수라고 한다
	String title;
	String writer;
	int price;
	int currPage;
	int maxPage;
	
	// static 키워드가 붙지 않는 메서드들을 인스턴스 메서드라고 한다
	void nextPage() {
		// this: 이 메서드를 호출한 인스턴스 자기 자신을 의미
		++this.currPage;
	}
	void gotoPage(int page) {
		this.currPage = page;
	}
}
/*
 *  실제로 존재하는 현실의 객체를 하나 참고하여 클래스를 생성한 후 해당 클래스의 인스턴스를 생성하고 각 인스턴스의 상태를 출력해보세요
 *  (인스턴스 3개 이상, 인스턴스 변수 3개 이상, 인스턴스 메서드 2개 이상, 책 X)
 */

class Subway {
	String[] stations;
	String station1;
	String station2;
	String station3;
	String engineer;
	int price;
	
	// 지하철 현재요금 출력
	void nowPrice() {
		System.out.println("현재 요금은 " + this.price + "원입니다");
	}
	
	// 다음역 이동
	void nextStation() {
		System.out.println("현재역은 " + this.station1 + "입니다");
		System.out.println("다음역은 " + this.station2 + "입니다");
		this.station1 = this.station2; // 다음 역 이동
		this.station2 = this.station3; // 또 다음 역 이동	
		
	}
	
	// 상태
	void showStatus() {
		System.out.println("운행하는 역: " + this.station1 + "," + this.station2 + "," + this.station3);
		System.out.println("현재 기관사: " + this.engineer);
	}
	
}
class Weapon {
	String name;
	double attackSpeed;
	int damage = 50;
	int duration;
	int upgrade;
	int[] upgradeChanceTable = {100, 90, 90, 80, 80, 60, 40, 20, 10, 5};
	Random ran = new Random();
	
	// 인스턴스 변수를 활용하거나 또는 변화시키는 것이 인스턴스 메서드이다
	void attack() {
		System.out.printf("공격! %d의 데미지를 입혔습니다!\n", damage + (upgrade * 100));
	}
	void upgrade() {
		if (upgrade == 10) {
			System.out.println("최대 강화치");
			return;
		} 
		// 
		boolean[] upgradeSuccess = new boolean[100];
		
		// 업그레이드 확률만큼 true를 채워 놓으면 된다
		// true를 고르면 강화 성공으로 친다
		int upgradeChance = upgradeChanceTable[upgrade];
		for (int i = 0; i < upgradeChance; i++) {
			upgradeSuccess[i] = true;
		}
		if(upgradeSuccess[ran.nextInt(100)]) {
			System.out.printf("강화 성공! [현재 강화: %d]\n", upgrade);
			++upgrade;
		} else {
			if(upgrade > 6) {
				--upgrade;
				System.out.println("강화 실패로 단계가 낮아졌습니다.");
			}
			System.out.printf("강화 실패 [현재 강화: %d]\n", upgrade);
		}
		
		
	}
}
