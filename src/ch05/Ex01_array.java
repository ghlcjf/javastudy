package ch05;

import java.util.Random;

public class Ex01_array {

	public static void main(String[] args) {
		// 배열
		
		int jumsu = 100;
		int[] jumsus1 = new int[10]; //int형 데이터를 저장하는 배열 => 크기가 고정
		int[] jumsus2 = new int[] {20,25,45,30,15};
								//	0 1 2 3 4 => 인덱스라 부름
		
		
		jumsus1[0] = 50;
		jumsus1[1] = 60;
		jumsus1[2] = 70;
		jumsus1[3] = 80;
		jumsus1[3] = 90;
		
		System.out.println("3층 데이터 : "+jumsus1[3]); //90
		//--------------------------------------------------------------
		// 배열의 특징
		// 1) 배열의 각 층에는 같은 데이터 타입만 들어올 수 있다.
		//    double[], byte[], String[], Random[]
		
		Random r =new Random();
		Random[] rand = new Random[3];
		
		rand[0] = new Random();
		rand[1] = new Random();
		rand[2] = new Random();
		
		r.nextInt();
		rand[0].nextInt();
		
		
		// 2) 크기 고정 => 크기를 마음대로 변경할 수 없다.
		
		//--------------------------------------------------------------
		// 배열을 사용함에 있어서 매우 중요한 특징 => 인덱스 : 숫자형 데이터
		int i = 2;
		jumsus1[2] = 50;
		jumsus1[i] = 50;
		
		
		// => 배열과 반복문의 결합
		for (int j=0;j<5;j++) {
			System.out.println((j+1)+"번째 학생 점수 : "+jumsus2[j]);
		}
		
		
		int[] scores = new int[] {81,75,74,95,62,87,94,68,76};
		
		System.out.println("scores 배열의 길이 : "+scores.length);
		
		for(int j=0;j<scores.length;j++) {
			System.out.println((j+1)+"번째 학생 점수 : "+scores[j]);
		}
		// 배열에서 가장 많이 볼 수 있는 에러 index out of bounds ~~~
		
		
		
		
	}

}
