import java.util.Scanner;

public class SumOfNnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++) {
        	sum +=i;

	
	}
        System.out.println("Sum of 1 To " + n + " is :" + sum);
}

}
