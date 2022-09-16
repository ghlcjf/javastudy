package ch03;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 가로가 3이고 세로가 6인 사각형의 넓이.
		int a = 3;
		int b = 6;
		int c = a*b;
		System.out.println("1번 답 : "+c);
		
		
		int d = (a*b)/2;
		System.out.println(d);
		double e = ((double)40+30+10)/3;
		System.out.println(e);
		double f = (100*12)*0.8;
		System.out.println(f);
		
		// 5. 286초를 분/초로 출력
		int g = 286;
		System.out.println("5번 답 : 286초는 "+g/60+"분 "+g%60+"초");

		
		
		int x = 10, y = 5;
		System.out.println((x>7)&&(y<=5));
		System.out.println((x%3==0)||(y%2!=1));
		
		
		int h = 176840;
		System.out.println(h/10000+"만 "+(h%10000)/1000+"천 "+(h%1000)/100+"백"+(h%100)+"원");
		
		
		int num = 70;
		if (num>=90) {
			System.out.println("A");
		} 
		else if (num>=80) {
			System.out.println("B");
		}
		else if (num>=70) {
			System.out.println("C");
		}
		else if (num>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		int jumsu = 68;
		char grade = (jumsu >=90)?'A':
						(jumsu>=80)?'B':
							(jumsu>=70)?'C':
								(jumsu>=60)?'D':'F';
		System.out.println("점수 : "+jumsu +"/ 등급 : "+grade);
	
		

		//9번. 화씨를 섭씨로 바꿔서 출력하는 코드
		double fah = 80.0;
		double cel = (5/9.0)*(fah-32);
		cel = Math.round(cel*1000)/1000.0;
		//26.66666... 나오는 상황. => 1000을 곱하면 26666.6666....
		// Math.round로 26667이 됨
		// 나누기 '1000.0'을하면 26.667
		
		System.out.println("화씨 : " + fah+"도");
		System.out.println("섭씨 : " + cel+"도");
		
		//------------------------------------
		
		
		
		
		int q = 53;
		int r = (q/7)+1;
		System.out.println(r);
		
		
		
		
		
		
		int j = 10;
		if (0<j) {
			System.out.println("양수");
		} else if (j<0) {
			System.out.println("음수");
		} else if (j==0) {
			System.out.println("0");
		}
		
		
		
		int l = 268;
		int m = (l/10)*10+5;
		System.out.println(m);
		
		
		int n = 24;
		int o = ((n/10)+1)*10;
		int p = o-n;
		System.out.println(p);
		
		//--------------------------------------------
		
		//--------------------------------------------
		
		char ch = 'G';
		int num_1 = (int)ch+32;
		char ch_1 = (char)num_1;
		System.out.println(ch_1);
		
		char uppC = 'D';
		char lowC = (char)(uppC+32);
		System.out.println("대문자 : "+uppC+", 소문자 : "+lowC);
		
		

	}

}
