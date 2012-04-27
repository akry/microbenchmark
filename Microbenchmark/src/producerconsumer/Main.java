package producerconsumer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = Integer.parseInt(System.getProperty("producerconsumer.table"));
		int pros = Integer.parseInt(System.getProperty("producerconsumer.producer"));
		int cons = Integer.parseInt(System.getProperty("producerconsumer.consumer"));
		
		Mediator m = new Mediator(Integer.parseInt(System.getProperty("producerconsumer.limit")));
		
		Table table = new Table(t,m);
		for(int i=0; i<pros; i++)
			new Producer("P"+i, table, System.currentTimeMillis(), m).start();
		for(int j=0; j<cons; j++)
			new Consumer("C"+j, table, System.currentTimeMillis(), m).start();
	}

}
