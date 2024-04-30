import java.util.Scanner;

public class FatorialSimples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int Numero;
		Numero = in.nextInt();
		
		int Fatorial = 1;
		
		for (int i = 1; i <= Numero; i++) {
			  Fatorial = Fatorial * i;
		}
		
		System.out.println(Fatorial);
	}
}
