#include <stdio.h>
#include <stdlib.h>

int verificarBissexto(int ano) {
if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
    return 1;
else
    return 0;
}

int main()
{
    int ano;

    printf("Ano: \n");
    scanf("%d", &ano);
    if(verificarBissexto(ano))
        printf("Eh bissexto");
    else
        printf("Nao eh bissexto");
    return 0;
}
