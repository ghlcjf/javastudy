package ch05;

import java.util.Scanner;

public class Answer13_1 {

	public static void main(String[] args) {
		// 5명의 학생 성적 관리 프로그램, 배열을 사용해서 학생 성적 관리
		// 준비
		Scanner in = new Scanner(System.in);
		
		String[] names = new String[] {"고길동","김길동","이길동","박길동","홍길동"};
		int[] rank = new int[] {1,1,1,1,1};
		String[] subject = new String[] {"국어","영어","수학"};
		int[][] scores = new int[names.length][subject.length+1]; // 총점까지 포함해서 국,영,수,총
		double[] avg = new double[names.length]; //5명 학생의 평균
		
		
		// 메뉴
		
		while(true) {
			System.out.println("******************************");
			System.out.println("그린아카데미에 오신 것을 환영합니다.");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("선택 >>");
			
			int selectNum = Integer.parseInt(in.nextLine());
			switch(selectNum) {
			case 1: // 성적 입력
				System.out.println("학생 "+names.length+"명의 성적 정보를 입력하세요");
				for(int i=0;i<names.length;i++) { //성적 입력
					System.out.println(names[i]+" 학생");
					for(int j=0;j<subject.length;j++) {
						System.out.print(subject[j]+"점수 >");
						scores[i][j] = Integer.parseInt(in.nextLine()); 
						scores[i][subject.length]+=scores[i][j];//총점
					}
					
					
					
					avg[i] = scores[i][subject.length]/(subject.length*1.0); //평균
					//성적이 다 입력된 뒤 석차 구하는 코드 작성
					for(int x=0;x<i;x++) {
						if(avg[i]>avg[x]) {
							rank[x]++;
						}else if(avg[i]<avg[x]) {
							rank[i]++;
						}
					}
				}
				break;
			case 2: // 성적 조회
				case2:while(true) {
					System.out.println("---성적 조회---");
					System.out.println("1. 개인별 성적 조회");
					System.out.println("2. 과목별 성적 조회");
					System.out.println("3. 이전 메뉴");
					System.out.print("선택 > ");
					int selectChkScore = Integer.parseInt(in.nextLine());
					
					switch(selectChkScore) {
					case 1: // 개인별 성적 조회
						System.out.println("조회하고자 하는 학생 이름을 입력하세요");
						System.out.print(" >> ");
						String name = in.nextLine();
						int studentIndex = -1; // 존재하지 않는 인덱스 지정 
						for(int i=0;i<names.length;i++) { // 반복문으로 이름 찾기
							if(names[i].equals(name)) {// 입력한 이름과 names[i] 이름과 비교
								studentIndex = i;
								break;
							}
						}
						if(studentIndex == -1) {
							System.out.println("학생 이름을 조회할 수 없습니다.");
						}else {
							System.out.println("-----------------");
							System.out.println("학생 이름 : "+names[studentIndex]);
							for(int i=0;i<subject.length;i++) {
								System.out.println(subject[i]+"점수: "+scores[studentIndex][i]);
							}
							System.out.println("총       점 : "+scores[studentIndex][subject.length]);
							System.out.println("평       균 : "+avg[studentIndex]);
							System.out.println("석       차 : "+rank[studentIndex]);
							System.out.println("-----------------");
						}
						break;
					case 2: // 과목별 성적 조회
						System.out.println("조회하려는 과목을 선택하세요");
						for(int i=0;i<subject.length;i++) {
							System.out.println((i+1)+". "+subject[i]);
						}
						System.out.print("선택 > ");
						int selectSubNum = Integer.parseInt(in.nextLine());
						
						if(0>=selectSubNum || selectSubNum>=4) {/////////////////////////////////////////////////
							System.out.println("잘못 입력했습니다.");
							break;
						}
						
						int totalsub = 0;
						double avgsub = 0.0;
						
						for(int i=0;i<scores.length;i++) {
							totalsub += scores[i][selectSubNum-1]; //선택한 번호와 인덱스 맞추기 위해 -1
						}
						avgsub = totalsub/5.0; // 학생 5명
						for(int i=0;i<subject.length;i++) {
							if(selectSubNum-1==i) {
								System.out.println("전체 "+subject[i]+" 점수 총점 : "+totalsub);
								System.out.println("전체 "+subject[i]+" 점수 평균 : "+avgsub);
							}
						}
						break;
					case 3: // 이전 메뉴
						System.out.println("이전 메뉴로 돌아갑니다.");
						break case2;
					default: // 잘못 입력
						System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
						System.out.println("---------------------------------");
					}
				}
				break;
			case 3: // 석차 조회
				System.out.println("--- 석차 출력 ---");
				for(int i=0;i<rank.length;i++) {
					System.out.println(names[i]+" 학생 석차 : "+rank[i]+"등");
				}
				
				break;
			case 4: // 종료
				System.out.println("프로그램을 종료합니다.");
				return; // 함수를 끝내는 키워드 (main이라는 함수) 
			default: // 예외 처리 -> 잘못 입력한 경우
				System.out.println("잘못 입력했습니다. \n다시 확인해 주세요.");
				System.out.println("---------------------------------");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
