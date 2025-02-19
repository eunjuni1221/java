package myobj;

public class Baseball {
	
	int postionNum;
	
	static String baseballStadium = "국제 규격의 충족하는 야구장";
	
	// 야구 포지션은 고정
	static String[] position = {"DH", "P", "C", "1B", "2B", "3B", "SS", "LF", "CF", "RF"};
	
	Baseball(int positionNum) {
		this.postionNum = positionNum;
	}
	void baseballPositon() {
		System.out.printf("외야 수비를 맡는 포지션은[%s, %s, %s]\n", position[7], position[8], position[9]);
		System.out.printf("내야 수비를 맡는 포지션은[%s, %s, %s, %s, %s, %s]\n", 
				position[1], position[2], position[3], position[4], position[5], 
				position[6]);
		System.out.printf("유일하게 수비를 들어가지 않고 타석에만 들어가는 포지션은[%s]\n", position[0]);
		System.out.printf("유일하게 타석에 들어가지 않고 투구를 하는 포지션은[%s]\n", position[1]);
		
	}
	static void plays() {
		System.out.printf("야구는 %s에서만 프로경기를 진행할 수 있다\n", baseballStadium);
	}
	public static void main (String [] args) {
		Baseball rule = new Baseball(12);
	    rule.baseballPositon();
        plays();
	}
}

