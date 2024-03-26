#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char string[50],aux;
    int lenStr;

    printf("Digite uma Strig (49 chars)\n");
    scanf("%s", &string);
    printf("Invertendo...\n");
    lenStr = strlen(string);

    for(int i=0;i<lenStr/2;i++)
    {
        aux = string[i];
        string[i] = string[lenStr - (i+1)];
        string[lenStr - (i+1)] = aux;
    }
    printf("%s", string);

    return 0;
}
//. Escreva um programa em C para inverter uma string fornecida pelo usuário
