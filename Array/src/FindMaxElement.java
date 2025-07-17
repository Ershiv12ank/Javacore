
public class FindMaxElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,54,6,78,5,43,33,4,5,344};
		int max=Integer.MIN_VALUE;
		for(int x:arr) {
			if(x>max) {
				max=x;
			}
		}
		System.out.println("Maximum element in array :"+max);
	}

}
