import java.util.Scanner;

public class Main {

    static void quickSort(int [] vetor, int begin, int end){
        //variaveis
        int pivo, i, j, aux;
        i = begin; // inicio do array
        j = end-1; // fim do array
        pivo = vetor[(i + j)/2]; //meio do vetor

        while(i<=j) {
            while (vetor[i] < pivo) // inc. até vetor[i] igual ou maior que pivo
                i++;
            while (vetor[j] > pivo) // dec. até vetor[j] igual ou menor que pivo
                j--;
            if (i <= j) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
                i++;
                j--;
                if(i<end)
                    quickSort(vetor,i,end); // begin será i
                if (j>begin)
                    quickSort(vetor,begin,j+1); // j será end

            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite a quantidade de numeros para ordenar");
        quantidade = in.nextInt();
        int [] vetor = new int[quantidade];
        for(int i=0;i<vetor.length;i++) {
            System.out.println("Numero " + (i+1));
            vetor[i] = in.nextInt();
        }
        quickSort(vetor,0,vetor.length);
        for (int number:vetor)
            System.out.print(number+", ");
    }
}


