package cap16;

public class ThreadJoin extends Thread {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin join = new ThreadJoin();
		
		join.start();
		join.join();
		
		System.out.println("opa");
	}
	
	public void run() {
	System.out.println("rodei");
	}
}
