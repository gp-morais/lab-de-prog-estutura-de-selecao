import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor;
        valor = teclado.nextDouble();
        System.out.print(valor%2==0?"o valor é par":"o valor é ímpar");


    }
}
