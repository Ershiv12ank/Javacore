import java.util.*;
public class InsertElement {
	
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
	System.out.println("Enter index of insert element:");
	int ind=scan.nextInt();
	System.out.println("Enter element:");
	int ele=scan.nextInt();
		
	
	for(int i=arr.length-1;i>ind;i--) {
		arr[i]=arr[i-1];
		
		}
		arr[ind]=ele;	
		System.out.println(Arrays.toString(arr));
	}
	
	
	

}
