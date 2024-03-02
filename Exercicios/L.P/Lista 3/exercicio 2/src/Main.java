import java.util.*;
public class Main {
    public static void main(String[] args) {

        int num1,maior,menor;
        Scanner in = new Scanner(System.in);
//  Entradas
        System.out.println("Digite cinco números inteiros seguidamente: ");
        maior = 0;
        menor = 0;
//  Condicional
        for (int i=0;i<5;i++) {
            num1 = in.nextInt();
            if (num1 < menor)
                menor = num1;
            if (num1 > maior)
                maior = num1;
        }
        System.out.println("Maior numero digitado: " + maior + " Menor: "+ menor);
    }
}