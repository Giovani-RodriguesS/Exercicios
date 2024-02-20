import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num1, num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira dois valores inteiros diferentes: ");
        num1 = in.nextInt();
        System.out.println("Agora o próximo: ");
        num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("O valor: " + num1 + " é maior que " + num2);
        } else if (num2 > num1) {
            System.out.println("O valor: " + num2 + " é maior que " + num1);
        } else {
            System.out.println("Ambos são iguais");
        }

    }
}