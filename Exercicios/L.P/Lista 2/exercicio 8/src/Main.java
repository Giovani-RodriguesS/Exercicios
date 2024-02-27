import java.util.*;
public class Main {
    public static void main(String[] args) {
        int num,resto;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero e direi se seu numero é ímpar ou par: ");
        num = in.nextInt();
        in.close();

        resto = num % 2;
        if(resto == 0)
            System.out.println(num + " é par");
        else
            System.out.println(num + " é ímpar");
    }
}