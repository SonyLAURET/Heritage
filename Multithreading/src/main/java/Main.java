
public class Main {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Counter());
		thread1.start();
		Thread thread2 = new Thread(new Counter());
		thread2.start();

	}

}
