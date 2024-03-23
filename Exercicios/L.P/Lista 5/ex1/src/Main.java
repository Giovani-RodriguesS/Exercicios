import java.util.Scanner;

public class Main {

    public static int somar (int n) {
        if(n==1)
            return 1;
        return n+somar(n-1);
    }
    public static void main(String[] args) {

        int num;
        boolean erro = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para sabermos suas somas: ");
        while(erro) {
            num = in.nextInt();
            if (num > 0) {
                System.out.println("Resultado: "+somar(num));
                erro = false;
            }
            else
                System.out.println("Digite um numero positivo e acima de 0");
        }
        in.close();
    }

}