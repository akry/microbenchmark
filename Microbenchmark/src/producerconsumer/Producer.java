package producerconsumer;

import java.util.Random;

public class Producer extends Thread {
	
	private final Random random;
	private final Table table;
	
	private final Mediator m;
	
	Producer(String _name, Table _table, long _seed, Mediator _m) {
		super(_name);
		table = _table;
		random = new Random(_seed);
		m = _m;
	}
	
	public void run() {
		try {
			while(m.done()) {
				Thread.sleep(random.nextInt(1000));
				String cake = "[ Cake No. " +m.nextId()+ " by " +getName()+ " ]";
				table.put(cake);
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" finished. "+table.dumpCount());
	}
}
