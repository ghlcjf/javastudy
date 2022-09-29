package ch07.question;

import java.util.Scanner;

public class Answer06_main {
	static Scanner in = new Scanner(System.in);
	static Student[] students = new Student[5];  
	public static void main(String[] args) {
		
		System.out.println("그린 아카데미에 오신 것을 환영합니다.");
		System.out.println("성적 관리 프로그램을 실행합니다.");
		
	
		
		
		while(true) {
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 종료");
			System.out.println("원하시는 메뉴의 번호를 입력해 주세요.");
			
			int selNum = Integer.parseInt(in.nextLine());
			
			
			switch(selNum) {
			case 1:
				gradeInput();
				break;
			case 2:
				gradeChk();
				break;
			case 3:
				rankChk();
				break;
			case 4:
				programExit();
				break;
			default:
				selectError();
			}
			
			
		}

	}
	
	

	private static void rankChk() {
//		for(int i=0;i<students.length;i++) {
//			int rank = 1;
//			for(int j=0;j<i;j++) {
//				if(students[i].getAvg()<students[j].getAvg()) {
//					students[i].setRank(rank);
//				}else if(students[i].getAvg()>students[j].getAvg()) {
//					students[j].setRank(rank);
//				}
//				rank++;
//			}
//		}
		
		
		
		System.out.println("***********************************");
		System.out.println("학생 석차를 출력합니다.");
		for(Student s:students) {
			System.out.println(s.getName()+" 학생의 석차 : "+s.getRank()+"등");
		}
		
	}

	private static void gradeChk() {
		boolean run = true;
		while(run) {
			System.out.println("성적을 조회합니다.");
			System.out.println("1. 개인별 성적 조회");
			System.out.println("2. 과목별 성적 조회");
			System.out.println("3. 이전 메뉴");
			System.out.print("원하시는 메뉴를 선택해 주세요 >> ");
			int menuNum = Integer.parseInt(in.nextLine());
			
			switch(menuNum) {
			case 1:
				personal();
				break;
			case 2:
				subject();
				break;
			case 3:
				System.out.println("이전 메뉴로 돌아갑니다");
				run = false;
				break;
			default:
				selectError();
			}
			
		}
	}

	private static void subject() {
		System.out.println("과목을 입력해 주세요");
		int subNum = -1;
		String sub = in.nextLine();
		if(sub.equals("국어")) {
			subNum = 0;
		}else if(sub.equals("영어")) {
			subNum = 1;
		}else if(sub.equals("수학")) {
			subNum = 2;
		}else {
			System.out.println("일치하는 과목이 없습니다.");
		}
		
		int subSum = 0;
		double subAvg = 0.0;
		
		for(int i = 0;i<students.length;i++) {
			subSum += students[i].getScores()[subNum];
		}
		subAvg = Math.round(subSum/5.0*100)/100.0;
		
		System.out.println(sub+"과목 총점은 "+subSum+"점입니다.");
		System.out.println(sub+"과목 평균은 "+subAvg+"점입니다.");
	}



	private static void personal() {
		int studentIndex=-1;
		System.out.println("이름을 입력해 주세용");
		String name = in.nextLine();
		for(int i=0;i<students.length;i++) {
			if(name.equals(students[i].getName())){
				studentIndex = i;
			}
		}
		if(studentIndex==-1) {
			System.out.println("일치하는 이름이 없습니다.");
		}else {
			System.out.println(students[studentIndex].getName()+"의 성적을 조회합니다.");
			students[studentIndex].info();
		}
	}



	private static void gradeInput() {
		for(int i=0;i<students.length;i++) {
			String name;
			int[] score = new int[3]; 
			System.out.println((i+1)+"번째 학생의 이름을 입력해 주세요");
			name = in.nextLine();
			System.out.print("국어 점수를 입력해 주세요 >> ");
			score[0] = Integer.parseInt(in.nextLine());
			System.out.print("영어 점수를 입력해 주세요 >> ");
			score[1] = Integer.parseInt(in.nextLine());
			System.out.print("수학 점수를 입력해 주세요 >> ");
			score[2] = Integer.parseInt(in.nextLine());
			Student s = new Student(name,score);
			students[i] = s;
		}
		
		ranking();
		
	}
	private static void ranking() {
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<i;j++) {
			if(students[i].getAvg() > students[j].getAvg()) {
				students[j].setRank(students[j].getRank()+1);
			}else {
				students[i].setRank(students[i].getRank()+1);
			}
			}
		}
		
	}



	private static void programExit() {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.print("Y/N >>");
		String ans = in.nextLine();
		
		if(ans.equalsIgnoreCase("Y")){
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equals("n")||ans.equals("N")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.\n이전 메뉴로 돌아갑니다.");
		}
		
	}
	private static void selectError() {
		System.out.println("잘못 입력했다\n다시 입력해라");
		
	}
	

}
