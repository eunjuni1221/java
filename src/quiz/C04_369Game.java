package quiz;

import myobj.clapgame.ClapGame;

public class C04_369Game {
	/*
	 *  컴퓨터와 번갈아가면서 진행할 수 있는 369게임을 만들어보세요
	 *  
	 *  1. 컴퓨터와 사용자의 1대1 대결로 진행된다
	 *  2. 먼저하는 사람은 랜덤으로 결정된다
	 *  3. 사용자는 3, 6, 9가 포함된 숫자에는 "짝" 또는 "ㅉ"을 입력해야한다
	 *  4. 컴퓨터는 자기 차레가 되면 85% 확률로 정답을 말하고 15% 확률로 오답을 말한다
	 *  5. 오답을 말하는 쪽이 패배하고 게임이 끝난다
	 *  
	 */
	public static void main(String[] args) {
		ClapGame game = new ClapGame();
		game.start();

	}

}
