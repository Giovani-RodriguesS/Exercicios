import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num,fat;
        Scanner in = new Scanner(System.in);
//  entrada
        do{
            System.out.println("Insira um numero para seu fatorial ser impresso: ");
            fat = in.nextInt();
            } while(fat < 0);
        num = fat;
//  loop
        if(fat == 0){
            System.out.println("0! = 1");
        }else {
            for (int i = fat; i > 1; i--) {
                fat *= (i - 1);
            }
//  saida
            System.out.println(num + "!: " + fat);
        }
    }
}