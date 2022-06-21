import java.util.Scanner;

public class code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();//8
		int[] arr = new int[n]; 
		System.out.print("배열 입력하세요:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt(); // 8 4 1 7 11 13 5 2 
		}
		
		int tmp = arr[n-1];
		for (int i=n-1; i>0; i--) {
			arr[i] = arr[i-1];
		}
		
		arr[0]= tmp;
		
		for (int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
			
		}
	}

}
