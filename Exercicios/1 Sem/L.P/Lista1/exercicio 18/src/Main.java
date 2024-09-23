import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        double b, resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Solução de equação do 1 grau (ax + b = 0)\n");
        System.out.println("Insira o valor do coeficiente A: ");
        a = in.nextInt();
        System.out.println("Agora, insira o valor do coeficiente B: ");
        b = in.nextDouble();
        resultado = -(b/a);
        System.out.println("Solução da equação: X = " + resultado);


    }
}
