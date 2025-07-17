
class NegativeDiemensionException extends Exception {
	public String toString() {
		return "Negative Diemension Exception .";
	}
}

public class Exception04 
{
	
	static int area(int l , int w) throws NegativeDiemensionException {
		if(l<0 || w < 0) 
			throw new NegativeDiemensionException();
		
		return l*w;
	}
	static void fun1() throws NegativeDiemensionException{
		System.out.println(area(-2,4));
	}
	public static void main(String[] args) {
		try {
		fun1();
		}
		catch (NegativeDiemensionException e) {
			System.out.println(e);
		}
		
	}

}
