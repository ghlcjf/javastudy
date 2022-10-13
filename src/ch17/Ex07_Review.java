package ch17;

import java.util.ArrayList;
import java.util.List;

public class Ex07_Review {

	public static void main(String[] args) {
		// 상품 등록 페이지 
		// 상품 객체는 이름, 갯수, 원가, 정가를 저장할 수 있고
		
		// 임의의 상품 5개를 저장한 후
		//노트 	5	250		1000
		//연필	7	120		200
		//지우개	2	150		350
		//필통	1	1750	4500	
		//공책	4	750		1350
		
		
		// 각 상품의 원가와 정가를 출력하는 프로그램을 만들어 봅시다
		// 노트의 원가는 ---원이고 총 판매 대금은 ---원입니다.
		// 총 수익은 ---원입니다.
		List<Product> lists = new ArrayList<>();
		
		lists.add(new Product("노트",5,250,1000));
		lists.add(new Product("연필",7,120,200));
		lists.add(new Product("지우개",2,150,350));
		lists.add(new Product("필통",1,1750,4500));
		lists.add(new Product("공책",4,750,1350));
		
		
		for(Product p:lists) {
			System.out.println(p.toString());
		}
		
		System.out.println("--------------------------------");
		
		lists.stream().forEach(p->System.out.println(p.toString()));
		
		
		
		
		
		
		
	}

}
