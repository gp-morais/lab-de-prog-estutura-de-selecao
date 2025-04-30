import java.util.Scanner;

public class switchCaseEx {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;

        System.out.print("Digite um valor de 1 a 3: ");
        x = teclado.nextInt();
        switch(x) {
            case 1:
                System.out.print("O valor digitado foi 1"); break;
            case 2:
                System.out.print("O valor digitado foi 2"); break;
            case 3:
                System.out.print("O valor digitado foi 3"); break;

            default:
                System.out.print("O valor é diferente de 1 2 3");
        }


    }
}
