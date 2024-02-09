import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mM, pol;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em polegada para converter em milímetro: ");
        pol = in.nextDouble();
        mM = (pol * 25.4);
        System.out.println("Valor em milímetro: " + mM);
    }
}