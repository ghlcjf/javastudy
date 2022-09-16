package ch04;

import java.util.Random;
import java.util.Scanner;

public class Answer27 {

	public static void main(String[] args) {
		// 가위바위보 게임
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		main:while(true) {
			
			
			System.out.println("가위바위보 게임 시작!");
			
			// 컴퓨터가 제시할 내용
			int comNum = r.nextInt(3); // 0, 1, 2
			String com = "";
			if(comNum==0) {
				com="보";
			}else if(comNum==1) {
				com="바위";
			}else if(comNum==2) {
				com="가위";
			}
			
			// 플레이어의 제시값 입력
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			System.out.println("게임을 종료하려면 "+ "종료"+"를 입력해 주세요");
			String user = in.nextLine();
			
			// 테스트
			if(!(user.equals("종료"))) {
				System.out.println("[컴퓨터] : "+com);
				System.out.println("[유저] : "+user);
			}
			// 컴퓨터와 플레이어 간 비교
			switch(user) {
			case "가위" :
				if(com.equals("가위")) {
					System.out.println("비겼습니다.");
				}else if(com.equals("바위")) {
					System.out.println("플레이어가 졌습니다..");
				}else if(com.equals("보")) {
					System.out.println("플레이어가 이겼습니다!!");
				}
				break;
			case "바위" :
				if(com.equals("가위")) {
					System.out.println("플래이어가 이겼습니다!!");
				}else if(com.equals("바위")) {
					System.out.println("비겼습니다.");
				}else if(com.equals("보")) {
					System.out.println("플레이어가 졌습니다..");
				}
				break;
			case "보" :
				if(com.equals("가위")) {
					System.out.println("플레이어가 졌습니다..");
				}else if(com.equals("바위")) {
					System.out.println("플레이어가 이겼습니다!");
				}else if(com.equals("보")) {
					System.out.println("비겼습니다.");
				}
				break;
			default :
				System.out.println("잘못 입력했습니다.");
			case "종료":
				break main;
			}
		
		}

	}

}
