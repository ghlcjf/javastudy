package ch08.classroom702;

import ch07.Car;

public class Encapsulation {
	// 정보 저장용 클래스는 필드의 외부 접근을 막고
	// 메서드를 통해서 필드에 저장된 데이터를 활용하도록 만드는 클래스 => 캡슐화
	
	private int field1;
	private String field2;
	private double field3;
	private Car field4;
	private long[] field5;
	
	
	public void a(int num) { 
		// setter method : 클래스 외부 데이터를 가져와서 클래스 내부의 필드를 채우는 기능
		this.field1 = num;
		
	}
	
	public int b() {
		// getter method : 클래스 내부의 필드에 저장된 데이터를 클래스 외부에서 활용하도록 꺼내주는 기능
		return this.field1;
	}
	
	
	// getter, setter method 이름 규칙
	// get필드이름() / set필드이름()
	
	
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public int getField1() {
		return this.field1;
	}
	
	
	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public double getField3() {
		return field3;
	}

	public void setField3(double field3) {
		this.field3 = field3;
	}

	public Car getField4() {
		return field4;
	}

	public void setField4(Car field4) {
		this.field4 = field4;
	}

	public long[] getField5() {
		return field5;
	}

	public void setField5(long[] field5) {
		this.field5 = field5;
	}

	public void setcheck(boolean check) {
		// check라는 필드가 있다고 추정해서 프로그램이 동작
	}
	public boolean getcheck() {
		return true;
	}
	
}
