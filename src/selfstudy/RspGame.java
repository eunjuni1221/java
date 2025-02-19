package selfstudy;

import java.util.Random;
import java.util.Scanner;

public class RspGame {
	/*
	 *  랜덤 함수를 이용해서 컴퓨터에게 가위, 바위, 보를 랜덤으로 입력
	 *  사용자는 scanner을 활용해 가위 바위 보를 입력
	 *  사용자가 그만 입력 게임종료
	 *  
	 *  그 이외 단어 다시 입력 출력
	 *  
	 *  사용자가 졌을 경우 > " 탈락입니다. 공유는( 컴퓨터가 낸 것 )를 냈습니다. 탕. "
	 *  사용자가 이겼을 경우 > "성공입니다. 공유는 (컴퓨터가 낸 것)를 냈습니다."
	 *  비겼을 경우 > "비겼습니다! 공유도 (컴퓨터가 낸 것)를 냈습니다."
	 */
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in); // 사용자에 가위, 바위, 보를 입력받을 스캐너 생성
		
		Random ran = new Random(); // 컴퓨터 가위, 바위, 보 랜덤 기계 생성
		
		// 게임 시작, 종료 값 설정 이 게임에서 게임시작, 종료 값은 각각 0, 1(종료)로 고정할거기 때문에 final 사용
		final int QUIT_GAME_INT = 0; // 0를 누를시 return으로 게임 종료시킬 예정
		final int START_GAME = 1; // 1을 누를시 게임 시작
		
		final String QUIT_GAME_STR = "그만"; // 사용자가 그만을 입력한 경우에도 게임 종료 
		
		String rsp[] = {"가위", "바위", "보"}; // 가위, 바위, 보 배열
		
		// 게임 시작여부를 묻는 반복문
		while (true) { 
			System.out.println("============가위바위보 게임===============");
			System.out.println("종료: 0 게임시작: 1 >> "); // 입력 받을 프린트 생성
			
			int userChooseGame = sc.nextInt(); // 게임 시작, 종료를 위한 유저 입력값
			
			if(userChooseGame == QUIT_GAME_INT) { // userChooseGame이 QUIT_GAME_INT와 같다면 게임 종료
				System.out.println("게임을 종료합니다");
				return; // 리턴으로 메인문 밖으로 빠져나가 아예 게임 실행 종료
			
			} else if (userChooseGame == START_GAME) { // userChooseGame이 START_GAME와 같다면 게임 시작
				System.out.println("게임 시작 중 Loading...");
				break; // while 반복문을 빠져나가 게임 시작
			
			} else { // 그 이외의 입력들 (0,1을 제외한)
				System.out.println("다시 입력해주세요"); // while문 계속 반복 0, 1 입력값이 나올 때 까지
			}
			
		}
		
		// 게임 시작
		while (true) {
			/**
			 *  컴퓨터의 선택을 랜덤으로 설정
			 *  0: 가위 1: 주먹 2: 보자기 
			 *  String rsp[] = {"가위", "바위", "보"}; 랜덤으로 설정한 값
			 *  rsp[0]은 가위
			 *  rsp[1]은 바위
			 *  rsp[2]는 보
			 */ 
			// 컴퓨터의 선택을 랜덤으로 설정
			int comChoose = ran.nextInt(3); // 크기가 3개인 랜덤값 생성 인덱스 값으론 0, 1, 2
			
			// 사용자 입력받기
			System.out.print("안내면 진거 가위바위보>> ");
			String userPlay = sc.next(); // 사용자 입력 받는 곳 단어 하나만 입력 받으면 되기 때문에 next()를 사용
			
			// 그만 입력할 시 게임 종료
			if (userPlay.equals(QUIT_GAME_STR)) { // userPlay String 값이 QUIT_GAME_STR라면 게임 종료 예정
				System.out.println("게임을 종료합니다");
				return; // 리턴으로 메인문 밖으로 빠져나가 아예 게임 실행 종료
			}
			
			// 사용자의 입력이 유효한지 확인
			if(!userPlay.equals("가위") && !userPlay.equals("바위") && !userPlay.equals("보")) { // 유저 입력 값이 가위, 바위, 보가 아니라면
				System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
				continue; // 다시 입력받기 위해 continue 사용
			}
			
			// 결과 출력 (삭제)
			// System.out.println("컴퓨터는 " + rsp[comChoose] + "를 냈습니다");
			/*
			 * rsp[comChoose] rsp배열에 comChoose가 0이라면 가위 1이라면 바위 2라면 보
			 */
			
			
			// 게임 결과
			
			// 현재 상황에서 String(user) int(com)과 비교를 해야하는 상황이기 때문에 String(user)값은 int와 비교하기 위해 int userRsp 선언
			int userRsp = 0; 
			for (int i = 0; i < rsp.length; i++) { // for문으로 rsp.length값까지 반복문 돌리기
				if(userPlay.equals(rsp[i])) { //equals 메서드를 통해  userPlay와 rsp[i]를 비교
					userRsp = i; // userRsp는 숫자로 비교하기 위해 정수로 변환
				}
			}
			
			if (comChoose == 2 && userRsp == 0) { // 0: 가위 2: 보 인데 유저가 지는 상황이 발생하므로
				userRsp = 3; //userRsp를 3으로 변환
			} else if (comChoose == 0 && userRsp == 2) { // 0: 가위 2: 보 인데 유저가 이기는 상황이 발생하므로
				comChoose = 3;  // comChoose를 3으로 변환
			}
			
			if(userRsp == comChoose) { // 숫자가 같으면 무승부
				System.out.printf("탈락입니다. 공유는( 컴퓨터가 낸 것 )를 냈습니다. 탕.",rsp[comChoose]);
			} else if (userRsp > comChoose) { // 유저 숫자가 높으면 승리
				System.out.printf("성공입니다. 공유는 %s를 냈습니다.", rsp[comChoose]);
			} else { // 컴퓨터 숫자가 높으면 짐
				System.out.printf("탈락입니다. 공유는 %s를 냈습니다. 탕. ", rsp[comChoose]);
			}
		}

	}
	
}
