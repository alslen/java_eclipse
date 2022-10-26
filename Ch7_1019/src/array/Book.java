package array;

public class Book {

	//인스턴스 변수, 참조형 변수
	private String bookName;
	private String author;
	
	
	// 디폴트 생성자.
	// 만약, 사용자가 정의한 다른 생성자를 만들었다면,
	// 디폴트 생성자 안 만들어준다.
	public Book(){}
	
	// 매개변수 2개인 생성자.
	// 생성자가 하는역할 해당 인스턴스 변수를 초기화.
	// 초기화 -> 처음으로 값을 할당 하는 것.
	// 생성자의 기능에서, 추가로 다른 기능을 넣을 수있다.
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	// 인스턴스 멤버 변수의 접근 지정자,
	// private : 외부에서 안보임 | 데이터 은닉
	// 해당 값에 접근하거나, 사용하기 위해서, get/set 메소드를 사용했다.
	// 이건 자주사용해서, 우클릭 -> 소스 자동생성을 많이 이용.
	// 또, 스프링에 가면, 라이브러리로 롬복으로 사용한다.
	// 해당 클래스의 인스턴스 변수에 대해서 자동으로 get/set을 만들어준다.
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author);
	}
}
