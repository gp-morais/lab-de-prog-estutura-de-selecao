import java.util.Scanner;

public class aula8ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;

        System.out.print("Digite uma letra de a-z: ");
        letra = teclado.next();
        letra = letra.toLowerCase();

        if (letra.equals("a") ||
            letra.equals("e") ||
            letra.equals("i") ||
            letra.equals("o") ||
            letra.equals("u")){
            System.out.print("A letra é uma vogal");
        }
        else {
            System.out.print("Não é uma vogal");

        }



    }
}
