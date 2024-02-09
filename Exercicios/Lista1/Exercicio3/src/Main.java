import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        num1 = in.nextDouble();
        System.out.println("Sua quinta parte é: " + num1/5 );
    }
}