class Mydata {
	synchronized public void Display(String str) {
		
		for(int i =0 ;i<str.length();i++) {
			System.out.print(str.charAt(i) + " ");
		}
	}
	


}
class mythread1 extends Thread {
	Mydata d;
    mythread1 (Mydata dat ){
    	this.d=dat;
    }
    public void run() {
    	d.Display("Hello world");
    }
	
}
class mythread2 extends Thread {
	Mydata data;
    mythread2 (Mydata dat ){
    	this.data=dat;
    }
    public void run() {
    	data.Display("Welcome");
    }
	
}
public class Syn01 {
	public static void main(String[] args) {
		Mydata d1 = new Mydata();
		mythread1 d2 = new mythread1(d1);
		mythread2 d3 = new mythread2(d1);
		
		d2.start();
		d3.start();
		
		
		
	}

}
