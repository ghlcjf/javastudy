package review04.part2;

import java.util.Random;

public class Answer02 {

	public static void main(String[] args) {
		// 컴퓨터가 임의의 숫자 0~2까지 생성하도록 만들어 보자
		
		Random r = new Random();
		
		int num = r.nextInt(3);
		
		if(num==0) {
			System.out.println("보");
		}else if(num==1) {
			System.out.println("가위");
		}else if(num==2) {
			System.out.println("바위");
		}
		
		

	}

}
