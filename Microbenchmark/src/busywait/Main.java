package busywait;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.err.println("wrong argments");
			System.exit(0);
		}
		
		final int concurrency = Integer.parseInt(args[0]);
		final int loop = Integer.parseInt(args[1]);
		
		for(int i=0; i<concurrency; i++) {
			new BusyThread(i, loop).start();
		}
		
	}

}
