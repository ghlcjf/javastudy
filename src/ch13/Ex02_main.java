package ch13;

public class Ex02_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 과일을 담기 위한 박스를 만들어 봅시다.
		FruitBox aBox = new FruitBox(); // 박스 인스턴스 생성
		FruitBox pBox = new FruitBox();
		
		// 과일 객체를 담아봅시다.
		aBox.setFruit(new Apple());
		pBox.setFruit(new Peach());
		
		// 박스에 저장된 과일 객체를 꺼내봅시다.
		Apple apple = (Apple)aBox.getFruit(); 
		Peach peach = (Peach)pBox.getFruit();
		
		// 꺼내진 과일 객체가 정상적인지 체크해봅시다.
		System.out.println(apple);
		System.out.println(peach);
		
		
		
	}

}
