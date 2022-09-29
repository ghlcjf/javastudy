package ch07;

import java.util.Random;
import java.util.Scanner;

public class Ex01_main {

	public static void main(String[] args) {
		// 우리가 만드는 클래스 파일 -> 설계도
		// 실제 클래스를 사용하려면 설계도를 토대로 제작 => 인스턴스 (데이터)
		
		Car myCar = new Car();
		System.out.println("자동차 색상 : "+myCar.color); // . 멤버 접근 연산자
		System.out.println("자동차 속도 : "+myCar.speed);
		myCar.forward();
		myCar.speed = 100;
		System.out.println("자동차 속도 : "+myCar.speed);
		
		//--------------------------------------------------------
		
		Car car1 = new Car(); // car1이라는 자동차
		Car car2 = new Car(); // car2이라는 자동차
		System.out.println("car1의 색상: "+car1.color);
		System.out.println("car2의 색상: "+car2.color);
		
		car1.color = "red";
		car2.color = "blue";
		
		System.out.println("car1의 색상: "+car1.color);
		System.out.println("car2의 색상: "+car2.color);
		
//		Scanner in = new Scanner(System.in);
//		Random r = new Random();
//		r.nextInt();
//		in.nextLine();
	}

}
