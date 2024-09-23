import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        n1 = in.nextInt();
        int result = n1 * n1;
        System.out.println("Seu quadrado é "+ result);

    }
}