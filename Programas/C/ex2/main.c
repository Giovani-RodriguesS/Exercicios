#include <stdio.h>
#include <stdlib.h>

int main()
{   //vars
    int matriz [2][3] = {{200,3,4},{4,90,6}};
    int maior;

    maior = matriz[0][0];
    for (int i=0;i<2;i++)
    {
        for (int j=0;j<3;j++)
        {
            if(maior < matriz[i][j])
                maior = matriz[i][j];
        }
    }
    printf("Maior valor da matriz e %d \n", maior);


        system("pause"); // pausa para Windows
return 0;
}
//Implemente um programa em C para encontrar o maior elemento em uma matriz.
