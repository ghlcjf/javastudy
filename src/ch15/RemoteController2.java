package ch15;

@FunctionalInterface // 이거는 무조건 함수적 인터페이스로 만들어야 한다는 표시, 강제하기 위한 어노테이션
public interface RemoteController2 { 
	// 메서드를 하나만 구현하도록 만드는 인터페이스 => 함수적 인터페이스
	// => 메서드는 하나만 있어야 함
	void muted();
//	void a(); 바로 에러가 남
}
// 궁극적인 목적은 메서드를 데이터처럼 취급하기 위함