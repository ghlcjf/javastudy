package ch13;

public class Box2<T> { // T 타입 매개변수 -> 인스턴스를 만드는 시점에 외부로부터 주입
	private T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
	
	
}
