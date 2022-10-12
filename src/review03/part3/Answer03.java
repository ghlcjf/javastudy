package review03.part3;

public class Answer03 {
	public static void main(String[] args) {
		// 어떤 정수보다 값이 크면서도 가장 가까운 10의 배수에서 변수 값을 뺀 나머지를 구하는 프로그램
		// ex) a=24, 가장 가까운 10의 배수 30, 30-24=6, x=6
		
		
		int a = 53;
		int b = ((a/10)+1)*10;
		int x = b-a;
		System.out.println("x : "+x);
	}
}
