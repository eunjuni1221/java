package doitjava;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print(">> ");
		String medal = sc.next();
		
		switch (medal) {
		case "Gold": 
			System.out.println("금메달입니다");
			break;
		case "Silver":
			System.out.println("은메달입니다");
			break;
		case "Bronze":
			System.out.println("동메달입니다");
			break;
		default:
			System.out.println("해당 메달은 없습니다");
			break;
		}
	}

}
