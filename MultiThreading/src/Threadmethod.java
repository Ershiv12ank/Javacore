class newThread extends Thread {
	public newThread (String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);
		setPriority(Thread.MIN_PRIORITY+2);
	}
	public void run() {
		int i=0;
		while (true) {
			System.out.println(i);
			i++;
			try {
			Thread.sleep(10);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class Threadmethod {
	
	public static void main(String[] args) {
		newThread t = new newThread("My Thread 1");
//		System.out.println("Id" + t.getId());
//        System.out.println("Priprity "+ t.getPriority() );
//        System.out.println("State " + t.getState());
//        System.out.println("Thread Name " + t.getName());
//        System.out.println("Alive " +t.isAlive());
        t.setDaemon(true);
        t.start();
        
        //t.interrupt();
        Thread mainThread = new Thread();
        try {
        mainThread.join();
        }
        catch (Exception e) {
        	System.out.println(e);
        }
		
	}

}
