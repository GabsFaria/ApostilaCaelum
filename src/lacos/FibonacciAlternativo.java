package lacos;

//Fibonacci	usando	apenas	duas variáveis.

public class FibonacciAlternativo {

	public static void main(String[] args) {
		int j = 1;
		for (int i = 0; i <= 100;) {
			if (i == 0) {
				System.out.println(i);
				i++;
			} else if (i == 1) {
				System.out.println(i);
				System.out.println(i);
				i++;
			} else {
				System.out.println(i);
				i = i + j;
				j = i - j;
			}

		}

	}

}
