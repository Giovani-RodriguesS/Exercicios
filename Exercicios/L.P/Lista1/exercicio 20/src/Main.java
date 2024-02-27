import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1,x2,produto,soma;
        Scanner in = new Scanner(System.in);
//  Entradas
        System.out.println("Descobrir uma equação do 2 grau a partir das raízes\n");
        System.out.println("Digite o valor da raiz x1: ");
        x1 = in.nextDouble();
        System.out.println("Digite o valor da raiz x2: ");
        x2 = in.nextDouble();
//  Processamento
        produto = x1 * x2;
        soma = x1 + x2;
//  Saída
        System.out.println("A equação procurada é: " +
                "x²"+ -soma +"x "+produto+"=0" );
    }
}