abstract class Shape {
	double length;
	double width;
	double radius;
	abstract double Area();
	abstract double Perimeter();
}

class circle extends Shape {
	
	
	double Area() {
		return radius*radius*Math.PI;
	}
	double Perimeter() {
		return 2*radius*radius*Math.PI; 
	}
}

class Rectangle extends Shape {

	double Area() {
		return length*width;
	}
	double Perimeter() {
		return 2*(length+width);
	}
}

public class ShapeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new  Rectangle();
		Shape s1 = new  circle();
		s.length=12;
		s.width=2;
		s1.radius=45;
		System.out.println(s.Area());
		System.out.println(s.Perimeter());
		System.out.println(s1.Area());
		System.out.println(s1.Perimeter());
		

	}

}
