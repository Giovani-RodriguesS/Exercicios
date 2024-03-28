#include <stdio.h>
#include <stdlib.h>

int main()
{   // vars
    float valores [4], media=0;

    printf("Insira 4 valores para media: \n");
    for(int i=0; i<4;i++){
        printf("Valor %d \n",i+1);
        scanf("%f", &valores[i] );
        media += valores[i];
    }
    media /= 4;
    printf("A media e %.1f \n", media);
        system("pause"); // pausa para Windows
return 0;
}
