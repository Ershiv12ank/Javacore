abstract class Hospital{
	 abstract  void Emergency();
	 abstract  void Appointment();
	 abstract  void Billing();
	 abstract  void Admit();
	 abstract  void ICU();
	
}
class Myhospital extends Hospital{
	 void Emergency() {
		 System.out.println("My hospital Emergecy ward");
	 }
	 void Appointment(){
		 System.out.println("My hospital Taking Appointement place");
	 }
	 void Billing(){
		 System.out.println("My hospital Billing section");
	 }
	 void Admit(){
		 System.out.println("My hospital Admit rules");
	 }
	 void ICU(){
		 System.out.println("My hospital ICU facility");
	 }
	
}

public class HospitalAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital h = new Myhospital();
		h.Admit();
		h.Appointment();
		h.Billing();
		h.Emergency();
		h.ICU();

	}

}
