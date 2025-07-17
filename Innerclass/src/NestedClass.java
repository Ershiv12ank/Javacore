class Outer{
	int x=10;
	class Inner {
		int y =20;
		public void display() {
		System.out.println("x:" + x + " y:" + y);
	}
	}
	void Display() {
		Inner i = new Inner();
		System.out.println("x:" + x + "y:" + i.y);
	}
}

public class NestedClass {
	public static void main(String[] args) {
		Outer.Inner oi = new  Outer().new Inner();
		oi.display();
		
	}
}
