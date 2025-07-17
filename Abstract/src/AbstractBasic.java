abstract class Name{
	abstract void name();
}
class MyName extends Name{
	void name() {
		System.out.println("Shivank Pandey.");
	}
}
public class AbstractBasic {
	public static void main(String[] args) {
		Name n = new MyName();
		n.name();
		
	}

}
