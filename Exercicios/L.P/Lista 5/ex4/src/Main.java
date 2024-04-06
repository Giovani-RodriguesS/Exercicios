import java.util.Scanner;

public class Main {

    static boolean palindromo (String p, int n){
        for (int j=n;j<(p.length()-1)/2;j++){
            if(Character.isLetterOrDigit(p.charAt(j))) // Verifica se é um digito/letra
                if (Character.toLowerCase(p.charAt(j)) != Character.toLowerCase(p.charAt(p.length()-j-1))) // verifica se os chars são diferentes
                    return false;
        }
        if(n!= (p.length()-1)/2)
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