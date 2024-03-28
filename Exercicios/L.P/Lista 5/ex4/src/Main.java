import java.util.Scanner;

public class Main {
    static boolean palindromo (String p){
        for (int j=0;j<p.length()-1;j++){
            if(Character.isLetterOrDigit(p.charAt(j))) // Verifica se é um digito/letra
                if (Character.toLowerCase(p.charAt(j)) != Character.toLowerCase(p.charAt(p.length()-j-1))) // verifica se os chars são diferentes
                    return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String palavra;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        palavra = in.next();
        if (palindromo(palavra))
            System.out.println("É um palíndromo");
        else
            System.out.println("Não é um palíndromo");
        in.close();
    }
}