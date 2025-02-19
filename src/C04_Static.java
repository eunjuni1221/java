
import myobj.Sheep;
import myobj.TrumphCard;

public class C04_Static {
	/*
	 	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역)
	 	
	 	- 인스턴스 영역의 반대 개념
	 	- 같은 클래스로 만들어진 모든 인스턴스들이 함께 공유하는 영역
	 	- 앞에 static이 붙은 자원들은 모든 인스턴스들이 함께 사용하는 공동 자원이 된다
	*/
	public static void main(String[] args) {
		Sheep s = new Sheep();
		myobj.Apple a = new myobj.Apple("보라색");
		
		s.harvest();
		s.setColor(a);
		
		System.out.println(
				s.getRemainHarvestTime() / 1000 / 60 + "분 남았습니다.");
		
		TrumphCard t1 = new TrumphCard('♣', 0);
		TrumphCard t2 = new TrumphCard('♡', 11);
		TrumphCard t3 = new TrumphCard('◇', 10);		
		
		// static 자원들은 어떤 인스턴스로 접근하더라도 같은 값을 보게되기 때문에
		// 클래스 이름에 .을 찍고 사용하는 것을 권한다
		TrumphCard.width = 90;
		TrumphCard.height = 220;		
		TrumphCard.printCardSize();
		
		t1.print();
		t2.print();
		t3.print();
	}
}

// myobj 패키지에 static 자원을 포함한 클래스를 하나 정의해보세요






