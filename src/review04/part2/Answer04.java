package review04.part2;

import java.util.Random;
import java.util.Scanner;

public class Answer04 {
	public static void main(String[] args) {
		// 컴퓨터가 임의의 숫자 0~2까지 생성한 뒤
		// 0~2 사이의 숫자를 입력해서 일치하면 일치
		// 아니면 불일치
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int num = r.nextInt(3);
		System.out.println("테스트용 컴퓨터 숫자 : "+num);
		
		
		System.out.println("0~2까지 숫자 중 하나를 입력해 주세요.");
		
		int user = Integer.parseInt(in.nextLine());
		
		if(num==user) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		
		
		
		
		
	}
}
