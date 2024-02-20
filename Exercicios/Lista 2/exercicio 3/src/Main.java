import java.util.*;
public class Main {
    public static void main(String[] args) {
        double nota1,nota2,media;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota (0-100): ");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2) /2;

        if(media < 50) {
            System.out.println("Reprovado! Nota insuficiente");
        } else {
            System.out.println("Aprovado! nota suficiente" );
        }
        System.out.println("Media: " + media);

    }
}