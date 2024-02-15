import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        double raio,pi ,altura , volume;
        Scanner in = new Scanner(System.in);
        pi = 3.14;

        System.out.println("Digite o valor do raio e da altura de um cone " +
                            "para calcular o volume em cm³. Obs: Pi=3,14\n");
        System.out.println("Digite o valor do raio: ");
        raio = in.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = in.nextDouble();
        volume =  (altura * Math.pow(raio, 2) * pi) / 3 ;
        System.out.println("O volume do cone é: "+ volume + "cm³");
    }
}