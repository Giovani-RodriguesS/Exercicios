import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        double real;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira um numero real positivo: ");
        real = in.nextDouble();

        if(real > 0) {
            double raiz = Math.sqrt(real);
            System.out.println("A raiz quadrada dele é: " + raiz);
        }else{
            System.out.println("Valor Inválido");

        }

    }
}