package myobj;

public class Sheep {
	// 모든 양에게 동일하게 적용되어야 하는 것 (static)
	static long productCreationTime = 60 * 60 * 8; // 8시간
	static long eggCreationTime = 60 * 60 * 24; // 24시간
	
	//  각 양이 가지고 있어야 하는 것 (instance)
	String name = "흰색 양";
	String color = "흰색";
	long lastHarvestTime; // 가장 최근에 양털을 수집한 시간
	long bornTime; // 태어난 시간 (획득 시간)
	Sheep mom, dad;
	
	// 이름 수정하기
	public void setName(String newname) {
		name = newname;
	}
	
	// 털색 수정하기 (음식을 먹으면 해당 음식의 색으로 털 색이 변한다)
	public void setColor(Apple food) {
		this.color = food.color;
	}
	
	// 양털 수확하기
	public void harvest() {
		// System.currentTimeMillis() : 현재 시간을 반환하는 함수
		lastHarvestTime = System.currentTimeMillis();
		System.out.println("수확시간: " + lastHarvestTime + "ms");
	}
	
	// 남은 시간 알아내기
	public long getRemainHarvestTime() {
		// 최근수확시간 + 8시간(ms) - 현재시간
		return lastHarvestTime + productCreationTime * 1000 - System.currentTimeMillis();
	}

}
