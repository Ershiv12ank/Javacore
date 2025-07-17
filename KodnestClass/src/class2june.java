
public class class2june {
	public static void main(String[] args) {
		String fname = "Ajay";
		String lName = "Singh";
		String flname = printName(fname,lName);
		System.out.println(flname);
	}
	static String printName(String firstname , String lastName ) {
		String fullname = firstname + " " + lastName;
		return fullname;
	}

}
