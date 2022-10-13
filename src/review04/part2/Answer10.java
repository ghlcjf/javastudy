package review04.part2;

public class Answer10 {
	public static void main(String[] args) {
		// 1단부터 10단까지 짝수단만 출력
		
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("***"+i+"단***");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
				System.out.println("");
			}
		}
	}
}
