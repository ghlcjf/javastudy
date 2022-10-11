package review01;

public class Answer06 {

	public static void main(String[] args) {
		// 1부터 100까지 출력하세요
		// 1부터 10까지 가로,11부터 다음 라인으로 10행 10열로 출력
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
			if(i%10==0) {
				System.out.println(" ");
			}
		}
	}

}
