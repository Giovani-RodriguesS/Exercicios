import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milhas, kilometro;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a distância em Milhas para converter em Km: ");
        milhas = in.nextDouble();
        kilometro = milhas * 1.609;
        System.out.println("Distância em Km: " + kilometro);

    }
}
//