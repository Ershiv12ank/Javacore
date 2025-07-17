//7. Reverse a number

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scan.nextInt();
        int rev = 0;
        while(n>0) {
        	int m = n%10;
        	rev = rev*10 + m;
        	n /=10;
        }
        System.out.println(rev);

}
}
