class Cylinder {
	double radius;
	double height;
	double diameter=radius*2;
	double Pi=Math.PI;
	
	public double CurvedSurfaceArea() {
		return 2*Pi*radius*height;
	}
	
	public double TotalSurfaceArea() {
		return 2*Pi*radius*(height+radius);
	}
	
	public double VolumeOfCylinder() {
		return Pi*radius*radius*height;
	}
	
	public double BaseArea() {
		return Pi*radius*radius;
	}
}


public class CylinderObject {
	public static void main(String[] args) {
    Cylinder obj=new Cylinder();
    obj.radius=10;
    obj.height=18;
    
    System.out.println("Curved Surface Area : " + obj.CurvedSurfaceArea());
    System.out.println("Total Surface Area : " + obj.TotalSurfaceArea());
    System.out.println("Volume of Cylinder : " + obj.VolumeOfCylinder());
    System.out.println("Base Area : " + obj.BaseArea());
		
		
	}

}
