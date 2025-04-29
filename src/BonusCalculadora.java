import java.util.Scanner;

public class BonusCalculadora {
    public static void main(String[] args) {
//varivaeis
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2;
        double resultado;
        String opcao;

//escolha do operador
        System.out.println("(A)dição");
        System.out.println("(S)ubtração");
        System.out.println("(M)utiplicação");
        System.out.println("(D)ivisão");

        opcao = teclado.next();
        opcao = opcao.toLowerCase();


// execução logica
        if (opcao.equals("a")|| opcao.equals("s") || opcao.equals("m") || opcao.equals("d") ){
            System.out.println("informe o primeiro valor: ");
            valor1 = teclado.nextInt();
            System.out.println("informe o segundo valor: ");
            valor2 = teclado.nextInt();
            if(opcao.equals("d") && valor2 == 0) {
                System.out.print("Não existe divisão por zero");
            }
            else {
                if (opcao.equals("a")) {
                resultado = valor1 + valor2;
            }
                else if(opcao.equals("s")){
                    resultado = valor1 - valor2;
                }
                else if(opcao.equals("m")){
                    resultado = valor1 * valor2;
                }
                else {
                    resultado = (double)valor1/valor2;
                }

            System.out.print("o resultado é igual a "+resultado);
            } }
        else{System.out.print("Opção invalida");}


    }
}
