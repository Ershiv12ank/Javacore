class parent1 {
	public parent1() {
	System.out.println("Parent Class.");
              }
	public parent1(int x) {
		System.out.println("Parem Parent Class.");
	}
	
}

class child1 extends parent1 {
	 child1() {
	System.out.println("child Class.");
}
	child1(int x) {
		System.out.println("Parem child Class.");
		
	}
	
	child1(int x,int y) {
		super(x);
		System.out.println("Parem child Class.");
		
	}
}
public class InherentParamtrise {

	public static void main(String[] args) {
		child1 c1 = new child1(4,4);
		
		

	}

}
