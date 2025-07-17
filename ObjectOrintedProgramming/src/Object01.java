class animal {
	int age ;
	String color;
	void eat() {
		System.out.println("Eating.");
	}
	void rest() {
		System.out.println("Reasting.");
	}
}
public class Object01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal cat = new animal();
		cat.age = 20;
		cat.color = "Black";
		
		cat.eat();
		cat.rest();
		
		animal dog = new animal();
		dog.age = 21;
		dog.color = "Red";
		
		dog.eat();
		dog.rest();

	}

}
