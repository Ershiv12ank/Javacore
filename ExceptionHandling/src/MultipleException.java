
public class MultipleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int arr [] = {1,2,3,0,2};
		System.out.println(arr[0]);
		int c = arr[1]/arr[3];
		
		System.out.println(arr[0]);
		}
		catch(ArithmeticException e) {
			System.out.println("Divisible by zero "+ e);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of Bound:"+ e);

		}
		System.out.println("Bye");

	}

}
