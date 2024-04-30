import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double pi = 3.14159;
		double raio;
		
		raio = in.nextDouble();
		
		double A = pi * (raio * raio);
		
		System.out.printf("A=%.4f\n", A);
		
	}
}
