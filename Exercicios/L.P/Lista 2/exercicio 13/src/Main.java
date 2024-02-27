import java.util.*;
public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
        int escolha;
        double area, perimetro, base, altura, raio, hipotenusa;
        Scanner in = new Scanner(System.in);
//  Entrada
        System.out.println("Calculadora geométrica");
        System.out.println("-------MENU-------");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.println("Escolha uma opção: ");
        escolha = in.nextInt();
        if(escolha == 1)
            System.out.println("Opção escolhida: Círculo");
        else if (escolha == 2)
            System.out.println("Opção escolhida: Triângulo Retângulo");
        else if (escolha == 3)
            System.out.println("Opção escolhida: Retângulo");

//  Condicional
        switch (escolha) {
            case 1 : // circulo
//          Entradas
                System.out.println("Insira o valor do raio");
                raio = in.nextDouble();
//          Processamento
                area =  3.14 * (raio*raio);
                perimetro = 2*3.14*raio;
//          Saídas
                System.out.println("Área: " + area);
                System.out.println("Circunferência: " + perimetro);
                break;
            case 2 ://triangulo retangulo
//          Entradas
                System.out.println("Insira o valor da Base: ");
                base = in.nextDouble();
                System.out.println("Insira o valor da Altura: ");
                altura = in.nextDouble();
//          Processamento
                hipotenusa = Math.sqrt(altura*altura + base*base);
                area = altura*base/2;
                perimetro = hipotenusa + altura + base;
//          Saídas
                System.out.println("Área: " + area);
                System.out.println("Perímetro: " + perimetro);
                break;
            case 3 : // retangulo
//          Entradas
                System.out.println("Insira o valor da Base: ");
                base = in.nextDouble();
                System.out.println("Insira o valor da Altura: ");
                altura = in.nextDouble();
//          Processamento
                area = base*altura;
                perimetro = base*2 + altura*2;
//          Saídas
                System.out.println("Área: " + area);
                System.out.println("Perímetro: " + perimetro);
                break;
            default:
                System.out.println("Opção inexistente");
                break;
        }
=======

        Scanner in = new Scanner(System.in);
        System.out.println(" ");
>>>>>>> 965fb98bc50235a50a0a7bb3a22234b0e0485396
    }
}
