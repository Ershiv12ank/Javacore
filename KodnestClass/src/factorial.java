
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int factorial = 1;
		int n = 5;
		while(i<=n) {
			factorial *= i;
			//System.out.println(i);
			i++;
		}
		System.out.println("Factorial: " + factorial);
		

	}

}
