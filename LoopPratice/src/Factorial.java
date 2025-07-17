// Print the factorial of a number
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int factorial = 1;
		int n = scan.nextInt();
		for(int i = 1 ; i <= n ;i++) {
			factorial *=i;
		}
		System.out.println("Value of " + n + "! (factorial) is " + factorial);

	}

}
