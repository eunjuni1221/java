package myobj;

public class TrumphCard {

//}
//class TrumphCard1 {
	char shape;
	int num;
	
	// 모든 인스턴스에서 참조해야하는 역할을 지닌 경우 static이 어울린다
	static String[] displayNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	// 카드의 너비와 높이는 모든 카드에서 같은 값을 지녀야 하므로 인스턴스 영역으로 선언하면 용량이 아깝다
	public static int width = 80; // 너비
	public static int height = 200; // 높이
	
	public TrumphCard(char shape, int num) {
		this.shape = shape;
		this.num = num;
		
	}
	public static void printCardSize () {
		System.out.printf("카드 너비/높이: %d/%d\n", width, height);
	}
	
	public void print() {
		System.out.printf("[%c%s]\n", shape, displayNum[num]);
	}
}
