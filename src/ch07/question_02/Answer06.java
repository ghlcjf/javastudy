package ch07.question_02;

import java.util.Scanner;

public class Answer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Answer06();
	}

	private Scanner in;
	static Student[] students;
	Answer06() {
		in = new Scanner(System.in);
		students = new Student[5];
		init();
	}



	private void init() {
		while(true) {
			
		
			System.out.println("원하시는 메뉴를 선택해 주세요.");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 종료");
			System.out.print("선택 >> ");
			int select = Integer.parseInt(in.nextLine());
			
			switch(select) {
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



	private void rankChk() {
		// TODO Auto-generated method stub
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<i;j++) {
				if(students[i].getAvg()<students[j].getAvg()) {
					students[i].setRank(students[i].getRank()+1);
				}else {
					students[j].setRank(students[j].getRank()+1);
				}
			}
		}
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName()+"학생 "+students[i].getRank()+"등");
		}
	}



	private void gradeChk() {
		// TODO Auto-generated method stub
		System.out.println("성적 조회 메뉴입니다.\n원하시는 메뉴를 선택해 주세요");
		System.out.println("1. 개인별 성적 조회");
		System.out.println("2. 과목별 성적 조회");
		System.out.println("3. 이전 메뉴로 돌아가기");
		int select = Integer.parseInt(in.nextLine());
		
		switch(select) {
		case 1:
			namecheck();
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



	private void subject() {
		// TODO Auto-generated method stub
		System.out.println("조회할 과목을 선택해 주세요.");
		System.out.println("1. 국어");
		System.out.println("2. 영어");
		System.out.println("3. 수학");
		System.out.println("4. 이전 메뉴로 돌아가기");
		int select = Integer.parseInt(in.nextLine());
		int subsum = 0;
		double subavg = 0.0;
		
		if(select==1) {
			
			for(int i=0;i<students.length;i++) {
				subsum += students[i].getScores()[select-1];
			}
			subavg = subsum/(students.length*1.0);
			System.out.println("국어 점수 총점 : "+subsum+"점, 평균 : "+subavg+"점");
		}else if(select==2) {
			for(int i=0;i<students.length;i++) {
				subsum += students[i].getScores()[select-1];
			}
			subavg = subsum/(students.length*1.0);
			System.out.println("영어 점수 총점 : "+subsum+"점, 평균 : "+subavg+"점");
		}else if(select==3) {
			for(int i=0;i<students.length;i++) {
				subsum += students[i].getScores()[select-1];
			}
			subavg = subsum/(students.length*1.0);
			System.out.println("수학 점수 총점 : "+subsum+"점, 평균 : "+subavg+"점");
		}else if(select==4) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}else {
			selectError();
		}
		
	}



	private void namecheck() {
		// TODO Auto-generated method stub
		int studentIndex = -1;
		System.out.println("조회할 학생의 이름을 입력해 주세요.");
		String name = in.nextLine();
		for(int i=0;i<students.length;i++) {
			if(name.equals(students[i].getName())) {
				studentIndex = i;
				break;
			}
		}
		if(studentIndex==-1) {
			System.out.println("그런 학생은 없다!");
			return;
		}else {
			personal(studentIndex);
		}
		
	}



	private void personal(int studentIndex) {
		// TODO Auto-generated method stub
		students[studentIndex].info();
		
	}



	private void gradeInput() {
		// TODO Auto-generated method stub
		
		System.out.println("성적 입력 메뉴입니다.");
		for(int i=0;i<students.length;i++) {
			System.out.println((i+1)+"번째 학생 이름을 입력해 주세요.");
			String name = in.nextLine();
			System.out.println("국어 점수를 입력해 주세요.");
			int kor = Integer.parseInt(in.nextLine());
			System.out.println("영어 점수를 입력해 주세요.");
			int eng = Integer.parseInt(in.nextLine());
			System.out.println("수학 점수를 입력해 주세요.");
			int math = Integer.parseInt(in.nextLine());
			int[] score = new int[] {kor,eng,math};
			Student s = new Student(name,score);
			students[i] = s;
		}
		
	}



	private void programExit() {
		// TODO Auto-generated method stub
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		if(in.nextLine().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
	}



	private void selectError() {
		// TODO Auto-generated method stub
		System.out.println("똑바로 입력하세용");
	}
}
