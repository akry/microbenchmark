package disk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DiskWriterThread extends Thread {

	final private String filename;
	
	DiskWriterThread(final String _filename) {
		this.filename = _filename;
	}
	
	public void run() {
		try {
			final FileWriter out = new FileWriter(new File(this.filename));
			final Random rnd = new Random();

			for(int i=0; i<10; i++) {
				out.write(String.valueOf(rnd.nextInt()));
			}
			
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
