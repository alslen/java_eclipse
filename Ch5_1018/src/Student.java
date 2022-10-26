
public class Student {

	int stuNo;  //1번
	String stuName;  // 이상용.
	String stuClass; // 402호
	String stuHome;  // 부산 강서구.
	
	public Student() {}
	public Student(int stuNo) {}
	public Student(int stuNo, String stuName) {}
	public Student(int stuNo, String stuName, String stuClass) {}
	
	
	
	public Student(int stuNo, String stuName, String stuClass, String stuHome) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuClass = stuClass;
		this.stuHome = stuHome;
	}
	
	public void setStuNo(int stuNo, String stuName) {  //학생증 번호, 
		this.stuNo = stuNo;  //this : 자기자신
		this.stuName = stuName;
	}

	public int getStuNo() {
		return stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	
	
	public void studySub(String stuName) {
		System.out.println(stuName + "이 자바 공부 중.");
	}
	

	public String getStuClass() {
		return stuClass;
	}

	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}

	public String getStuHome() {
		return stuHome;
	}

	public void setStuHome(String stuHome) {
		this.stuHome = stuHome;
	}

	public static void main(String[] args) {
		// 여러분은 직접 본인의 아이디의 이니셜로 해당 참조형 변수 (인스턴스) 만들기.
		// 해당 값을 설정은 번호, 이름 직접 설정하고, 클래스랑, 집은 set함수를 통해서 만들기.
		// 해당 값을 출력할 때, 번호, 이름 직접 출력하고, 클래스랑, 집은 get함수를 통해서 출력 해보기.

		Student lsy4 = new Student(4, "이상용4", "402호", "부산 강서구");
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lsy4.stuNo);
		System.out.println("해당 학생증 이름을 직접 접근해서 출력");
		System.out.println(lsy4.stuName);
		System.out.println("해당 학생증 클래스를 get메서드 접근해서 출력");
		System.out.println(lsy4.stuClass);
		System.out.println("해당 학생증 주소를 get메서드 접근해서 출력");
		System.out.println(lsy4.stuHome); 
		
		Student lhj10 = new Student();
		lhj10.stuNo = 10;
		lhj10.stuName = "이혜진";
		lhj10.setStuClass("402호");
		lhj10.setStuHome("김해시");
		
		System.out.println("학생증 번호 : " + lhj10.stuNo);
		System.out.println("이름 : " + lhj10.stuName);
		System.out.println("반 : " + lhj10.getStuClass());
		System.out.println("사는 곳 : " + lhj10.getStuHome());
		lhj10.studySub("이혜진");
		
		System.out.println();
		Student lsy3 = new Student();
		lsy3.stuNo=3;
		lsy3.stuName="이상용3";
		lsy3.setStuClass("402 강의장");
		lsy3.setStuHome("부산시 강서구");
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lsy3.stuNo);
		System.out.println("해당 학생증 이름을 직접 접근해서 출력");
		System.out.println(lsy3.stuName);
		System.out.println("해당 학생증 클래스를 get메서드 접근해서 출력");
		System.out.println(lsy3.getStuClass());
		System.out.println("해당 학생증 주소를 get메서드 접근해서 출력");
		System.out.println(lsy3.getStuHome()); 
		lsy3.studySub("이상용3");
		
		System.out.println("==해당 인스턴스(참조형 변수)를 확인 해보자. 안에 뭐가 들어 있는지.?===============");
		System.out.println("lhj10 : " + lhj10);
		System.out.println("lsy3 : " +lsy3);
		
		

		/*Student lhj = new Student();  // 생성자는 객체를 초기화
		lhj.stuNo = 1;
		lhj.stuName = "이혜진";
		System.out.println("해당 학생증 번호를 get 메서드를 접근해서 출력");
		System.out.println(lhj.getStuNo());
		System.out.println("해당 학생증 번호를 직접 접근해서 출력");
		System.out.println(lhj.stuNo);
		
		Student lhj2 = new Student(); // 이상용2번 학생의 학생 번호를 2번으로 set메서드를 통해서 지정.
		lhj2.setStuNo(2);
		System.out.println("해당 학생증 번호를 get메서드 접근해서 출력");
		System.out.println(lhj2.getStuNo()); */
	}

}
