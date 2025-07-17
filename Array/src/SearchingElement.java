import java.util.Scanner;

public class SearchingElement {

		public static void main(String[] args) {
			// take the size of array
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of a array.");
			int len=scan.nextInt();
			// declare an array.
			int B[]=new int[len];
			// Enter element in the array.
			for(int i=0;i<len;i++) {
				B[i]=scan.nextInt();
			}
			
			// Searching a element
			System.out.print("Enetr element what you want to search.");
			int p=scan.nextInt();
			boolean isfind=false;
			
			for(int x:B) {
				if(x==p) {
					isfind=true;

				}
			}
			if(isfind==true) {
				System.out.println("Found.");
			}
			else {
				System.out.println("Not Found.");
			}
		
			
		}

}

