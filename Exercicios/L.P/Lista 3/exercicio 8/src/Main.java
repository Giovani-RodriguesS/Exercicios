import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num;
        boolean estadoNum = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = in.nextInt();
        for(int i = 2; i<num;i++)
            if(num % i == 0) {
                System.out.println("Este número não é primo");
                estadoNum = false;
                break;
            }
        if(estadoNum == true)
            System.out.println("Seu número é primo");
    }
}
// primo: divisivel por um e por ele mesmo
