import java.util.Scanner;

public class Calculatrice {

	Scanner sc = new Scanner(System.in);

	/**
	 * i do a function for each operation(+,-,*,/). I suppose, for the moment, the
	 * number that we use are float or integer.
	 */

	public static void main(String[] args) {
		double num = 0;
		double s = 0;
		String nbr = null;
		String o = "";
		double num1 = 0;
		double num2 = 0;

		SelectNumber select = new SelectNumber(num, nbr, s, o);
		num1 = select.selectNum();
		select.selectOperator();
		num2 = select.selectNum();
		System.out.println("votre résultat est: " + select.showResult(num1, num2));

	}

}
