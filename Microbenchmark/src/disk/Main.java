package disk;

public class Main {
	public static void main(String[] args) {
		new DiskWriterThread("file1.txt").start();
		new DiskWriterThread("file2.txt").start();
	}
}
