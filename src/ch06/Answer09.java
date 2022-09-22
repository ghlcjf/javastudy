package ch06;

import java.util.Scanner;

public class Answer09 {
	static Scanner in = new Scanner(System.in);
	static String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
	static int[][] scores = new int[5][4]; //[5]학생수[4]과목3개+총점까지
	static String[] sub = new String[] {"국어","영어","수학"};
	static int[] rank = new int[] {1,1,1,1,1};
	static double[] avg = new double[5];
	
	public static void main(String[] args) {
		// 배열을 사용해서 학생 성적을 관리
		
		boolean run = true;
		while(run) {
			System.out.println("그린 아카데미에 오신 것을 환영합니다.");
			System.out.println("1.성적 입력");
			System.out.println("2.개인별 성적 조회");
			System.out.println("3.과목별 성적 조회");
			System.out.println("4.석차 조회");
			System.out.println("5.종료");
			System.out.print("원하시는 메뉴의 번호를 입력해 주세요 >");
			int selectNum = Integer.parseInt(in.nextLine());
			
			switch(selectNum) {
			case 1:
				input();
				break;
			case 2:
				personal();
				break;
			case 3:
				subject();
				break;
			case 4:
				rank();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			default:
				System.out.println("번호 좀 확인하고 다시 눌러라");
			}
			
			
		}
	}

	private static void rank() {
		for(int i=0;i<rank.length;i++) {
			System.out.println(names[i]+" 학생은 "+rank[i]+"등입니다.");
		}
		
	}

	private static void subject() {
		System.out.println("조회하실 과목을 입력해 주세요.");
		String subject = in.nextLine();
		int subNum = -1;
		if(subject.equals("국어")) {
			subNum=0;
		}else if(subject.equals("영어")) {
			subNum=1;
		}else if(subject.equals("수학")) {
			subNum=2;
		}
		
		int totalSum = 0;
		double totalAvg = 0.0;
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" 학생의 "+sub[subNum]+" 점수는 "+scores[i][subNum]+"점입니다.");
			totalSum+=scores[i][subNum];
		}
		totalAvg = totalSum/5.0;
		System.out.println(sub[subNum]+" 과목의 총점은 "+totalSum+"점입니다.");
		System.out.println(sub[subNum]+" 과목의 평균은 "+totalAvg+"점입니다.");
		
		
		
	}

	private static void personal() {
		System.out.print("조회하실 학생 이름을 입력해 주세요 >");
		String name = in.nextLine();
		int studentNum = -1;
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(name)) {
				studentNum=i;
			}
		}
		
		
		for(int i=0;i<sub.length;i++) {
			System.out.println(name+" 학생의 "+ sub[i]+" 점수는 "+scores[studentNum][i]+"점입니다.");
		}
		System.out.println(name+" 학생의  총점은 "+scores[studentNum][3]+"점입니다.");
		System.out.println(name+" 학생의  평균은 "+avg[studentNum]+"점입니다.");
	}

	private static void input() {
		int sum = 0;
		for(int i=0;i<names.length;i++) {
			
			System.out.println(names[i]+" 학생의 점수를 입력합니다.");
			for(int j=0;j<sub.length;j++) {
				System.out.print(sub[j]+" 과목 점수를 입력해 주세요 >");
				scores[i][j] = Integer.parseInt(in.nextLine());
				sum += scores[i][j];
			}
			scores[i][3] = sum;
			avg[i]=scores[i][3]/3.0;
			sum=0;
			for(int j=0;j<i;j++) {
				if(avg[i]>avg[j]) {
					rank[j]++;
				}else if(avg[i]<avg[j]) {
					rank[i]++;
				}
			}
		}
		
	}

}
