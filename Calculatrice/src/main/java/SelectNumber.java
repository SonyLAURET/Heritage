import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class SelectNumber {
	/** we initialize the variable */
	double num1 = 0.0;
	double somme = 0.0;
	String number;
	String operator;
	Scanner sc = new Scanner(System.in);

	public SelectNumber(double num, String nbr, double s, String o) {

		num1 = num;
		number = nbr;
		somme = s;
		String operator = null;
	}

	/**
	 * we do a "do..while" for force the user to enter a number. he can stop this in
	 * write "stop" .
	 */
	public double selectNum() {
		do {
			System.out.println("veuillez saisir un chiffre ou un nombre : ");
			number = sc.nextLine();
			if (number.equals("stop")) {
				break;
			}
		} while (!(StringUtils.isNumeric(number)));
		return num1 = Double.parseDouble(number);
	}

	/**
	 * we do a "do..while" for force the user to enter a operator (+,-,*,/). he can
	 * stop this in write "stop" .
	 */
	public void selectOperator() {
		do {
			System.out.println("veuillez saisir un op�rateur : ");
			operator = sc.nextLine();
			if (operator.equals("stop")) {
				break;
			}
		} while (!(operator.equals("+")) && !(operator.equals("-")) && !(operator.equals("*"))
				&& !(operator.equals("/")));

	}

	public static  double addition(double num1, double num2) {
		return num1 + num2;
	}

	public double soustraction(double num1, double num2) {
		return num1 - num2;
	}

	/** i do a product and put parenthesis around num2 for negative number */
	public double product(double num1, double num2) {
		return num1 * (num2);
	}

	/** care to division by 0 */
	public double division(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("vous ne pouvez diviser par 0");
		} else {
			return num1 / num2;
		}
		return 0;
	}

	/** I have to cut my code on many unties for do test */
	public double showResult(double num1, double num2) {
		if (operator.equals("+")) {
			return addition(num1, num2);
		} else if (operator.equals("-")) {
			return soustraction(num1, num2);
		} else if (operator.equals("/")) {
			return division(num1,num2);
		} else if (operator.equals("*")) {
			return product(num1, num2);
		}
		return 0.0;
	}
}
