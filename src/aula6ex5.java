import java.util.Scanner;

public class aula6ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ladoA,ladoB,ladoC;

        System.out.print("Digite o valor do primeiro lado: ");
        ladoA = teclado.nextDouble();

        System.out.print("Digite o valor do segundo lado: ");
        ladoB = teclado.nextDouble();

        System.out.print("Digite o valor do terceiro lado: ");
        ladoC = teclado.nextDouble();

        if (ladoA+ladoB>ladoC && ladoA+ladoC>ladoB && ladoC+ladoB>ladoA){
            if (ladoA==ladoB && ladoA==ladoC){
                System.out.print("Os valores formam um triângulo real equilatero");
            }
            else{
            System.out.print("Os valores formam um triângulo real");
            }
        }

        else {
            System.out.print("Os Valores não formam um triangulo. Repita!");
        }

    }
}
