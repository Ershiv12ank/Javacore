import java.util.Scanner;
public class Task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int N = scan.nextInt();
		int product = 1;
//		for(int i = 1 ; i <= N ; i=i+2) {
//			product = product * i;	
//		}
		for(int i = 1 ; i <= N ; i++) {
			if(i%2 != 0) {
			product = product * i;	
		}
		}
		System.out.println("Product of number between 1 to " + N + " is " + product);
		
	}

}
