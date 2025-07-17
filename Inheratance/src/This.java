class Rec {
	double length;
	double width;
	
	public Rec (double l , double w) {
		this.length = l;
		this.width = w;
	}
	public double Area() {
		return length*width;
	}
}
public class This {
	public static void main(String[] args) {
		Rec r1 = new Rec(1,2);
		System.out.println(r1.Area());
		
	}

}
