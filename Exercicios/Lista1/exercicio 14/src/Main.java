import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner in = new Scanner(System.in);
        System.out.println("Insira os valores da base e " +
                "da altura, respectivamente, de um triângulo retângulo: ");
        base = in.nextDouble();
        System.out.println("Agora a altura: ");
        altura = in.nextDouble();
        area = base * altura / 2;
        System.out.println("A area do triangulo é: " + area );
    }
}