import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kM,mS;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a MS/S para converter a KM/H");
        mS = in.nextDouble();
        kM =  mS * 3.6;
        System.out.println("Km/H: " + kM);
    }
}