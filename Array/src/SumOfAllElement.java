import java.util.Scanner;

public class SumOfAllElement {
	public static void main(String[] args) {
		// take the size of array
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of a array.");
		int n=scan.nextInt();
		// declare an array.
		int A[]=new int[n];
		// Enter element in the array.
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		
		// sum of array
		int sum=0;
		
		for(int x:A) {
			sum+=x;
		}
		
		System.out.println("Sum of all element of array is :"+sum);
		
	
		
	}

}
