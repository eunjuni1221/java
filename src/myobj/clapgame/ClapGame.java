package myobj.clapgame;

import java.util.Scanner;

public class ClapGame {
	
	Scanner sc = new Scanner(System.in);
	
	final int[] CLAP_NUMBERS = {3, 6, 9};
	final static String[] WRONG_ANSWERS = {"앗!", "...", "mPm"};
	
	ClapGamePlayer[] players = {
			new ClapGamePlayer("플레이어"),
			new ClapGamePlayer("컴퓨터")
	};
	
	public ClapGame() {
		
	}
	
	// 플레이어 순서 뒤섞기
	void shufflePlayer() {
		for(int i = 0; i < 10; i++) {
			int ranIndex = (int)(Math.random() * players.length);
			ClapGamePlayer temp = players[0];
			players[0] = players[ranIndex];
			players[ranIndex] = temp;
		}
	}
	
	String generateComputersAnswer (int turn) {
		if((int)(Math.random() * 100) < 85) {
			return getAnswer(turn);
		} else {
			return WRONG_ANSWERS[(int)(Math.random() * WRONG_ANSWERS.length)];
		}
	}
	
	// 지금 턴이 몇 턴인지 알려주면 정답을 알려주는 메서드
	String getAnswer(int turn) {
		String answer = "";
		
		int num = turn;
		while (num > 0) {
			int digit = num % 10;
			
			for (int i = 0; i < CLAP_NUMBERS.length; i++) {
				if (digit == CLAP_NUMBERS[i]) {
					answer += "짝";
					break;
				}
			}
					
			num /= 10;
		}
		if (answer.length() == 0) {
			// 정답이 박수가 아닐 때는 숫자를 문자열로 바꿔서 리턴
			return "" + turn;
		} else {
			return answer;
		}
		// return answer.length() == 0 ? "" + turn : answer;
	}
	
	public void start() {
		
		int turn = 1;
		int currentPlayer, nextPlayer;
		shufflePlayer();
		
		while (true) {
			currentPlayer = turn % 2;
			nextPlayer = (turn + 1) % players.length;
			
			// 이번턴의 정답
			String answerOfThisTurn = getAnswer(turn);
			
			System.out.printf("현재 %d턴입니다. (이번턴의 정답: %s)\n", turn, getAnswer(turn));
			
			System.out.printf("\"%s\"님의 차례입니다.\n", players[currentPlayer].name);
			
			// 플레이어가 내는 정답
			String playersAnswer;
			
			if(players[currentPlayer].name.equals("플레이어") ) {
				// 플레이어 차례일 때 플레이어의 입력을 기다림
				System.out.print("> ");
				playersAnswer = sc.next();
			} else {
				// 컴퓨터 차례일 때 (내가 정답을 만들어야 함 85% 확률로 정답)	
				playersAnswer = generateComputersAnswer(turn);;
				System.out.printf("> %s\n", playersAnswer); 
			}
			
			// 정답 체크한 후 승/패 반영
			if (!playersAnswer.equals(answerOfThisTurn)) {
				players[currentPlayer].lose();
				players[nextPlayer].win();
				System.out.println("==============================");
				System.out.println("현재 전적");
				players[nextPlayer].print();
				players[currentPlayer].print();
				System.out.println("==============================");
				System.out.println("게임을 다시 시작합니다!");
				turn = 1;
				shufflePlayer();
				continue;
			}
			
			++turn;
		}
		
	}

}
