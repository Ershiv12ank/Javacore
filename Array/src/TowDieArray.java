
public class TowDieArray {
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=10;
		arr[1][0]=100;
		arr[1][1]=1000;
		// Traverse by the help of for loop
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		// traverse by the help of for each loop 
		for(int x[]:arr) {
			for(int y:x) {
				System.out.println(y);
			}
		}
	}

}
