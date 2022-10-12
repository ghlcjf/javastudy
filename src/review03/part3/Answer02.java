package review03.part3;

public class Answer02 {

	public static void main(String[] args) {
		// 임의의 정수 a에서 일의 자리 숫자를 5로 바꾸는 코드를 작성하세요
		
		int a = 5043;
		
		int x = a-a%10+5;
		System.out.println(x);

	}

}
