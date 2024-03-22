import java.util.Scanner;

public class Main {

    public static int fatorial (int n){
        int mult=1;
        for (int i=2;i<=n;i++){
            mult *= i;
        }
        return mult;
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