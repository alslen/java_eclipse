package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
	
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		// 본인 이름으로 과목 추가해서, 출력해보기.
		
		Student studentHye = new Student(1010, "LeeHyeJin");
		studentHye.addSubject("국어", 85);
		studentHye.addSubject("영어", 50);
		studentHye.addSubject("컴퓨터", 90);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
		System.out.println("======================================");
		studentHye.showStudentInfo();
	}
}
