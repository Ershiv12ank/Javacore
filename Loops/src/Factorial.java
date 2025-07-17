import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scan.nextInt();
        int factorial = 1;
        for(int i = 1 ; i<=n ; i++) {
        	factorial *= i;
 
        }
        System.out.println("Factiroal of " + n + "! is " + factorial);
	
	}
	
}

