package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_RspGame {
	/*
	    컴퓨터랑 진행 할 수 있는 가위바위보 게임을 만들어보세요
	    
	     1. 전적이 계속해서 기록되어야 한다
	     
	     2. 연승하는 경우 몇 연승중인지 표시된다
	     
	     3. 가위, 바위, 보 대신 종료를 입력하면 게임이 종료된다
	*/
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		Random ran = new Random();
		
		
		System.out.println("=============가위바위보 Ver.1===========");
		System.out.println("가위: 0, 바위: 1, 보: 2, 종료: 3");
		
		int winStreak = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		int scissors = 0;
		int rock = 1;
		int paper = 2;
		int quit = 3;
		
		while (true) {
			System.out.printf("안내면 진거 가위바위보! %dW %dD %dL %d연승중>> ", win, draw, lose, winStreak);
			int userChoice = sc.nextInt();
			
				if (userChoice == quit) {
					System.out.println("게임을 종료합니다");
					break;
				} else if (userChoice < 0 || userChoice > 3) {
					System.out.println("잘못된 입력 값입니다 다시 시도해주세요");
					continue;
				}
				
				if (userChoice == scissors) {
					System.out.println("당신의 선택: 가위");
				} else if (userChoice == rock) {
					System.out.println("당신의 선택: 바위");
				} else {
					System.out.println("당신의 선택: 보");
				}
				
				int comChoice = ran.nextInt(3);
				
				if (comChoice == scissors) {
					System.out.println("알파고의 선택: 가위");
				} else if (comChoice == rock) {
					System.out.println("알파고의 선택: 바위");
				} else {
					System.out.println("알파고의 선택: 보");
				}
				
				if (userChoice == comChoice) {
					System.out.println("무승부");
					++draw;
				} else if (userChoice == scissors && comChoice == rock) {
					System.out.println("LOSE ㅠ.ㅠ");
					++lose;
					winStreak = 0;
				} else if (userChoice == scissors && comChoice == paper) {
					System.out.println("WIN ^.^");
					++win; ++winStreak;
				} else if (userChoice == rock && comChoice == paper) {
					System.out.println("LOSE ㅠ.ㅠ");
					++lose;
					winStreak = 0;
				} else if (userChoice == rock && comChoice == scissors) {
					System.out.println("WIN ^.^");
					++win; ++winStreak;
				} else if (userChoice == paper && comChoice == scissors) {
					System.out.println("LOSE ㅠ.ㅠ");
					++lose;
					winStreak = 0;
				} else if (userChoice == paper && comChoice == rock) {
					System.out.println("WIN ^.^");
					++win; ++winStreak;
				}
		
		}
	
	}

}
