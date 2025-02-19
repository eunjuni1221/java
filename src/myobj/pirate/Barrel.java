package myobj.pirate;

import java.util.Random;

public class Barrel {
	
	Random ran = new Random(); // 구멍의 순서를 랜덤하게 섞기위해 사용하려고 ran이라는 객체를 생성
	
	int size; // 배럴의 크기
	int numOfLaunch; // 꽝이 들어 있는 구멍 수
	char[] holes; // 배럴의 구멍을 나타내는 배열
	
	/**
	 	통이 기본크기로 생성됨 (기본 20)
	 */
	public Barrel() {
		this(20); // 이 클래스의 다른 생성자를 사용
	}
	
	// 배럴의 크기를 지정하여 생성
	public Barrel(int size) {
		this.size = size; // 배럴 크기 설정
		this.numOfLaunch = size / 5; // 꽝 구멍수는 배럴 크기의 5분의 1 즉 꽝 4개를 생성하겠다
		holes = new char[size]; // 구멍 배열 생성
		reset(); // 배럴 초기화
	}
	
	// 통을 초기 상태로 되돌리는 메서드
	public void reset() {
		for (int i = 0; i < size; ++i) {
			if (i < numOfLaunch) {
				holes[i] = 'X'; // 'X' 발사
			} else {
				holes[i] = 'O'; // 'O' 생존
			}
		}
		
		// 구멍의 순서를 랜덤하게 섞는다
		for (int i = 0; i < 100; ++i) {
			int ranIndex = ran.nextInt(size); // 랜덤 인덱스 생성
			int ranIndex2 = ran.nextInt(size);
			
			// 두 인덱스의 구멍을 교환
			char temp = holes[ranIndex2];
			holes[ranIndex2] = holes[ranIndex];
			holes[ranIndex] = temp;
		}
	}
	
	// 나중에 게임을 진행할 때 가릴건 가리면서 출력해주는 출력 모드
	public void print() {
		System.out.println("-------------------");
		for (int i = 0; i < size; ++i) {
			char h = holes[i]; // 각 구멍의 상태를 확인
			
			if (h == 'O' || h == 'X') {
				System.out.printf("%-2c", '|'); // 안전한 구멍과 꽝 구멍은 |로 표시
			} else if (h == 'S') {
				System.out.printf("%-2c", 'X'); // 찌른 구멍은 'X'로 표시
			}			
			
			if (i % 10 == 9) { // 10번째 구멍마다 줄 바꿈
				System.out.println();
			}
		}
		System.out.println("-------------------");
	}
	
	// 테스트용 출력
	public void testPrint() {
		System.out.println("-------------------");
		for (int i = 0; i < size; ++i) {
			System.out.printf("%-2c", holes[i]); // 구멍 상태를 직접 출력
			
			if (i % 10 == 9) { // i의 나머지가 9가 된다면
				System.out.println(); // 즉 10번째 구멍마다 줄 바꿈을 해주겠다
			}
		}
		System.out.println("-------------------");
	}
	
	// 통의 해당 위치를 찔렀을 때 찌르고 뭐였는지 알려주는 메서드
	// (찌른 곳은 'S' 표시하고 찔렀던 곳은 다시 찌를 수 없음)
	char stab(int index) {
		if (holes[index] == 'S') {
			return 'S'; // 이미 찔렀던 곳은 'S'로 표시
		} else {
			char value = holes[index]; // 현재 구멍의 상태 저장
			holes[index] = 'S'; // 찌른 구멍을 'S'로 표시
			return value; // 구멍 상태 반환
		}		 
	}
	
	public static void main(String[] args) {
		Barrel b = new Barrel();		
		b.testPrint(); // 배럴의 상태 출력
		
		b.stab(0); 
		b.stab(3);
		b.stab(15);
		
		b.testPrint();
	}
}





