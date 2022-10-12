package review03.part3;

public class Answer01 {
	public static void main(String[] args) {
		// 사과를 담는 데 필요한 바구니의 수를 구하는 프로그램
		// ex. 사과 123개/바구니에 10개씩 담긴다면 바구니는 13개가 필요할 것이다.
		
		int apple = 101;
		int bucketSize = 3;
		
		int bucket = apple/bucketSize+(apple%bucketSize>0?1:0);
		
		System.out.println("바구니의 수 : "+bucket);
	}
}
