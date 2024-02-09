import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double milhas, kilometro;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a distância em Km para converter em milhas: ");
        kilometro = in.nextDouble();
        milhas = kilometro / 1.609;
        System.out.println("Distância em milhas: " + milhas);

    }
}
//