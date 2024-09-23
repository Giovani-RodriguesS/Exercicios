import java.util.*;

public class Main {
    public static void main(String[] args) {

        int num1,num2;
        Scanner in = new Scanner(System.in);
//Entradas
        System.out.println("Insira dois numeros inteiros seguidamente: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.println("intervalo de "+num1+" a "+num2);
//Condicional e While
        if (num1 < num2)
            while (num1 < num2-1) {
                num1 += 1;
                System.out.println(num1);
            }
        if (num1 > num2)
            while (num1 > num2+1) {
                num1 -= 1;
                System.out.println(num1);
            }
    }
}