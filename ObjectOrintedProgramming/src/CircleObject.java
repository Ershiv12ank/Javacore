class Circle {
	double radius;
	public double Area() {
		return Math.PI * radius * radius ;
	}
	
	public double Parimeater() {
		return 2 * Math.PI * radius;
	}
	
	public double Circumfrence() {
		return Parimeater();
	}
}
public class CircleObject {
	public static void main(String[] args) {
		
		Circle obj=new Circle();
		obj.radius=6;
		System.out.println(obj.Area());
	}

}
