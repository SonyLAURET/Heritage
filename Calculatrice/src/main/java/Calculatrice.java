import java.util.Scanner;

public class Calculatrice {

	
	Scanner sc = new Scanner(System.in);
	/**
	 * i do a function for each operation(+,-,*,/). I suppose, for the moment, the
	 * number that we use are float or integer.
	 */
	
		public static void main(String[] args) {
			int num = 0;
			int s = 0;
			String nbr = null;
			String o="";

			SelectNumber select = new SelectNumber(num, nbr, s,o);
			select.selectNum();
			select.selectOperator();
			select.selectNum();
		
	}

}
