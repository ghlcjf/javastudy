package ch04;

import java.util.Random;
import java.util.Scanner;

public class Game02 {

	public static void main(String[] args) {
		// 컴퓨터가 내 숫자를 맞추는 게임
		// 클래스 선언
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		// 사용할 변수 선언
		int num = 0; // 유저의 값
		int com = 0; // 컴퓨터의 값
		int i = 0;
		boolean a = true;
		int min = 1;
		int max = 100;
		// 사용자가 값을 입력
		System.out.println("숫자 맞추기 게임을 시작합니다~!");
		System.out.println("1부터 100까지의 숫자 중 임의의 값을 입력해 주세요.");
		num = Integer.parseInt(in.nextLine());
		
		while(a) {
			com = r.nextInt(max-min+1)+min;
			System.out.println(com);
			if(num>com) {
				System.out.println(com+"보다 큰 숫자입니다~");
				i++;
				min=com+1;
			}else if(num<com) {
				System.out.println(com+"보다 작은 숫자입니다~");
				i++;
				max=com-1;
			}else if(num==com) {
				System.out.println("정답입니다~!");
				i++;
				a=false;
			}
			
			
		}
		
		System.out.println(i+"번 만에 정답을 맞췄습니다~ \n 게임을 종료합니다.");
		


	}

}
