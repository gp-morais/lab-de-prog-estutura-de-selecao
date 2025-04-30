import java.util.Scanner;

public class aula8ex1e1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letra;

        System.out.print("Digite uma letra de a-z: ");
        letra = teclado.next();
        letra = letra.toLowerCase();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.print("É uma vogal"); break;
            default:
                System.out.print("Não é uma vogal");




       }



    }
}
