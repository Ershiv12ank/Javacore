
public class MethodOverloding {
	static int sum(int a,int b) {
		return a+b;
	}
	static float sum(float a,float b) {
		return a+b;
	}
	static String sum(String a,String b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		float c=20.3f;
		float d=34.3f;
		String str="This is hello world! ";
		String str1="This is hello world!n2 ";
		
		System.out.println(sum(a,b));
		System.out.println(sum(c,d));
		System.out.println(sum(str,str1));
		
		
}

}
