import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		// Create an array of length n by taking input.
		Scanner scan =new Scanner(System.in);
		//System.out.println("Enter the length of array:");
		int [] arr=new int[10];
		arr[0]=10;
		arr[1]=20;
		
		arr[2]=30;
		arr[3]=40;
		//System.out.println(arr.length);
	System.out.println("Enter index of deleated element element:");
	int ind=scan.nextInt();

		
	if(ind>=0) {
	for(int i=ind;i<arr.length-1;i--) {
		arr[i]=arr[i+1];
		
		}
			
		System.out.println(Arrays.toString(arr));
	}


	}
	}
