#include <stdio.h>
#include <stdlib.h>

int main()
{   //vars
    int nota[4];

    printf("Digite quatro valores: \n");
    for(int i=0;i<4;i++) {
        printf("Insira o numero: ");
        scanf("%d%d%d%d",nota[i]);
        system("pause");
    }
    return 0;
}
