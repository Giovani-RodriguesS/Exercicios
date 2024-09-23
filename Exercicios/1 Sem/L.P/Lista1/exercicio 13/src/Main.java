import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        double raio, area;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o raio de um círculo para calcular a sua área (pi = 3,14): ");
        raio = in.nextDouble();
        area = 3.14 * Math.pow(raio, 2);
        System.out.println("A area do círculo é: " + area);
    }
}