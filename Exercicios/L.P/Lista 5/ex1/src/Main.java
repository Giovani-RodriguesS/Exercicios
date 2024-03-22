import java.util.Scanner;

public class Main {

    public static int somar (int n) {
        int resultado=1;
        for (int i=2;i<=n;i++)
            resultado += i;
        return resultado;
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