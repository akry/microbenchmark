package busywait;

import java.lang.Thread;

public class BusyThread extends Thread {
	
	final private int id;
	final private int loop;
	
	public BusyThread(final int _id, final int _loop) {
		loop = _loop;
		id = _id;
	}
	
	public void run() {
		System.out.println("Thread " + id);
		
		for(int i=0; i<loop; i++) {
			for(int j=0; j<loop; j++) {
				for(int m=0; m<loop; m++) {
					
				}
			}
		}
		
		System.out.println("Thread " + id + " terminated...");
	}
}
