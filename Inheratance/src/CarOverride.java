class Car {
	public void Start() {
		System.out.println("Car start.");
	}
	public void ChangeGear() {
		System.out.println("Car Change Gear.");
	}
	public void Acclerate() {
		System.out.println("Car Acclerated.");
	}
	
}

class LuxuryCar extends Car {
	public void Start() {
		System.out.println("LuxuryCar start.");
	}
	public void AutoGear() {
		System.out.println("LuxuryCar Change Gear.");
	}
	public void Acclerate() {
		System.out.println("LuxuryCar Acclerated.");
	}
	public void OpenRoof() {
		System.out.println("LuxuryCar RoofOpend.");
	}

	
}
public class CarOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryCar lc = new LuxuryCar();
		System.out.println("Luxuray car object ");
		lc.Start();
		lc.AutoGear();
		lc.Acclerate();
		lc.OpenRoof();
		
		Car c = new Car();
		System.out.println("Luxuray car object ");
		c.Start();
		c.ChangeGear();
		c.Acclerate();
		
		

	}

}
