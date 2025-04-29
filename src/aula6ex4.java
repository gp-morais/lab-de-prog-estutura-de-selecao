import java.text.DecimalFormat;
import java.util.Scanner;

public class aula6ex4 {
    public static void main(String[] args) {

        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner teclado = new Scanner(System.in);

    //variaveis
        //*** x>=5 ou x<=-5
        double x, y;

     //entrada de dados

        System.out.print("Valor de x: ");
        x = teclado.nextDouble();
     //

        if (x>5||x<-5){
            y = 8/(Math.sqrt(Math.pow(x,2)-25));
            System.out.print("O valor de y é: "+ dc.format(y));

                                                            }
            else {
            System.out.print("Digite um valor valido.");
        }



    }
}
