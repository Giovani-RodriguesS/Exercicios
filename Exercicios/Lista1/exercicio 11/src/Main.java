import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celsius, fH;
        Scanner in = new Scanner(System.in);

        System.out.println("Temperatura em celsius: ");
        celsius = in.nextDouble();
        fH = (celsius * 9/5) + 32;
        System.out.println("Temperatura em fahrenheit: " + fH);

    }
}
//