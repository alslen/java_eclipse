package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  
		  // 디버깅 한번 수행하고
		  //본인 이름으로 생성하기.
		  // 버스, 지하철 타보기.
		  // 택시 만들어서 타보기.
		  Student lsy = new Student("이상용", 20000);
		  
		  Bus bus103 = new Bus(103);
		  lsy.takeBus(bus103);     // james가 100번 버스를 탐
		  lsy.showInfo();           // james 정보 출력
		  bus103.showInfo();                // 버스 정보 출력
		  
		  Subway subwayOrange = new Subway("1호선");  
		  lsy.takeSubway(subwayOrange);  // Tomas가 2호선을 탐
		  lsy.showInfo();                 // Tomas 정보 출력
		  subwayOrange.showInfo();   
		  
		  /*Student studentHyeJin = new Student("HyeJin", 3000);
		  Bus bus20 = new Bus(20);
		  studentHyeJin.takeBus(bus20);
		  studentHyeJin.showInfo();
		  bus20.showInfo();
		  
		  Subway subwayBlue = new Subway("3호선");
		  studentHyeJin.takeSubway(subwayBlue);
		  studentHyeJin.showInfo();
		  subwayBlue.showInfo(); */
		  
		  
		   
		  /*
		  Bus bus100 = new Bus(100);
		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
		  studentJames.showInfo();           // james 정보 출력
		  bus100.showInfo();                // 버스 정보 출력
		  
		  Subway subwayGreen = new Subway("2호선");  
		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
		  studentTomas.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();   */
	}
}
