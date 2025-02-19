package myobj;

import java.util.Random;

public class FishBread {
	Random ran = new Random();
	
	final public static int REDBEAN = 0; 
	final public static int CREAM = 1; 
	final public static int STRAWBERRY = 2; 
	
	final static String [] flavorNames = {"팥", "슈크림", "딸기"};
	final static int[] flavorPrices = {800, 1000, 1200};
	
	final public static int LOW_QUALITY = 0;
	final public static int MIDDLE_QUALITY = 1;
	final public static int HIGH_QUALITY = 2;
	
	final static char[] qualityNames = {'하', '중', '상'};
	final static int[] qualityPrices = {-100 , 0 , 100};
	
	public String flavorName;
	public int flavor;
	
	public char qualityName;
	public int quality;
	
	public int price;
	
	
	/**
	 *  붕어빵의 맛, 품질을 랜덤으로 결정하여 생성한다
	 */
	public FishBread() {
		flavor = ran.nextInt(flavorNames.length); // 번호값
		// flavorName = flavorNames[flavor];
		quality = ran.nextInt(qualityNames.length);
		// qualityName = qualityNames[quality];
		updatePrice();
	}
	
	/**
	 * 원하는 맛과 품질의 붕어빵을 설정하여 생성한다.
	 * 
	 * @param flavor - 맛 번호(0: 팥 1: 슈크림 2: 딸기)
	 * @param quality - 품질 번호(0: 하 1: 중 2: 상)
	 */
	public FishBread(int flavor, int quality, int price) {
		this.flavor = flavor;
		this.quality = quality;
	
	}
	public void updatePrice() {
		this.price = flavorPrices[flavor] + qualityPrices[quality];
	}
	public static int sumPrices(FishBread[] fishes) {
		int sum = 0;
		for (int i = 0; i < fishes.length; i++) {
			sum += fishes[i].price;
		}
		return sum;
	}
	
//	// 고정되는 요소들
//	public static String [] flavors = {"팥", "슈크림", "딸기"};
//	public static String [] qualitys = {"상", "중", "하"};
//	
//	// 변동이 있는 요소들
//	public String flavor;
//	public int price;
//	public String quality;
//
//	
//	public FishBread() {
//		// 맛 랜덤 돌리기
//		
//		flavor = flavors[ran.nextInt(flavors.length)];
//		
//		// 품질 랜덤 돌리기
//		quality = qualitys[ran.nextInt(qualitys.length)];
//		
//		// 가격 결정
//		if (flavor.equals("팥")) {
//			price = 800;
//		} else if (flavor.equals("슈크림")) {
//			price = 1000;
//		} else if (flavor.equals("딸기")) {
//			price = 1200;
//			
//		}
//		
//		// 품질에 따라서 가격 변동
//		if(quality.equals("상")) {
//			price += 100;
//		} else if (quality.equals("하")) {
//			price -= 100;
//		}
//		
//	}
//	public void str() {
//		System.out.printf("붕어빵 맛: %s\n품질: %s\n가격: %d\n", flavor, quality, price);
//	}
	
	

}
