package ch04;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// 숫자 맞추기 게임
		// 사용할 클래스 선언
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		// while문 조건, 게임 횟수, 사용자가 입력한 숫자
		boolean a = true;
		int i = 0;
		int num = 0;
		
		// 컴퓨터가 지정받을 1~100까지의 임의의 난수 설정하기
		int com = r.nextInt(100)+1;
//		System.out.println(com);
		
		
		System.out.println("숫자 맞추기 게임을 시작합니다!");
		
		while(a) {
			//유저 값 입력
			System.out.println("1부터 100까지의 숫자 중 원하는 숫자를 입력해 주세요");
			num = Integer.parseInt(in.nextLine());
			
			if(num>com) {
				System.out.println(num+"보다 작은 숫자입니다");
				i++;
			}else if(num<com) {
				System.out.println(num+"보다 큰 숫자입니다");
				i++;
			}else if(num==com) {
				System.out.println("정답입니다!!!!!");
				i++;;
				a=false;
			}
		}
		
		System.out.println(i+"번 만에 정답을 맞췄습니다~ \n 게임을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		

	}

}
