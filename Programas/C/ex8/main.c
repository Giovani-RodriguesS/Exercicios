#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char numChar[20];
    int numInt[20];
    int soma=0;

    printf("Digite um numero inteiro: \n");
    scanf("%19s", &numChar);

    for(int i=0;i<strlen(numChar);i++)
    {
        numInt[i] = (numChar[i] - '0');
        soma += numInt[i];
    }
    printf("Aqui esta  a soma dos digitos inserido:\n%d", soma);
    return 0;
}
//Implemente um programa em C para calcular a soma dos dígitos de um número inteiro
//fornecido pelo usuário
