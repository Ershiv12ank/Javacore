class Super {
	public void Display() {
		System.out.println("Super Class Display");
	}
}
 class Sub extends Super{
	
	public void Display() {
		System.out.println("Sub Class Display");
	}
}
public class MrthodOveride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub s = new Sub();
		s.Display();
	}

}
