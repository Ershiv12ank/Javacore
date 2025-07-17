
public class VaribleArgument {
	static void VarArgu(int ...x) {
		for(int x1:x) {
			System.out.println(x1);
		}
	}

	public static void main(String[] args) {
		VarArgu(1,2,3,4,5,6,7,8);
		
	}

}
