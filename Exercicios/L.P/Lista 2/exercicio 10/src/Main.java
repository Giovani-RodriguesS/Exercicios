import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner in = new Scanner(System.in);
//  Entrada
        System.out.println("Digite três numeros inteiros");
        num1 = in.nextInt();
        System.out.println("Segundo");
        num2 = in.nextInt();
        System.out.println("Último");
        num3 = in.nextInt();
//  Condição 3 1 2

        if(num1 > num2 && num2 > num3)
            System.out.println("Ordem crescente: " + num3 + ", " + num2 + " e " + num1);
        else if(num1 > num3 && num2 < num3)
            System.out.println("Ordem crescente: " + num2 + ", " + num3 + " e " + num1);

        else if(num1 < num2 && num2 < num3)
            System.out.println("Ordem crescente: " + num1 + ", " + num2 + " e " + num3);
        else if(num2 > num1 && num1 > num3)
            System.out.println("Ordem crescente: " + num3 + ", " + num1 + " e " + num2);

        else if(num2 > num3 && num3 > num1)
            System.out.println("Ordem crescente: " + num1 + ", " + num3 + " e " + num2);
        else
            System.out.println("Ordem crescente: " + num2 + ", " + num1 + " e " + num3);



    }
}