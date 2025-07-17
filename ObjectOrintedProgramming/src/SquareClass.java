class Square {
	double side;
	public double Area() {
		return side * side;
	}
	
	public double Parimeter() {
		return 4*side;
	}
}
public class SquareClass {
	public static void main() {
		Square obj=new Square();
		obj.side=10;
		System.out.println(obj.Area());
		System.out.println(obj.Parimeter());
		
	}

}
