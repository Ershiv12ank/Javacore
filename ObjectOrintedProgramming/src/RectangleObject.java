class Rectangle {
	double length;
	double width;
	
	public double Circumfrence() {
		return 2*(length+width);
	}
	
	public double Area() {
		return length*width;
	}
	
}



public class RectangleObject {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.length = 23.4;
		obj.width = 34.5;
		
		System.out.println("Area : " + obj.Area());
		System.out.println("Circumfrence : " + obj.Circumfrence());

	}

}
