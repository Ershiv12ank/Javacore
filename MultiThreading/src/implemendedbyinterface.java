class Mythread1 implements Runnable {
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i+ "Hello");
			i++;
		}
	}
}
public class implemendedbyinterface {
	public static void main(String[] args) {
		Mythread1 t = new Mythread1();
		Thread th = new Thread(t);
		th.start();
		
		int i = 1;
		while(true) {
			System.out.println(i+ "World");
			i++;
		}
	}

}
