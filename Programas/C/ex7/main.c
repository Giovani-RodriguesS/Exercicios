#include <stdio.h>
#include <stdlib.h>

int main()
{
    char string[100];
    int lenStr, origin;

    printf("Digite uma string: \n");
    scanf("%99s", &string);

    lenStr = strlen(string);

    for(int i=0;i<lenStr/2;i++)
    {
        if(string[i] != string[lenStr -(i+1)])
        {
            origin = 0;
            break;
        }else
            {
                origin = 1;
            }
    }

    if (origin == 1)
    {
        printf("E um palindromo \n");
    }else
        {
            printf("Nao e um palindromo \n");
        }

    return 0;
}
//Escreva um programa em C para verificar se uma string fornecida pelo usuário é um
//palíndromo ou não.

