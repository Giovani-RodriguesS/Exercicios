#include <stdio.h>
#include <stdlib.h>

int main()
{   int num;

    printf("Digite um numero: ");
    scanf("%d", &num);
    if(num < 1)
        printf("Valor invalido");
    else
        printf("%d",fatorial(num));
    return 0;
}
int fatorial(int num) {
    if(num == 1)
        return 1;
    return num*fatorial(num-1);
}
//Crie um programa em C para calcular o fatorial de um número fornecido pelo usuário
//usando uma função recursiva
