import java.util.Scanner;

public class Main {

    static boolean palindromo (String p, int n){
            if(Character.isLetterOrDigit(p.charAt(n))) // Verifica se é um digito/letra
                if (Character.toLowerCase(p.charAt(n)) != Character.toLowerCase(p.charAt(p.length()-n-1))) // verifica se os chars são diferentes
                    return false;
        if(n!= (p.length())/2)
            return palindromo(p,n+1);
        else
            return true;
    }

    public static void main(String[] args) {

        String palavra;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        palavra = in.next();
        if (palindromo(palavra, 0))
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");
        in.close();
    }
}