package homework1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator obj = new Calculator();
		System.out.println("Enter a number for Addition: ");
		
		int a =scan.nextInt();
		int b =scan.nextInt();
		System.out.println("Addition of " + a + " And " + b + ": " + obj.add(a,b));

		System.out.println("Enter a number for Multiplication: ");
		int c =scan.nextInt();
		int d =scan.nextInt();
		System.out.println("Product of " + a + " And " + b + ": " + obj.mul(c,d));
		
		System.out.println("Enter a number for Subtract: ");
		int e =scan.nextInt();
		int f =scan.nextInt();
		System.out.println("Difference of " + a + " And " + b + ": " + obj.sub(e,f));
		
		System.out.println("Enter a number for Division: ");
		int g =scan.nextInt();
		int h =scan.nextInt();
		System.out.println("Division of " + a + " And " + b + ": "+ obj.div(g,h));
		
	}

}
