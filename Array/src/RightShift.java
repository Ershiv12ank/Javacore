import java.util.Arrays;

public class RightShift {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int m=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];

		}
		arr[0]=m;
		System.out.println(Arrays.toString(arr));
	}


}
