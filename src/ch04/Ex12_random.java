package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex12_random {

	public static void main(String[] args) {
		// 임의의 숫자를 만드는 방법 => 로또번호 1~45 사이의 임의의 수
		// 2) Random.nextInt() 범위가 Int 자료형의 범위
		
		// 특정 범위의 숫자를 만들기 위해서 1~45
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		
				
		random.nextInt(45); // 0~44
		int lotto = random.nextInt(45)+1; // 1~45
		System.out.println("로또번호 : "+lotto);

	}

}
