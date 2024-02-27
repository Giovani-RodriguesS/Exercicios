import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double veloFinal,veloInicial, aceleracao;
        int tempo;
        Scanner in = new Scanner(System.in);

        System.out.println("Calculadora de velocidade\n");
        System.out.println("Insira abaixo os valores de velocidade inicial, " +
                "aceleração e tempo de percurso para calcular a velocidade do corpo");
        System.out.println("Digite a velocidade inicial(em m/s): ");
        veloInicial = in.nextDouble();
        System.out.println("Insira agora a aceleração(m/s): ");
        aceleracao = in.nextDouble();
        System.out.println("Por fim, o tempo(em segundo): ");
        tempo = in.nextInt();
        veloFinal = veloInicial + aceleracao*tempo;
        System.out.println("Resultado do cálculo: "+ veloFinal +"m/s");

    }
}
