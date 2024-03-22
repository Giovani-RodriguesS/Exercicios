import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String palindromo;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma string: ");
        palindromo = in.next();
        

        in.close();
    }
}
//Escreva uma função em Java para verificar se uma String é um palíndromo.
//A Stringdeve ser digitada pelo usuário.
//Um palíndromo é uma palavra, frase ou sequência quese lê da mesma forma de trás para frente.
//Exemplos: “ovo”, “tenet”, “a base do tetodesaba”.