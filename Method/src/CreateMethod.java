
public class CreateMethod {
	static int SumofNum(int a,int b) {
		return a+b;
	}
	static void increment(int x) {
		x++;
		System.out.println(x);
	}
	static int[] update(int [] arr) {
		arr[0]=1;
		return arr;
	}
	public static void main(String[] args) {
		int a=10,b=78;
		int c=SumofNum(a,b);
		increment(a);
		System.out.println(a);
		System.out.println(c);
		int arr[]= {2,3,4,5,6};
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		update(arr);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		
		
	}

}
