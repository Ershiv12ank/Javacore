
public class BasicArrayCode {
	public static void main(String[] args) {
		// Initialize array
		int arr[]=new int[8];
		int arr1[]= {1,2,3,4,5,6};
		// traverse array 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// by the help of for each loop.
		for(int x:arr1) {
			System.out.println(x);
		}
		// after print update the value 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]++);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]); // it will be updateable value.
		}
		// by the help of for each loop.
		for(int x:arr1) {
			System.out.println(x++);
		}
		for(int x:arr1) {
			System.out.println(x);// it will not be updated it is only used to read the operation.
		}
	}

}
