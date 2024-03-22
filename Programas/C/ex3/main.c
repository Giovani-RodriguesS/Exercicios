#include <stdio.h>
#include <stdlib.h>

int main()
{   //vars
    int num, i;
    char verifica[30];

    printf("Digite um numero inteiro: \n");
    scanf("%d", &num);

    i=2;
    do {
        if(num%i == 0 || num < 2)
            {
                printf("nao e primo");
                break;
            }else
                {   if (i == num/2)
                        printf("E primo");
                }
        i++;
    }while(i <= num/2);

    return 0;
}
