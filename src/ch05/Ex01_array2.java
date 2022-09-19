package ch05;

public class Ex01_array2 {

	public static void main(String[] args) {
		// 향상된 for문 == for-each문

		String[] names = new String[] {"아자핑","라라핑","차차핑","바로핑","하츄핑"};
		
		for(int i=0;i<names.length;i++) {
			System.out.println((i+1)+"번째 티니핑 "+names[i]);
		}
		
		
		
		System.out.println("-----------------------------------------");
		
		int idx = 0;
		
		for(String name:names) {
			//names 배열에서 요소 하나씩 꺼내 name이라는 변수에 담은 뒤 처리
			System.out.println((++idx)+"번째 티니핑 "+name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
