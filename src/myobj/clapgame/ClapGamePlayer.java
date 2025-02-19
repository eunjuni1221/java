package myobj.clapgame;

public class ClapGamePlayer {
	
	String name;
	int win;
	int lose;
	
	public ClapGamePlayer(String name) {
		this.name = name;
	}
	
	public void win() {
		++this.win;
	}
	
	public void lose() {
		++this.lose;
	}
	public void print() {
		System.out.printf("%s: %dW %dL\n", name, win, lose);
	}

}
