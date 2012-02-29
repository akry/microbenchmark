package producerconsumer;

public class MyThread extends Thread {

	MyThread() {
	}
	
	public void run() {
		System.out.println("Name: "+this.getName()+" sleeps while...");
		try {
			sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name: "+this.getName()+" returned from sleep...");
	}
}
