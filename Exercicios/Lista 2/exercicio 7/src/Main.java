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
        in.close();
//  Processamento
        x1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        x2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
//Saída
    if(Double.isNaN(x1))
        System.out.println("Não são raízes do conjunto dos reais: ");
    else {
        System.out.println("Solução da equação: ");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    }
}