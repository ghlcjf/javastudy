package review04.part2;

public class Answer11 {
	public static void main(String[] args) {
		//1단부터 10단까지 홀수단만 출력
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				System.out.println("***"+i+"단***");
				for(int j=1;j<=9;j++) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
				System.out.println("");
			}
		}
	}
}
