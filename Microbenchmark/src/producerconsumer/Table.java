package producerconsumer;


public class Table {
	private final String[] buf;
	private int tail;
	private int head;
	private int count;
	
	Table(int _count) {
		buf = new String[_count];
		head = 0;
		tail = 0;
		count = 0;
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
		while (count <= 0) {
			wait();
		}
		String cake = buf[head];
		head = (head+1) % buf.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+" takes "+cake);
		return cake;
	}
}
