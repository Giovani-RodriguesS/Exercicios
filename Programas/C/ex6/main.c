#include <stdio.h>
#include <stdlib.h>

int main()
{   int num, fat=1;

    printf("Digite um numero: ");
    scanf("%d", &num);
    if(num < 1)
        printf("Valor invalido");
    else
    {
        for(int i=1;i<num;i++)
        {
            fat *= i+1;
        }
        printf("%d", fat);
        }
    return 0;
}
//Crie um programa em C para calcular o fatorial de um número fornecido pelo usuário
//usando uma função recursiva
