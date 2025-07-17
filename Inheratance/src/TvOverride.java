class TV {
	public void SwithOn() {
		System.out.println("TV Swith ON");
	}
	public void SwithOff() {
		System.out.println("TV Swith OFF");
	}
	
	
}
class smartTv extends TV {
	public void SwithOn() {
		System.out.println(" Smart TV Swith ON");
	}
	public void SwithOff() {
		System.out.println(" Smart TV Swith OFF");
	}
	public void Browising() {
		System.out.println(" Smart TV Browsing.");
	}
}
public class TvOverride {
	public static void main(String[] args) { 
		TV sm = new smartTv();
		sm.SwithOn();
		//sm.Browising();		
		sm.SwithOff();
	}

}
