import java.util.*;
public class Main {
    public static void main(String[] args) {

        int escolha;
        double num1,num2,resultado;
        Scanner in = new Scanner(System.in);
//  Entrada
        System.out.println(" CALCULADORA ");
        System.out.println("Digite um número: ");
        num1 = in.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = in.nextDouble();
//  Menu
        System.out.println("__________MENU__________");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println(" "); // Pula linha
        System.out.println("Valores digitados: " + num1 +" e " + num2 );
        System.out.println("Escolha uma opção:");
        escolha = in.nextInt();
//  Condicional
        switch (escolha) {
            case 1 :
                resultado = num1 + num2;
                System.out.println("Operação Escolhida: Adição - O resultado é " + resultado);
                break;
            case 2 :
                resultado = num1 - num2;
                System.out.println("Operação Escolhida: Subtração - O resultado é " + resultado);
                break;
            case 3 :
                resultado = num1 * num2;
                System.out.println("Operação Escolhida: Multiplicação - O resultado é " + resultado);
                break;
            case 4 :
                resultado = num1 / num2;
                System.out.println("Operação Escolhida: Divisão - O resultado é " + resultado);
                break;
            default:
                System.out.println("Este valor não é uma opção válida: " + escolha);
                break;
        }
// Fim do programa
    }
}