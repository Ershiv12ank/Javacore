
public class SecondMaximum {
	public static void main(String[] args) {
		int arr[]= {1,1,1,1,1};
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		boolean issame=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[0]) {
				issame=false;
			}
		}
		if(issame==false) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>secmax) {
				secmax=arr[i];
				if(arr[i]>max) {
					secmax=max;
					max=arr[i];
				}
			}
		}
		System.out.println("Second largest element "+secmax);
		}
		else {
			System.out.println("All element is Same.");
			
		}
		
		
		
	}

}
