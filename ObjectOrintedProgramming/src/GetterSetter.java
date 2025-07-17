class Rectangle1 {
	private double length;
	private double width;
	
	public void setter(double a,double b) {
		length =a;
		width =b;
	}
	public void Getter() {
		System.out.println("Length :" + length);
		System.out.println("Width :" + width);

	}
	
	public double Area() {
		return length*width;
	}
}
public class GetterSetter {
	public static void main(String[] args) {
		Rectangle1 obj = new Rectangle1();
		System.out.println("Area:" + obj.Area());
		obj.setter(2, 3);
		obj.Getter();
		System.out.println("Area:" +  + obj.Area());
		
	}

}
