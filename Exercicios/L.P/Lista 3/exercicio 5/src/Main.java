import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num,fat;
        Scanner in = new Scanner(System.in);
//  entrada
        System.out.println("Insira um numero para seu fatorial ser impresso: ");
        fat = in.nextInt();
        num = fat;
//  loop
        for (int i = fat; i > 1;i--) {
            fat *= (i-1);
        }
//  saida
        System.out.println(num+"!: "+ fat);
    }
}