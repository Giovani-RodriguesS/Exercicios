import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kM,mS;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a KM/H para converter a MS/S");
        kM = in.nextDouble();
        mS = kM / 3.6;
        System.out.println("MS/S: " + mS);

    }
}