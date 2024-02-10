import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        double volume,altura,raio;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da altura e do raio, respectivamente, de um " +
                            "cilindro, para calcular seu volume: (considere pi (3.14) e medidas em CM ");
        altura = in.nextDouble();
        System.out.println("Agora o raio do cilindro");
        raio = in.nextDouble();
        volume = 3.14 * Math.pow(raio, 2) * altura;
        System.out.println("O volume desse cilindro é: " + volume);

    }
}