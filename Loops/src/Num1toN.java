import java.util.Scanner;

public class Num1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scan.nextInt();
        for(int i = 1 ; i<=n ; i++) {
        	System.out.println(i);
        }
	
	}

}
