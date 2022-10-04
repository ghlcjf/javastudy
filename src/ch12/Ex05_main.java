package ch12;

public class Ex05_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value01 v1 = new Value01(10);
		Value01 v2 = new Value01(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		// 숫자 10은 같지만 서로 다른 인스턴스 주소값을 가지고 있기 때문에 다르다고 나옴
		
		v2=v1;
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		// v2에 v1을 저장하면 같은 인스턴스 => 같다고 나옴
		
		
		
	}

}
