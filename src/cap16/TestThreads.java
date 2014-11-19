package cap16;

class TestThreads2 implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("Runnable running"+x);
		}
	}
	
}

public class TestThreads {
	public static void main(String[] args) {
		TestThreads2 r = new TestThreads2();
		Thread t = new Thread(r);
		t.start();
	}
}
