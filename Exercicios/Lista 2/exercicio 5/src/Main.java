import java.util.*;
public class Main {
    public static void main(String[] args) {

        double nota1, nota2, media;
        char conceitoNota;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira sua primeira nota:  ");
        nota1 = in.nextDouble();
        System.out.println("Insira sua segunda nota:  ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) /2;

        if(media >= 8.5)
            conceitoNota = 'A';
        else if(media >= 7 && media < 8.5)
            conceitoNota = 'B';
            else if(media >= 5 && media < 7)
                conceitoNota = 'C';
                else
                    conceitoNota = 'D';

        System.out.println("Seu conceito de nota é '" + conceitoNota + "'" );

    }
}
