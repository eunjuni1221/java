package doitjava.cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		// 학생 두 명 생성
		Student studentHarper = new Student("Harper", 5000);
		Student studentTrout = new Student("Trout", 10000);
		
		Bus bus100 = new Bus(100); // 노선 번호가 100번인 버스 생성
		studentHarper.takeBus(bus100); // Harper가 100번 버스를 탐
		studentHarper.showInfo(); // Harper 정보 출력
		bus100.showInfo(); // 버스 정보 출력
		
		Subway subwayBlue = new Subway("4호선"); // 노선 번호가 4호선인 지하철 생성
		studentTrout.takeSubway(subwayBlue); // Trout이 4호선을 탐
		studentTrout.showInfo(); // Trout 정보 출력
		subwayBlue.showInfo(); // 지하철 정보 출력
	}

}
