
public class Exeption03 {
	static void Fun1() {
		try {
			
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	static void Fun2() {
		Fun1();
	}
	static void Fun3() {
		Fun2();
	}
	public static void main(String[] args) {
		Fun3();
		
	}

}
