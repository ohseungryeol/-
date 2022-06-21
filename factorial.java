
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		
	}
	
	static int factorial(int n) {
		//5*4*3*2*1
		
		if (n==1) {
			return 1;
		}
		
		return n*factorial(n-1);
		
	}

}
