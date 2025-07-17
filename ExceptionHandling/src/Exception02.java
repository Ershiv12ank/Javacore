class exp {
	public void fun1(){
		try {
		System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}
		
	public void fun2() {
		fun1();
	}
	public void fun3() {
		fun2();
	}
}
public class Exception02 {
	public static void main(String[] args ) {
		exp e = new exp();
		e.fun2();
		
	}

}
