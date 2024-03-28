#include <stdio.h>
#include <stdlib.h>

int main()
{   int num;

    printf("Digite um numero: ");
    scanf("%d", &num);
    if(num < 0)
        printf("Valor invalido");
    if(num <= 1)
        return 1;
    else
        printf("Fatorial: %d",fatorial(num));
    return 0;
}
int fatorial(int num) {
    if(num == 1)
        return 1;
    return num*fatorial(num-1);
}
//Crie um programa em C para calcular o fatorial de um número fornecido pelo usuário
//usando uma função recursiva
