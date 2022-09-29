package ch06;

public class que07 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {6,5,4,3,2,1};
		//int[] sum = sumArray(a,b);
		
		int[] comArr = compareArray(a,b);
		
		
		for(int i=0;i<comArr.length;i++) {
			System.out.print(comArr[i]+" ");
		}
	
	
	}
	
	
	private static int[] compareArray(int[] a,int[] b) {
		if(a.length>b.length) {
			return sumArray(a,b);
		}else {
			return sumArray(b,a);
		}
		
	}
	
	
	private static int[] sumArray(int[] a,int[] b) {
		// 배열a와 배열b를 입력(전달)받아서 두 배열을 합친 하나의 배열을 반환.
		
		
		int[] sum = null;
		//a,b 누가 더 긴가.
		
		sum = new int[a.length];
		for(int i=0;i<sum.length;i++) {
			if(i<b.length) {
				sum[i]=a[i]+b[i];
			}else {
				sum[i] = a[i];
			}
		}
		
		return sum;
		
	}
	private static int[] sumArray2(int[] a,int[] b) {
		// 배열a와 배열b를 입력(전달)받아서 두 배열을 합친 하나의 배열을 반환.
		
		
		int[] sum = null;
		//a,b 누가 더 긴가.
		if(a.length>b.length) {
			sum = new int[a.length];
		}else {
			sum = new int[b.length];
		}
		
		sum = new int[a.length];
		for(int i=0;i<sum.length;i++) {
			if(i<b.length) {
				sum[i] += b[i];
			}else if(i<a.length) {
				sum[i] += a[i];
			}
		}
		
		return sum;
		
	}

}
