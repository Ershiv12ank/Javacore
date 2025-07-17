abstract class KFC {
	public void aboutkf() {
		System.out.println("This is a kfc world");
	}
	abstract void Billing();
	abstract void offer();
	
}
class MyKFC extends KFC {

	void Billing() {System.out.println("This is a Billing rules.");}
    void offer(){System.out.println("This is a Offer Going on.");}
	void festiveloffer(){System.out.println("This is a special Festivle Offer Going on.");}
	
}

public class KFCabstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KFC kf = new MyKFC();
		kf.aboutkf();
		kf.Billing();
		kf.offer();
		

	}

}
