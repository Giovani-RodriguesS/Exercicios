#include <stdio.h>
#include <stdlib.h>

int main()
{
    float medida,area;

    printf("Insira o valor do comprimento de um cubo: \n");
    scanf("%f", &medida);
    area = 6*pow(medida,2);
    printf("Area total do cubo: %.1f \n",area);

    system("pause");
return 0;
}
