import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,proximo,anterior,resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Sequência Fibonacci\n");
        System.out.println("Insira até qual termo deseja imprimir");

        n = in.nextInt();
        proximo = 0;
        anterior = 0;

        for (int i = 1; i < n;i++){
            if(i==2) {
                proximo = 1;
                System.out.println(proximo);
            }
            resultado = proximo + anterior;
            anterior = proximo;
            proximo = resultado;
            System.out.println(resultado);
        }
    }
}