import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int soma;


        System.out.println("Insira um Número:");
        num1 = entrada.nextInt();

        System.out.println("Insira outro número:");
        num2 = entrada.nextInt();

        soma = num1 + num2;

        System.out.println("A Soma desses números é:" + soma);
    }

}
