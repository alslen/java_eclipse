
public class Animal {
	
	String name;
	int age;
	
	public Animal() {}
	
	public Animal(String name, int age) {
		super();  
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void move() {
		System.out.println("이동하기.");
	}

}
