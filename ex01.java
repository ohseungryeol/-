
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 1 2 3 5 8 13 21 34 55 ...
			System.out.println(fibo(9)); //5번째 수 출력
	}
	
	static int fibo(int n) { 
		int []arr = new int [100];
		arr[0]=1;
		arr[1]=1;
		
		for (int i=2; i<n; i++) {
			arr[i] = arr[i-2]+arr[i-1]; 
		}
		
		if (n<3) {
			return 1;
		} else {
			return arr[n-1];
		}
	}

}
