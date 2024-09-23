import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int [] vetor = {10,21,30,42,53,65,78,89,99,100,110,230,345,354,445,654,789,900,1230,2300,10000};
        Scanner in = new Scanner(System.in);

        System.out.println("Busca Binária\nQual valor deseja achar ?");
        x = in.nextInt();
        x = binarySearch(x,vetor,0,vetor.length-1);
        if (x==-1)
            System.out.println("Não encontrado");
        else
            System.out.println("Valor no indice "+ x);
    }

    static int binarySearch(int chave, int [] vetor, int e, int d) {

        int meio = (e+d)/2; // Define meio do vetor

        if(vetor[meio] == chave) // se for, valor encontrado
            return meio;
        if (e>=d) // valor não achado
            return -1;
        else {
            if (chave < vetor[meio]) // avalia se chave é menor que o meio;
                return binarySearch(chave, vetor, e, meio - 1); // diminui a direita
            if (chave > vetor[meio]) // avalia se chave é maior que o meio;
                return binarySearch(chave, vetor, meio + 1, d); //diminui a esquerda

        }
        return 0;
    }
}
