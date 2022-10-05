package ch14.Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer06 {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Student> sList = new ArrayList<>();
	static boolean run = false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("블루 아카데미에 오신 것을 환영합니다.");
		
		while(true) {
			System.out.println("원하시는 메뉴를 선택해 주세요");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1:
				input();
				break;
			case 2:
				if(run) {
					checkGrade();
				}else {
					System.out.println("성적 입력 전입니다.");
					System.out.println("성적 입력 후 진행해 주세요");
				}
				
				break;
			case 3:
				if(run) {
					checkRank();
				}else {
					System.out.println("성적 입력 전입니다.");
					System.out.println("성적 입력 후 진행해 주세요");
				}
				break;
			case 4:
				programExit();
				break;
			case 5:
				test();
				break;
			default:
				selectError();
			}
			
			
			
		}

	}
	private static void checkRank() {
		// 석차 조회
		
		for(int i=0;i<sList.size();i++) {
			for(int j=0;j<i;j++) {
				if(sList.get(i).getAvg()<sList.get(j).getAvg()) {
					sList.get(i).setRank(sList.get(i).getRank()+1);
				}else if(sList.get(i).getAvg()>sList.get(j).getAvg()) {
					sList.get(j).setRank(sList.get(j).getRank()+1);
				}
			}
		}
		
		for(int i=0;i<sList.size();i++) {
			System.out.println(sList.get(i).getName()+"님 "+sList.get(i).getRank()+"등");
		}
		
	}
	private static void checkGrade() {
		
		System.out.println("성적 조회 메뉴입니다");
		System.out.println("1. 학생별 성적 조회");
		System.out.println("2. 과목별 성적 조회");
		System.out.println("3. 이전 메뉴로 돌아가기");
		System.out.print("선택 >> ");
		
		int selNum = Integer.parseInt(in.nextLine());
		
		switch(selNum) {
		case 1:
			personal();
			break;
		case 2:
			subject();
			break;
		case 3:
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		default:
			selectError();
		}
		
	}
	
	
	private static void subject() {
		// 과목별 성적 조회
		int sum = 0;
		double avg = 0.0;
		System.out.println("조회하실 과목을 입력해 주세요");
		String subject = in.nextLine();
		
		switch(subject) {
		case "국어":
			for(int i=0;i<sList.size();i++) {
				sum+=sList.get(i).getScores()[0];
			}
			avg = sum/(sList.size()*1.0);
			System.out.println("국어 점수의 총점은 "+sum+"점입니다.");
			System.out.println("국어 점수의 평균은 "+avg+"점입니다.");
			break;
		case "영어":
			for(int i=0;i<sList.size();i++) {
				sum+=sList.get(i).getScores()[1];
			}
			avg = sum/(sList.size());
			System.out.println("영어 점수의 총점은 "+sum+"점입니다.");
			System.out.println("영어 점수의 평균은 "+avg+"점입니다.");
			break;
		case "수학":
			for(int i=0;i<sList.size();i++) {
				sum+=sList.get(i).getScores()[2];
			}
			avg = sum/(sList.size());
			System.out.println("수학 점수의 총점은 "+sum+"점입니다.");
			System.out.println("수학 점수의 평균은 "+avg+"점입니다.");
			break;
		default:
			selectError();
		}
		
	}
	private static void personal() {
		// 학생별 성적 조회
		System.out.print("조회하실 학생의 이름을 입력해 주세요. >> ");
		String name = in.nextLine();
		boolean check = false;
		for(int i=0;i<sList.size();i++) {
			if(sList.get(i).getName().equals(name)) {
				sList.get(i).info();
				check = true;
				break;
			}
		}
		if(check==false) {
			selectError();
		}
		
	}
	private static void test() {
		sList.add(new Student("고길동",new int[] {78,64,82}));
		sList.add(new Student("김길동",new int[] {85,71,64}));
		sList.add(new Student("이길동",new int[] {74,69,57}));
		sList.add(new Student("박길동",new int[] {74,77,95}));
		sList.add(new Student("홍길동",new int[] {68,95,84}));
		run = true;
		
	}
	
	
	private static void input() {
		// 성적 입력
		
		System.out.println("점수 정보를 입력하실 인원 수를 입력해 주세요.");
		int people = Integer.parseInt(in.nextLine());
		
		for(int i=0;i<people;i++) {
			System.out.println("이름을 입력해 주세요.");
			String name = in.nextLine();
			System.out.println("국어 점수를 입력해 주세요.");
			int kor = Integer.parseInt(in.nextLine());
			System.out.println("영어 점수를 입력해 주세요.");
			int eng = Integer.parseInt(in.nextLine());
			System.out.println("수학 점수를 입력해 주세요.");
			int math = Integer.parseInt(in.nextLine());
			
			sList.add(new Student(name,new int[] {kor,eng,math}));
		}
		run=true;
		System.out.println(sList.size());
		
	}
	
	
	private static void programExit() {
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		String answer = in.nextLine();
		
		if(answer.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료하겠습니다.");
			System.exit(0);
		}else if(answer.equalsIgnoreCase("n")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}else {
			selectError();
		}
		
	}
	
	
	private static void selectError() {

		System.out.println("잘못 입력하셨습니다");
		System.out.println("확인 후 다시 입력해 주세요.");
		
		
	}

}
