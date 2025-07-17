//6. Count the number of digits in a number
import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scan.nextInt();
        int m=n;
        int count =0;
        while(n>0) {
        	n /= 10;
        	count++;

        }
        System.out.println("Number of digit in "+m+" is "+count);
	
	}
}

