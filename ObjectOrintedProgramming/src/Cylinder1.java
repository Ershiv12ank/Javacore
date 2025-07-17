class Cylinder_2 {
	// Private variable for hide
	private double radius;
	private double height;
	private double Pi;
	// Setter method for all 
	public void setRadius(double r) {
		radius = r;
	}
	public void setHeight(double r) {
		height = r;
	}

	public void setPI() {
		Pi = Math.PI;
	}
	
	// Setter for one setter
	
	public void Setter(double r , double h , double p) {
		radius = r;
		height = h;
		Pi = p;
		
		
	}
	
	// Getter method
	
	public double GetRadius() {
		return radius;
	}
	
	public double GetHeight() {
		return height;
	}
	
	public double GetPi() {
		return Pi;
	}
	

	
	// Cylinder constructure
	public double Cylinder_2() {
		
		return 2*Pi*radius*height;
		
	}
	
	public double Cylinder_2(double r) {
		radius =r;
		return 2*Pi*radius*height;
		
	}
	public double Cylinder_2(double r , double h) {
		radius = r;
		height = h;
		return 2*Pi*radius*height;
		
	}
	public double Cylinder_2(double r , double h , double p) {
		radius = r;
		height = h;
		Pi = p;
		return 2*Pi*radius*height;
		
	}

}
public class Cylinder1 {

	public static void main(String[] args) {
		Cylinder_2 cy = new Cylinder_2();
		cy.Setter(5, 3, 3.14);
		System.out.println("Area of Cylinder : " + cy.Cylinder_2());
		System.out.println("Area of Cylinder : " + cy.Cylinder_2(3));
		System.out.println("Area of Cylinder : " + cy.Cylinder_2(3,4));
		System.out.println("Area of Cylinder : " + cy.Cylinder_2(3,2,3.14));
	}

}
