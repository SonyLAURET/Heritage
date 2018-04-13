import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class SelectNumber {
	/** we initialize the variable */
	int num1 = 0;
	int somme = 0;
	String number;
	String operator;
	Scanner sc = new Scanner(System.in);

	public SelectNumber(int num, String nbr, int s, String o) {

		num1 = num;
		number = nbr;
		somme = s;
		String operator = null;
	}

	/**
	 * we do a "do..while" for force the user to enter a number. he can stop this in
	 * write "stop" .
	 */
	public void selectNum() {
		do {
			System.out.println("veuillez saisir un chiffre ou un nombre : ");
			number = sc.nextLine();
			if (number.equals("stop")) {
				break;
			}
		} while (!(StringUtils.isNumeric(number)));
		num1 = Integer.parseInt(number);
	}

	/**
	 * we do a "do..while" for force the user to enter a operator (+,-,*,/). he can
	 * stop this in write "stop" .
	 */
	public void selectOperator() {
		do {
			System.out.println("veuillez saisir un opérateur : ");
			operator = sc.nextLine();
			if (operator.equals("stop")) {
				break;
			}
		} while (!(operator.equals("+")) && !(operator.equals("-")) && !(operator.equals("*"))
				&& !(operator.equals("/")));

	}

	public double showResult(double num1,double num2) {
		if (operator.equals("+")) {
			return num1+num2;
			
		}
		else if (operator.equals("-")) {
			return num1-num2;
		}
		else if (operator.equals("/")) {
			return num1/num2;
		}
		else if (operator.equals("*")) {
			return num1*num2;
		}
		return 0;
		}
}
