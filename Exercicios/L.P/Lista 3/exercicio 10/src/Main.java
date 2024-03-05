import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,num1,num2,aux,resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Sequência Fibonacci\n");
        System.out.println("Insira até qual termo deseja imprimir");
        n = in.nextInt();
        num1 = 0;
        num2 = 1;
        aux = 0;
        for (int i = 0; i < n;i++){
            if (i<2) {
                System.out.println(aux);
                aux++
            }
            else {
                resultado = num1 + num2;
                aux = num2;
                num1 = aux;
                num2 = resultado;
                System.out.println(resultado);
            }
        }
    }
}
