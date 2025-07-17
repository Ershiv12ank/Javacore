import java.util.Scanner;

public class UseWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int n = 10;
		int sum = 0;
//		System.out.println("Enter a number:" );
//		int n = scan.nextInt();
		// Print number 1 to 10
		while(i<=n) {
		     System.out.println(i);
			i++;
			}
		// Sum of  first n number
		i=0;
		while(i<=n) {
			sum = sum+i;
			i++;
			}
		System.out.println(sum);

	}

}
