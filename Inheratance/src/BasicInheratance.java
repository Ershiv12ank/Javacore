class Circle {
	double radius ;
	
	public double Area() {
		return Math.PI*radius*radius;
	}
	
	public double Parimeter() {
		return 2*Math.PI*radius;
	}
	
	public double Circumfrence() {
		return Parimeter();
	}
}

class cylinder extends Circle {
	double height ;
	
	public double Volume() {
		return Area()*height;
	}
}
public class BasicInheratance {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		cylinder c2 = new cylinder();
		
		c1.radius=12;
		System.out.println("Radius : " + c1.radius);
		System.out.println("Area : " + c1.Area());
		c2.height=10;
		System.out.println("Radius : " + c2.height);
		System.out.println("Volume : " + c2.Volume());
		
	}
	

}
