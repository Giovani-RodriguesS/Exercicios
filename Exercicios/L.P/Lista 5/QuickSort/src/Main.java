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

        int [] vetor = {52,343,543,1,43,62,78,23,78,90};

        quickSort(vetor,0,10);
        for (int number:vetor)
            System.out.print(number+", ");
    }
}


