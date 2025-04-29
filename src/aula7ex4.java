import java.text.DecimalFormat;
import java.util.Scanner;

public class aula7ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#,##");
        //variaveis
        double valor1, valor2, valor3;

        //entrada de dados
        System.out.println("Digite três números diferentes.");
        System.out.print("Número 1: ");
        valor1 = teclado.nextDouble();
        System.out.print("Número 2: ");
        valor2 = teclado.nextDouble();
        System.out.print("Número 3: ");
        valor3 = teclado.nextDouble();


        if (valor1==valor2 || valor2== valor3 || valor1==valor3){
    System.out.print("Erro. possuem números iguais.");
}
else {
    if (valor1 < valor2 && valor1 < valor3) {
        System.out.print("o menor valor é: " + decimal.format(valor1));
    } else if (valor2 < valor1 && valor2 < valor3) {
        System.out.print("o menor valor é: " + decimal.format(valor2));
    } else{
        System.out.print("o menor valor é: " + decimal.format(valor3));
    }
}









    }
}
