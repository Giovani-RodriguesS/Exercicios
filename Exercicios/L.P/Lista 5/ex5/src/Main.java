public class Main {

    static void quickSort(int [] vetor, int begin, int end){
        //variaveis
        int pivo, i, j, aux;
        i = begin; // inicio do array
        j = end-1; // fim do array
        pivo = vetor[(i + j)/2];

        while(vetor[i] < pivo)
            i++;
        while(vetor[j] > pivo)
            j--;
        if(i<=j){
            aux =
        }
    }
// int [] vetor = {5, 8, 1, 2 ,7, 3, 6, 9, 4, 10};

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/*
void quicksort(int values[], int began, int end)
{
	int i, j, pivo, aux;
	i = began; inicio array
	j = end-1; fim array
	pivo = values[(began + end) / 2]; meio array
	while(i <= j)
	{
		while(values[i] < pivo && i < end) // loop acaba se values [i] for maior que pivo
		{
			i++;
		}
		while(values[j] > pivo && j > began) // loop acaba se values [j] for menor que pivo
		{
			j--;
		}
		if(i <= j) // verifica se i é menor que j e inverte a posição de values[i] com values [j]
		{
			aux = values[i];
			values[i] = values[j];
			values[j] = aux;
			i++;
			j--;
		}
	}   // continua a função até que j seja igual a began
	if(j > began)
		quicksort(values, began, j+1);
	if(i < end)  //continua a função até que j seja igual a began
		quicksort(values, i, end);
}*/