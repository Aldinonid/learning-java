package self_learning;

public class ThreadApp {
	public static void main(String[] args) {
		// Extend Thread
		MyThread t1 = new MyThread();
		t1.start();
		
		// Implement Runnable
		Thread t2 = new Thread(new MyRunnable());
		t2.start();
		
		// Lambda (shortest)
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 5; i++) System.out.println("Lambda thread: " + i);
		});
		t3.start();
	}
}

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) System.out.println("Thread berjalan: " + i);
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) System.out.println("Runnable jalan: " + i);
	}
}
