package ch14.Answer;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Answer02 {
	static TreeMap<String,String> voca = new TreeMap<>();
	static Scanner in = new Scanner(System.in);
	static boolean check = false;
	public static void main(String[] args) {
		
		
		System.out.println("영어 단어장");
		while(true) {
			
			
			System.out.println("1. 단어 등록하기| 2. 전체 조회하기 | 3. 종료");
			int num = Integer.parseInt(in.nextLine());
			
			
			switch(num) {
			case 1:
				register();
				break;
			case 2:
				if(!voca.isEmpty()) {
					whole();
				}else {
					System.out.println("등록된 단어가 없습니다.");
					System.out.println("등록 후 이용해 주세요");
				}
				break;
			case 3:
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

	private static void whole() {
		// 전체 조회
		Set<Map.Entry<String,String>> vocaSet = voca.entrySet();
		for(Map.Entry<String,String> voca:vocaSet) {
			String eng = voca.getKey();
			String kor = voca.getValue();
			System.out.println("영어 단어 : "+eng);
		}
		System.out.println("1. 검색 | 2. 수정 | 3. 삭제 | 4. 이전 메뉴 돌아가기 ");
		int selNum = Integer.parseInt(in.nextLine());
		switch(selNum) {
		case 1:
			search();
			break;
		case 2:
			modify();
			break;
		case 3:
			remove();
			break;
		case 4:
			back();
			break;
		default:
			selectError();
		}
		
	}

	private static void test() {
		// TODO Auto-generated method stub
		voca.put("apple", "0");
		voca.put("apple1", "1");
		voca.put("apple2", "2");
		voca.put("apple3", "3");
		voca.put("apple4", "4");
		voca.put("apple5", "5");
		voca.put("apple6", "6");
		voca.put("apple7", "7");
		voca.put("apple8", "8");
		voca.put("apple9", "9");
		voca.put("apple0", "0");
		voca.put("apple11", "11");
		voca.put("apple12", "12");
		voca.put("apple13", "13");
	}

	private static void remove() {
		// 삭제
		System.out.print("삭제할 영어 단어를 입력해 주세요 >> ");
		String eng = in.nextLine();
		String eng1 = voca.ceilingEntry(eng).getKey();
		if(eng.equals(eng1)) {
			voca.remove(eng1);
			System.out.println("삭제 완료되었습니다.");
		}else {
			selectError();
		}
	}

	private static void search() {
		// 검색
		System.out.print("검색할 영어 단어를 입력해 주세요 >> ");
		String eng = in.nextLine();
		String eng1 = voca.ceilingEntry(eng).getKey();
		if(eng.equals(eng1)) {
			String kor = voca.ceilingEntry(eng).getValue();
			System.out.println("영어 단어 : "+eng+"| 한글 뜻 : "+kor);
		}else {
			selectError();
		}
	}

	private static void back() {
		System.out.println("이전 메뉴로 돌아갑니다.");
		return;
		
	}

	private static void modify() {
//		Set<Map.Entry<String,String>> vocaSet = voca.entrySet();
//		for(Map.Entry<String,String> voca:vocaSet) {
//			String eng = voca.getKey();
//			String kor = voca.getValue();
//			System.out.println("영어 단어 : "+eng+"| 한글 뜻 : "+kor);
//		}
		System.out.print("수정하시겠습니까? (Y/N) >> ");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			System.out.print("수정하실 단어를 입력해 주세요. >> ");
			String eng = in.nextLine();
			String eng1 = voca.floorEntry(eng).getKey();
			if(eng.equals(eng1)) {
				System.out.print("한글 뜻을 수정해 주세요 >> ");
				String kor = in.nextLine();
				voca.put(eng1, kor);
				System.out.println("수정이 완료되었습니다.");
			}else {
				selectError();
			}
			
		}else if(ans.equalsIgnoreCase("n")) {
			System.out.println("이전 화면으로 돌아갑니다.");
			return;
		}else {
			selectError();
		}
	}

	private static void register() {
		// 단어 등록
		System.out.println("---단어 등록하기---");
		System.out.print("등록하실 단어를 영문으로 입력해 주세요 >> ");
		String eng = in.nextLine();
		System.out.print("영단어의 뜻을 한글로 입력해 주세요 >> ");
		String kor = in.nextLine();
		voca.put(eng, kor);
		check = true;
		System.out.println("등록이 완료되었습니다.");
	}

	private static void programExit() {
		// TODO Auto-generated method stub
		System.out.print("프로그램을 종료하시겠습니까? (Y/N) >> ");
		String ans = in.nextLine();
		if(ans.equalsIgnoreCase("y")) {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}else if(ans.equalsIgnoreCase("n")) {
			System.out.println("이전 화면으로 돌아갑니다.");
			return;
		}else {
			selectError();
		}
	}

	private static void selectError() {
		// TODO Auto-generated method stub
		System.out.println("잘못 입력하셨습니다");
		System.out.println("확인 후 다시 시도해주세요.");
	}
}
