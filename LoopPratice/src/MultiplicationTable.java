//Print the multiplication table of a number

import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scan.nextInt();
		for (int i = 1;i <= 10 ; i++) {
			System.out.println(n+" X "+i+" = "+n*i);
		}

	}

}
