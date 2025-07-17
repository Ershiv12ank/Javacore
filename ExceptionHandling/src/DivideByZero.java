
public class DivideByZero {
	public static void main(String[] args) {
		try
		{
		int a = 10 , b = 0 , c;
		c = a / 0 ;
		System.out.println(c);
		
		}
		catch ( ArithmeticException e) {
			System.out.println("Error thows Divide by zero ");
		}
		System.out.println("Bye...");
	}

}
