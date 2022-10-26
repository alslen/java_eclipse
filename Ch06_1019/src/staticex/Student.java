package staticex;

public class Student {
	
	public static int serialNum = 1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	

	public String getStudentName(){
		return studentName;
	}
	
	public void setStudentName(String name){
		studentName = name;
	}

	public static int getSerialNum() {  //인스턴스 생성 없이 바로 사용 가능
		int i = 10;
	//	studentName = "aaa";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
