package quiz;

import myobj.FishBread;

public class C04_FishBread {
	/*
	 *  1. myobj 패키지에 붕어빵 클래스를 만들어보세요
	 *  
	 *   - 붕어빵의 속성으로는 맛, 가격, 품질이 있다
	 *   - 맛과 품질은 인스턴스 생성시 랜덤으로 결정되어야 한다
	 *   - 가격은 맛과 품질에 따라 결정되어야 한다
	 *     팥 800원 슈크림 1000원 딸기 1200원
	 *   - 품질에 +-100원이 된다 (품질은 상 / 중 / 하 로 나뉜다)
	 *     상 + 100원 중 0원 하 -100원
	 *     
	 *  2. 설계한 클래스를 활용하여 붕어빵을 100개 생성하고
	 *     어떤 맛 붕어빵이 몇 개 생성되었는지 세어보세요
	 *     
	 *  3. 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는 메서드를 만들고 테스트해보세요
	 */
	public static void main (String [] args) {
		// FishBread.flavorNames = new String[] {"김치", "단무지", "양파"};
		// 를 방지하기 위해 final을 붙여두어야 한다
		
		// FishBread f = new FishBread(FishBread.REDBEAN, FishBread.HIGH_QUALITY);
		
		// 붕어빵을 담을 붕어빵 배열 만들기
		FishBread[] fishes = new FishBread[100];
		
		// 붕어빵 배열에 내용 채우기
		for (int i = 0; i < fishes.length; i++) {
			fishes[i] = new FishBread();
		}
		
		// 붕어빵 맛 개수 세기
		int redbeanCount = 0;
		int creamCount = 0;
		int strawCount = 0;
		
		for (int i = 0; i < fishes.length; i++) {
			
			if (fishes[i].flavor == FishBread.REDBEAN) {
				redbeanCount++;
			} else if (fishes[i].flavor == FishBread.CREAM) {
				creamCount++;
			} else if (fishes[i].flavor == FishBread.STRAWBERRY) {
				strawCount++;
			}
		}
		System.out.printf("팥: %d 슈크림: %d 딸기: %d\n", redbeanCount, creamCount, strawCount);
		
		System.out.println("배열에 있는 모든 붕어빵의 가격 " + "￦" +FishBread.sumPrices(fishes));
		
	}

}
