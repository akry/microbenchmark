package producerconsumer;

import java.util.Random;

public class Consumer extends Thread {
	private final Random random;
	private final Table table;
	private final Mediator m;
	
	Consumer(String _name, Table _table, long _seed, Mediator _m) {
		super(_name);
		table = _table;
		random = new Random(_seed);
		m = _m;
	}
	
	public void run() {
		try {
			while(true) {
				String cake = table.take();
				if(cake == null)
					break;
				Thread.sleep(random.nextInt(1000));
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" finished."+table.dumpCount());
	}
}
