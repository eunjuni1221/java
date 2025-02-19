package givejhyquiz;

public class Account {
	private String name;
	private int balance;
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
		System.out.println("새로운 계좌가 만들어 졌습니다 예금주: " + name + " 잔고: " + balance );
		
	}
	public void deposit(int amount) {
		if (amount > 0) {
			
			balance += amount;
		} else {
			System.out.println("입금 금액이 0원 이상이어야 합니다");
		}
		
	}
	public void withdraw(int amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else if (amount > balance) {
			System.out.println("잔고 부족 출금할 수 없습니다");
		} else {
			System.out.println("출금 금액은 0원 이상이어야 합니다");
		}
	}
	public void print() {
		System.out.println(name + " 님의 현재 잔고는 " + balance + "원 입니다.");
	}

}
