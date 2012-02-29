package producerconsumer;

public class Mediator {

	private static int id=0;
	private final int upperCake;
	
	Mediator(int up) {
		upperCake = up;
	}
	
	public synchronized int nextId() {
		return id++;
	}
	
	public boolean done() {
		if(id >= upperCake)
			return false;
		return true;
	}
}
