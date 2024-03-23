import java.util.Scanner;

public class Main {

    public static int fatorial (int n){
        if(n==2)
            return 2;
        return n* fatorial(n-1);
    }
    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Cálculo de fatorial");
        System.out.println("Digite um número válido: ");
//  verificação de valor
        do {
            num = in.nextInt();
            if (num < 1)
                System.out.println("Digite um valor válido!");
        }while (num < 1);
//  saida
            System.out.println("Resultado de "+num+"!: "+fatorial(num));
        in.close();
    }
}
//Implemente uma função para calcular o fatorial de um número inteiro N digitado pelousuário