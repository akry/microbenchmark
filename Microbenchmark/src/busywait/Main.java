package busywait;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length-1 != Integer.parseInt(args[0])) {
			System.err.println("wrong argments");
			System.exit(0);
		}
		
		final int concurrency = Integer.parseInt(args[0]);
		
		for(int i=0; i<concurrency; i++) {
			new BusyThread(i, Integer.parseInt(args[i+1])).start();
		}
		
	}

}
