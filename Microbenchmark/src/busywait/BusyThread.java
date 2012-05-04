package busywait;

import java.lang.Thread;

public class BusyThread extends Thread {
	
	final private int id;
	final private int time;
	
	public BusyThread(final int _id, final int _time) {
		time = _time;
		id = _id;
	}
	
	public void run() {
		System.out.println("Thread " + id);
		final long start = System.currentTimeMillis();
		
		while(System.currentTimeMillis()-start < time*1000) {
			
		}
		
//		for(int i=0; i<loop; i++) {
//			for(int j=0; j<loop; j++) {
//				for(int m=0; m<loop; m++) {
//
//				}
//			}
//		}
		
		System.out.println("Thread " + id + " terminated...");
	}
}
