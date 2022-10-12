package review05.part2;

public class Answer01 {

	public static void main(String[] args) {
		// 숫자 7개를 저장할 수 있는 배열 만들기
		
		int[] arr = new int[7];
		
		
		// 배열에 임의의 숫자 7개를 저장하고 숫자 출력하기
		
		arr[0]=26;
		arr[1]=21;
		arr[2]=56;
		arr[3]=41;
		arr[4]=79;
		arr[5]=52;
		arr[6]=13;
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"번째 배열에 담긴 숫자 : "+arr[i]);
		}
		
		
		// 7개의 숫자 중 가장 큰 숫자 꺼내서 출력
		
		int max = 0;
		int maxIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				maxIndex=i;
			}
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최대값 인덱스 : "+maxIndex);
		
		int min=0;
		int minIndex = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) {
					min=arr[i];
					minIndex=i;
				}else {
					min=arr[j];
					minIndex=j;
				}
			}
		}
		System.out.println("최소값 : "+min);
		System.out.println("최소값 인덱스 : "+minIndex);
		
		// 7개의 숫자가 저장된 배열 안의 모든 숫자의 합
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("모든 숫자의 합: "+sum);
		
		
		// 평균
		
		double avg = Math.round(sum/(arr.length*1.0)*100.0)/100.0;
		
		System.out.println("arr 배열의 평균 : "+avg);
		
		
		
	}

}
