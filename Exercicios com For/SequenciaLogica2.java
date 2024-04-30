import java.util.Scanner;

public class SequenciaLogica2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numeroEntrada;
		int numeroSaida;

		numeroEntrada = in.nextInt();
		numeroSaida = in.nextInt();

		int numeroSequencial = 1;

		for (int i = 1; i <= numeroSaida; i++) {
			if (i % numeroEntrada == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
