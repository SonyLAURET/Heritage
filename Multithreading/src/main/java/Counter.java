
public class Counter implements Runnable {

	public void run() {
		int counter=0;
		
		while (counter<10) {
			System.out.print(counter+"");
			counter++;
			
		}
		
	}

}

