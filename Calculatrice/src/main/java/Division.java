

public class Division {
	
	public float division(float a, float b) {
		/**
		 * We have to care to the division by 0, so we do a condition here on a and b.
		 */
		if (a == 0) {
			return 0;
		} else if (b == 0) {
			System.out.println("on ne peut pas diviser par zéro!!");
		}
		return a / b;

	}
}
