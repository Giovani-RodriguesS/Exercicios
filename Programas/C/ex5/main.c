#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[5] = {2,1,7,6,8};

    void insercao (int vet, int tam){
int i, j, x;
for (i=2; i<=tam; i++){
	x = vet[i];
	j=i-1;
	vet[0] = x;
	while (x < vet[j]){
        vet[j+1] = vet[j];
        j--;
    }
    vet[j+1] = x;
}

    return 0;
}
//Implemente um programa em C para ordenar uma matriz de inteiros em ordem crescente
//ou decrescente usando o algoritmo de ordenação de sua escolha (por exemplo, bubble
//sort, insertion sort, selection sort).
