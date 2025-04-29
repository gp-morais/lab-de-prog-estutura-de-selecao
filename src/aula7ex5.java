import java.util.Scanner;

public class aula7ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variaveis
        int valor1, valor2, valor3, aux;

        //entrada de dados
        System.out.println("Digite três números.");
        System.out.print("Número 1: ");
        valor1 = teclado.nextInt();
        System.out.print("Número 2: ");
        valor2 = teclado.nextInt();
        System.out.print("Número 3: ");
        valor3 = teclado.nextInt();

        //para valor1 < valor2 < valor3 --->
        if (valor1>valor2){
            aux = valor1;
            valor1 = valor2;
            valor2 = aux;
        }
        if (valor1>valor3){
            aux = valor1;
            valor1 = valor3;
            valor3 = aux;
        }
        if (valor2>valor3){
            aux = valor2;
            valor2 = valor3;
            valor3 = aux;
        }

        System.out.print("A odem crescente dos números é: "+valor1+", "+valor2+", "+valor3);


    }
}
