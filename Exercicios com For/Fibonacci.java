import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numero;
		numero = in.nextInt();

		int A = 0;
		int B = 1;
		int C = 0;

		for (int i = 0; i < numero; i++) {
			if (i == numero - 1) {
				System.out.println(C);
			}else {
				System.out.print(C+ " ");
			}
			
			A = B;
			B = C;
			C = A + B;
		}
	}
}
