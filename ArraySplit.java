import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6};
		int position = 3; //자를 인덱스 
		
		int[] arr1 = new int[position];
		int[] arr2 = new int[arr.length-position];
		
		for (int i=0; i<arr.length; i++) {
			if(i<position) {
				arr1[i]=arr[i];
			} else {
				arr2[i-position]=arr[i];
			}
		}
		
		 System.out.println(Arrays.toString(arr1));
		 System.out.println(Arrays.toString(arr2));
		 
		 
	}

}
