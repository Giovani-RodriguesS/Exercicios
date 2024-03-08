import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] numbers = {14,12,23,84,65,46,72,18,9,10};
        int n;
        do {
            System.out.println("Insira um valor: ");
            n = in.nextInt();
            if(n<1 || n>10)
                System.out.println("Valor não encontrado");
        }while (n<1 || n>10);
        System.out.println(numbers[n-1]);

    }
}