
public class finnalyBlock {
	public static void main() {
		// Finnaly block definitily excuited
		
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.print(e);
		}
		finally {
			System.out.print("Shivank pandey.");
		}
	}

}
