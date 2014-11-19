package cap16;

public class ThreadSleep implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadSleep());
		t.start();
		Thread.sleep(5000);
		System.out.println("acabe home");
	}

	@Override
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Acabei");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
