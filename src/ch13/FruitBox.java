package ch13;

public class FruitBox { // 과일 객체를 저장할 박스가 만들어졌다(= 범용성 증가)
	
	private Fruit fruit;

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	
	
}
