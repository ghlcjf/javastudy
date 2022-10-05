package ch13;

public class Ex01_main {

	public static void main(String[] args) {
		// 과일 객체 => 과일 객체를 담는 박스 객체
		//			박스 객체는 저장한다/꺼낸다.
		
		// 과일을 담기 위한 박스를 만들어 봅시다.
		AppleBox aBox = new AppleBox(); // 박스 인스턴스 생성
		PeachBox pBox = new PeachBox();
		
		// 과일 객체를 담아봅시다.
		aBox.setApple(new Apple());
		pBox.setPeach(new Peach());
		
		// 박스에 저장된 과일 객체를 꺼내봅시다.
		Apple apple = aBox.getApple(); //과일 객체를 꺼내서 apple에 담는 과정
		Peach peach = pBox.getPeach();
		
		// 꺼내진 과일 객체가 정상적인지 체크해봅시다.
		System.out.println(apple);
		System.out.println(peach);
		
		
		
		
	}

}
