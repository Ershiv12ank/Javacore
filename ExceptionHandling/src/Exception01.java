import java.util.*;
public class Exception01 {
	public static void main(String[] args) {
		int c;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();
		
		

		try
		{
		
		c = n / b ;
		System.out.println(c);
		
		}
		catch ( ArithmeticException e) {
			System.out.println("Denominator should not be Zero : Try again.");
		}
		System.out.println("Bye...");
	}

}
