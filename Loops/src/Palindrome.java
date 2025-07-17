// 8. Check if a number is palindrome

import java.util.Scanner;

public class Palindrome {


		public static void main(String[] args) {
			// TODO Auto-generated method stub\\
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a number.");
	        int n = scan.nextInt();
	        int pro =n;
	        int rev = 0;
	        while(n>0) {
	        	int m = n%10;
	        	rev = rev*10 + m;
	        	n /=10;
	        }
	        if(pro==rev) {
	        System.out.println("Palindrome");
	} else {
		 System.out.println("Not Palindrome");
	}
		}
}
