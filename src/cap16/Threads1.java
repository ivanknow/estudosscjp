package cap16;

public class Threads1 {
	public static void main(String[] args) {
		//modo de rodar 1
		MyThread m =  new MyThread();
		Thread m2 =  new Thread(new MyRunable());
		m.start();
		
		
		m2.start();
	}

}

// Existem duas formas de criar threads
// 1 - Herdar de Thread

class MyThread extends Thread {

	public void run() {
		System.out.println("isso que acontece qdo eu rodo concorrentemente");
		System.out.println(Thread.currentThread().getName());
	}

}

// 2 - Implementar a interface runable

class MyRunable implements Runnable {
	@Override
	public void run() {
		System.out.println("isso que acontece qdo eu rodo tambem");
		System.out.println(Thread.currentThread().getName());

	}
}