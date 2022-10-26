package generics;

public class Point<T, V> {  //Integer T, Double V
	
	T x;
	V y;
	
	Point(T x, V y){
		this.x = x;
		this.y = y;
	}
	
	public  T getX() {  // 리턴의 타입 : Integer 반환.
			return x;
	}

	public V getY() {
		return y;
    }
}
