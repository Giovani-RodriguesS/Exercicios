import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double a,b,c, x1, x2;
        Scanner in = new Scanner(System.in);

//  Entradas
        System.out.println("Calculadora de equação do 2 grau\n");
        System.out.println("ax²+bx+c=0\n");
        System.out.println("Insira o valor de A: ");
        a = in.nextDouble();
        System.out.println("Insira o valor de B: ");
        b = in.nextDouble();
        System.out.println("Por fim, o valor de C: ");
        c = in.nextDouble();
//  Processamento
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
//Saída
        System.out.println("Solução da equação: ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

    }
}
//Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução. Equação do segundo grau: $ax^2+bx+c=0$