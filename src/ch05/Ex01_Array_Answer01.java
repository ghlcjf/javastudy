package ch05;

public class Ex01_Array_Answer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		int[] aa = new int[] {78,85,72,95,86,90};
		int sum = 0;
		double avg = 0;
		for(int j=0;j<aa.length;j++) {
			sum+=aa[j];
			
		}
		avg=Math.round(sum/(aa.length*1.0)*100)/100.0;
		
		System.out.println("평균 : "+avg);
		
		
		
		

	}

}
