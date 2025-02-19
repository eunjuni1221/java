package myobj.pirate;

import java.util.Scanner;

public class PirateGame {
	
	Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
	
	Barrel barrel; // 게임에 사용할 Barrel 객체
	PirateGamePlayer[] players; // 플레이어들의 배열
	
	int turn; // 현재 턴을 추적하는 변수
	boolean brokenExist; // 플레이어 중 파산한 사람이 있는지 확인하는 boolean 변수
	
	final static int DEFAULT_BARREL_SIZE = 20; // 기본 Barrel 크기 바뀌지 않는다
	final static int DEFAULT_PLAYER_LEN = 4; // 기본 플레이어 수 (4명 고정)
	
	final static boolean TEST_MODE = false; // 테스트 모드 여부 (false면 일반 유저 플레이모드)
	
	// PriateGame 클래스의 생성자
	public PirateGame() {
		barrel = new Barrel(DEFAULT_BARREL_SIZE); // 기본 크기의 Barrel 객체 생성 (20개)
		players = new PirateGamePlayer[DEFAULT_PLAYER_LEN]; // 기본 4명의 플레이어 배열
	}
	
	// 플레이어들을 설정하는 메서드
	// 사용자로부터 이름을 입력받아 PirateGamePlayer 객체를 생성하고 이를 배열에 저장
	void setPlayers() { 
		// 플레이어 수 만큼 반복하면서 플레이어 이름을 입력받고 객체를 생성
		for (int i = 0, len = players.length; i < len; ++i) {
			System.out.printf("%d번째 플레이어의 이름을 설정하세요.\n", i + 1); // 플레이어 이름을 요청
			String name = sc.next(); // 플레이어 이름을 입력받는다
			players[i] = new PirateGamePlayer(name); // 새로운 플레이어 객체 생성
		}
	}
	
	// 게임 종료 후 결과 처리
	public void endgameProcess() {
		// 점수순으로 플레이어 순위 결정 (정렬, 점수 제일 작은 사람을 맨 오른쪽으로)
		for (int i = 0; i < players.length - 1; ++i) {			
			for (int j = 1; j < players.length - i; ++j) { 
				PirateGamePlayer left = players[j - 1]; // 왼쪽
				PirateGamePlayer right = players[j]; // 오른쪽
				if (left.getScore() < right.getScore()) {
					// 점수가 더 작은 왼쪽 플레이어와 점수가 더 큰 오른쪽 플레이어를 교환
					players[j - 1] = right;
					players[j] = left;
				}
			}			
		}
				
		// 순위에 따라 소지금 반영
		players[0].addMoney(1000); // 1위: 1000원 추가
		players[1].addMoney(500); // 2위: 500원 추가
		players[2].addMoney(-500); // 3위: 500원 차감
		players[3].addMoney(-1000); // 4위: 1000원 차감
		
		// 순위 및 소지금 출력
		for (int i = 0; i < players.length; ++i) {
			PirateGamePlayer p = players[i]; 
			
			System.out.printf("%d위: %s(%d점)/%d원\n",
					i + 1, p.getName(), p.getScore(), p.getMoney());
		}
		
		// 소지금이 -가 된 사람이 있다면 게임 종료
		for (int i = 0; i < players.length; ++i) {
			brokenExist |= players[i].getMoney() < 0;
		}
		
		// 플레이어들의 점수 0점으로 초기화
		for (int i = 0; i < players.length; ++i) {
			players[i].setScore(0);
		}
	}
	
	// 게임 시작 메서드
	public void start() {		
		setPlayers(); // 플레이어 설정
		brokenExist = false; // 파산 상태 초기화
		
		// 파산한 사람이 없으면 게임을 계속한다
		while (!brokenExist) {
			barrel.reset(); // 새로운 게임을 위한 Barrel 초기화
			turn = 0; // 턴 초기화
			
			// 아저씨가 발사되었는가? 아니오
			boolean pirateLaunched = false;
			
			// 아저씨가 발사되지 않은동안 반복하겠다
			while (!pirateLaunched) {
				// 이번턴의 플레이어
				PirateGamePlayer p = players[turn % players.length]; // turn값을 players.length로 나눈 나머지로 현재 플레이어 설정
				
				System.out.printf("\"%s\"님이 찌르실 차례입니다 (현재 %d점)\n", 
						p.getName(), p.getScore()); // 현재 플레이어 이름과 점수를 출력
				if (TEST_MODE) {
					barrel.testPrint(); // 테스트 모드이면 테스트용을 출력해라
				} else {
					barrel.print(); // 나중에 게임을 진행할 때 가릴건 가리면서 출력해주는 출력 모드
				}
				
				// 찌를 곳을 선택하는 반복문
				while (true) { // 플레이어가 올바른 선택을 할 때 까지 반복
					System.out.printf("%d ~ %d중에 선택 > ", 1, barrel.size);	 // 칼을 찌를 홈의 번호를 입력받기 위해 출력			
					int index = sc.nextInt() - 1; // 인덱스값은 0 ~ 19 유저가 선택하는 값은 1 ~ 20이므로 -1을 해준다 (0부터 시작하므로)
					
					if (index < 0 || index >= barrel.size) { // 잘못된 번호를 입력했다면
						System.out.println("범위를 벗어난 번호입니다. 잘 보고 골라주세요.");
						continue; // 다시 입력을 받는다
					}
					
					char value = barrel.stab(index); // 선택한 위치 찌르기
					
					if (value == 'O') { // 찌른 곳이 생존하는 곳이라면
						// 살아남음 (점수 올려야 함)
						p.addScore(100 + 10 * turn); // 점수 추가(기본 100점에 턴마다 가중치)
						break; // 점수를 추가한 후 다음 턴으로 넘어가기 위해 if문을 빠져나옴
					} else if (value == 'X') { // 찌른 곳이 꽝인 경우
						// 지금 찌른 사람이 패배 (게임 끝)
						p.setScore(0); // 발사된 플레이어의 점수는 0점
						pirateLaunched = true; // 통아저씨가 발사됨 pirateLaunched를 true로 설정
						System.out.println("통아저씨가 하늘로 날라갔습니다...");
						System.out.println(p.getName() + "님의 패배입니다!!");
						
						// 점수에 따라 소지금 변경하기
						endgameProcess();
						
						break; // 게임을 종료하고 더 이상 진행하지 않는다
					} else if (value == 'S') { // 이미 찔렀던 곳을 찔렀다면
						// 다시 찌를 기회를 줘야 함
						System.out.println("찔렀던 위치입니다. 잘 보고 골라주세요.");
					} 
				}
				
				++turn;
			}
			
			// 게임을 계속 하시겠습니까?
			if (!brokenExist) { // 파산이면 brokenExist가 true가 됨 이 if문은 false가 되는 상황이므로 if문에 접근이 안됨
				System.out.println("계속하시겠습니까(그만하려면 N)?");
				System.out.print("> ");
				String con = sc.next(); // 사용자로부터 'N' 또는 다른 값을 입력받는다
				
				if (con.charAt(0) == 'N') { // 'N'을 입력받는다면 게임을 종료
					System.out.println("게임을 종료합니다.");
					break; // while문을 빠져나와 게임을 종료한다
				} 
			}
		}
	}
}



