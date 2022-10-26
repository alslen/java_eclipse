package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println("myCompany1의 참조값 주소 : "+myCompany1);
		System.out.println("myCompany2의 참조값 주소 : "+myCompany2);
		
		System.out.println( myCompany1 == myCompany2 );
		
		myCompany1.address = "부산";
		myCompany1.name = "이상용";
		myCompany1.age = 39;
		System.out.println("address : "+myCompany1.address);
		System.out.println("name : "+myCompany1.name);
		System.out.println("age : "+myCompany1.age);
		System.out.println("address : "+myCompany2.address);
		System.out.println("name : "+myCompany2.name);
		System.out.println("age : "+myCompany2.age);
	}
}
