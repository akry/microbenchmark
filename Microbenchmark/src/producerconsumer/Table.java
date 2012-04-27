package producerconsumer;


public class Table {
	private final String[] buf;
	private int tail;
	private int head;
	private int count;
	private final Mediator m;
	
	Table(int _count, Mediator _m) {
		buf = new String[_count];
		head = 0;
		tail = 0;
		count = 0;
		m=_m;
	}
	
	public synchronized void put(String cake) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()+" puts "+cake);
		
		while(count >= buf.length) {
			wait();
		}
		buf[tail] = cake;
		tail = (tail+1) % buf.length;
		count++;
		notifyAll();
	}
	
	public synchronized String take() throws InterruptedException {
		
		if(!m.done() && count<=0) {
			notifyAll();
			return null;
		}
		
		while (m.done() && count <= 0) {
			wait();
		}
		String cake = buf[head];
		head = (head+1) % buf.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+" takes "+cake);
		return cake;
	}
	
	public int dumpCount() {
		return count;
	}
}
