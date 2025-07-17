class ATM {
	public void checkbal(String name) {
		int x;
		System.out.println(name + " Your balance shows :");
}
	public void Withdraw(String name , int bal) {
		System.out.println(name + "You have sussesfully withdraw " + bal);
	}
}

class custumer extends Thread() {
	ATM atm;
	String name;
	int bal;
	public void useatm(String s , ATM a , int bal) {
		atm=a;
		name=s;
		this.bal=bal;
		
	}
	public void run() {
		useatm()


}
}
}
public class SycATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
