package myobj.pirate;

public class PirateGamePlayer {
	String name;
	int money; // 플레이어의 소지금
	int score; // 매 게임마다 초기화되는 점수
	
	// 생성자: 플레이어 이름을 받고 기본 소지금은 3000으로 설정
	public PirateGamePlayer(String name) {
		this(name, 3000); // 기본 소지금 3000설정
	}
	
	public PirateGamePlayer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	// 해당 클래스의 필드값을 꺼내서 볼 수 있는 메서드들 : Getter
	// 해당 클래스의 필드값을 수정할 수 있는 메서드들 : Setter
	
	// 점수를 설정하는 메서드
	public void setScore(int score) {
		this.score = score;
	}	
	
	// 점수를 추가하는 메서드
	public void addScore(int score) {
		this.score += score;
	}
	
	// 현재 점수를 반환하는 메서드
	public int getScore() {
		return score;
	}
	
	// 소지금을 설정하는 메서드
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 소지금을 추가하는 메서드
	public void addMoney(int money) {
		this.money += money;
	}

	// 현재 소지금을 반환하는 메서드
	public int getMoney() {
		return money;
	}
	
	// 이름을 설정하는 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	// 이름을 반환하는 메서드
	public String getName() {
		return name;
	}
	
}





