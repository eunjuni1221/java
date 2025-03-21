package quiz;

import myobj.pirate.PirateGame;

public class C05_PirateGame {
	/*
	 	통아저씨 게임을 만들어보세요
	 	
	 	1. 게임이 시작되면 꽝 자리가 정해진다	 		 	
	 	2. 플레이어는 아저씨가 튀어나올때까지 돌아가면서 계속 자리를 선택해야 한다
	 	   (플레이어는 4명으로 고정한다)		 	
	 	3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
	 	   (꽝의 위치는 매 판 시작시 랜덤으로 설정된다)	 	   	 	
	 	4. 아저씨가 발사되면 해당 플레이어의 점수를 깎고 나머지의 점수를 
	 	   찌르는데 성공한 횟수에 비례하여 증가시킨다	 		 	
	 	5. 한 게임이 끝날 때마다 점수로 순위를 매기고 순위에 따라 소지금이 변동된다 
	 	   (1위 +1000, 2위 +500, 3위 -500, 4위 -1000) 		 	
	 	6. 게임을 그만하겠다고 하거나 또는 한 사람의 소지금이 -가 된다면 게임이 종료된다 	 	
	 	7. 한 게임이 종료될 때마다 스코어를 출력해준다 
	 	   (이름, 점수, 남은 소지금(+얼마 벌었나) 등)
	*/
	public static void main(String[] args) {
		PirateGame game = new PirateGame(); // pirateGame 객체를 생성하여 게임 준비
		game.start(); // 게임을 시작하는 메서드 호출
	}
}
