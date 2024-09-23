import java.util.*;
public class Main {
    public static void main(String[] args) {

        int diaSemana;
        Scanner in = new Scanner(System.in);
//  Entrada
        System.out.println("Digite um numero inteiro correspondente a um dia da semana: ");
        diaSemana = in.nextInt();
//  Condição
        switch (diaSemana) {
            case 1:
                System.out.println("Digitado: " + diaSemana + " - Domingo" );
                break;
            case 2:
                System.out.println("Digitado: " + diaSemana + " - Segunda-Feira" );
                break;
            case 3:
                System.out.println("Digitado: " + diaSemana + " - Terça-Feira" );
                break;
            case 4:
                System.out.println("Digitado: " + diaSemana + " - Quarta-Feira" );
                break;
            case 5:
                System.out.println("Digitado: " + diaSemana + " - Quinta-Feira" );
                break;
            case 6:
                System.out.println("Digitado: " + diaSemana + " - Sexta-Feira" );
                break;
            case 7:
                System.out.println("Digitado: " + diaSemana + " - Sábado" );
                break;
            default:
                System.out.println("Número digitado fora do escopo (1-7)");
                break;
        }

    }
}