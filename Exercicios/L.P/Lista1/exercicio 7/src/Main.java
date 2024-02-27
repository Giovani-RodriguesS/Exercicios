import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mM, pol;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a medida em milímetro para converter em polegada: ");
        mM = in.nextDouble();
        pol = (mM / 25.4);
        System.out.println("Valor em polegada: " + pol);

    }
}