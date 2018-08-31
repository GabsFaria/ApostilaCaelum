package lacos;

public class Fatoriais {

	public static void main(String[] args) {

		for (long i = 0; i <= 20; i++) {
			if (i == 0) {
				System.out.println("O fatorial de " + i + " é 1");
			} else {
				long fatorial = 1;
				for (long j=i; j >= 1; j--) {
					fatorial *= j;
				}
				System.out.println("O fatorial de " + i + " é " + fatorial);
			}
		}
	}

}
