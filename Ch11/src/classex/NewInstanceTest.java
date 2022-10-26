package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person();
		System.out.println(person1);
		
		
		// 나중에, 다른 디비 드라이버를 이런 방식으로 로드(메모리 상에 로드)
		// 그래서, 자바로 DB 연동하면, DB 작업을 할 수 있다.
		// 해당 디비를 연결, SQL, 등 기능을 구현한 외부 라이브러리(클래스)를 로드한다.
		Class pClass = Class.forName("classex.Person");
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
	}
}
