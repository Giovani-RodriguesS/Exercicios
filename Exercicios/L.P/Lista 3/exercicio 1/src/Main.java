import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num1,i;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero e sua tabuada será impressa");
        num1 = in.nextInt();
        i = 0;
        while (i<11) {
            System.out.println(num1 + " X " + i + " = " + (num1*i));
            i++;
        }
    }
}