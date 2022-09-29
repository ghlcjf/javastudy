package ch07.question;

import java.util.Scanner;

public class Answer06 {

	public static void main(String[] args) {
		new Answer06();
	}
	
	private Scanner in;
	private Student[] students;
	
	Answer06(){
		in = new Scanner(System.in);
		students = new Student[5];
		init();
	}
	
	
	
	private void init() {
		// 본격적인 기능
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("그린아카데미에 오신 것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택 >> ");
			int selMenu = Integer.parseInt(in.nextLine());
			
			
			switch(selMenu) {
			case 1: // 성적 입력
				inputData();
				break;
			case 2: // 성적 조회
				chkScore();
				break;
			case 3: // 석차 조회
				chkRank();
				break;
			case 4: // 프로그램 종료
				programExit();
				break;
			default: // 잘못 입력했을 때
				selectError();
			}

		}
		
	}

	private void chkRank() {
		// TODO Auto-generated method stub
		System.out.println("***********************************");
		System.out.println("학생 석차를 출력합니다.");
		for(Student s:students) {
			System.out.println(s.getName()+" 학생의 석차 : "+s.getRank()+"등");
		}
	}



	private void chkScore() {
		// 성적 조회
		while(true) {
			System.out.println("--------------------------------");
			System.out.println("--- 성적 조회 ---");
			System.out.println("1. 개인별 성적 조회");
			System.out.println("2. 과목별 성적 조회");
			System.out.println("3. 이전 메뉴 돌아가기");
			System.out.print("선택  >> ");
			int selNum = Integer.parseInt(in.nextLine());
			
			switch(selNum) {
			case 1: // 개인별 성적 조회
				int studentIndex = checkStudentName();
				if(studentIndex==-1) {
					System.out.println("학생 이름을 찾을 수 없음");
				}else {
					students[studentIndex].info();
				}
				break;
			case 2: // 과목별 성적 조회
				subjectNum();
				break;
			case 3: // 이전 메뉴
				System.out.println("이전 메뉴로 돌아갑니다.");
				return; // 메소드 끝내기
			default: // 잘못 입력
				System.out.println("똑바로 입력하세요.");
				selectError();
			}
		}
		
	}



	private void subjectNum() {
		// 과목별 성적 조회
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("조회하려는 과목을 선택하세요.");
			System.out.println("1. 국어");
			System.out.println("2. 영어");
			System.out.println("3. 수학");
			System.out.println("4. 이전 메뉴 돌아가기");
			
			System.out.print("선택 >> ");
			int selNum = Integer.parseInt(in.nextLine());
			// if문이 조금 더 낫다고 하긴 함
			switch(selNum) {
			case 1:
			case 2:
			case 3:
				viewsubject(selNum);
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아감");
				return;
			default:
				selectError();
			}
		}
		
	}



	private void viewsubject(int selNum) {
		// 과목 성적 조회
		String[] subjectNames = new String[] {"국어","영어","수학"};
		int total = 0;
		for(Student s:students) {
			total += s.getScores()[selNum-1];
		}
		double avg = total/(students.length*1.0);
		
		System.out.println("전체 "+subjectNames[selNum-1]+"총점"+total);
		System.out.println("전체 "+subjectNames[selNum-1]+"평균"+avg);
	}
		


	private int checkStudentName() {
		// 개인별 성적 조회 > 이름 찾기
		int result = -1;
		System.out.print("조회하고 싶은 학생 이름 : ");
		String name = in.nextLine();
		for(int i=0;i<students.length;i++) {
			if(students[i].getName().equals(name)) {
				result = i;
				break;
			}
		}
		return result;
	}



	private void inputData() {
		// 성적 입력
		System.out.println("5명의 학생 성적을 입력해 봅시다.");
		for(int i=0;i<students.length;i++) {
			System.out.print((i+1)+"번째 학생 이름 : ");
			String name = in.nextLine();
			System.out.print((i+1)+"번째 학생 국어 점수 : ");
			int kor = Integer.parseInt(in.nextLine());
			System.out.print((i+1)+"번째 학생 영어 점수 : ");
			int eng = Integer.parseInt(in.nextLine());
			System.out.print((i+1)+"번째 학생 수학 점수 : ");
			int math = Integer.parseInt(in.nextLine());
			
			students[i] = new Student(name,new int[] {kor,eng,math}) ;
		}
		ranking();
	}

	

	private void ranking() {
		
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



	private void programExit() {
		// 프로그램 종료
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		if(in.nextLine().equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료하겠습니다.");
			System.exit(0);
		}else {
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
		
	}

	private void selectError() {
		// 잘못 입력
		
		System.out.println("잘못 입력했습니다.\n확인 후 다시 입력해 주세요.");
		
	}
}
