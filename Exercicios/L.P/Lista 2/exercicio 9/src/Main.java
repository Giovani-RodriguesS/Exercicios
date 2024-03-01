import java.util.*;
public class Main {
    public static void main(String[] args) {

        double a,b,c;
        Scanner in = new Scanner(System.in);
//  entrada
        System.out.println("Insira os valores dos lados de um triângulo \n");
        System.out.println("Insira o valor do lado 1:  ");
        a = in.nextDouble();
        System.out.println("Insira o valor do lado 2:  ");
        b = in.nextDouble();
        System.out.println("Insira o valor do lado 3:  ");
        c = in.nextDouble();
//  condicional

    //verificação de existência
        if( a < b+c && a > (Math.abs(b-c)) &&
            b < a+c && b > Math.abs(a-c) &&
            c < a+b && c > Math.abs(a-b) ) {
    //verificação tipo de triângulo
            if (a == b && a == c)
                System.out.println("Seu triângulo é Equilátero");
            else if (a != b && b != c && a != c)
                System.out.println("Seu triângulo é Escaleno");
            else
                System.out.println("Seu triângulo é Isósceles");
        }else
            System.out.println("Medidas não formam um triângulo");
    }
}