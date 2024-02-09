import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1,n2, media;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        n1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = in.nextDouble();
        media = ((n1 * 1) + (n2 * 2)) / (1+2) ;
        System.out.println("Sua média ponderada é: " + media);

    }
}