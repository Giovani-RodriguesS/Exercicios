#include <stdio.h>
#include <stdlib.h>


float calc (float temp, int escala){
    int aux = temp;
    if(escala == 1)
    {
        printf("De C para F...\n");
        return aux * 1.8 + 32;
    }
    else
    {
        printf("De F para C...\n");
        return (aux - 32) * 5/9;
    }
}

int main()
{
    int escala;
    float temp;

    printf("Conversor de temperatura\nDe qual escala voce deseja converter?\n");
    printf("Celsius (1) - Fahrenheit (2)\n");
    scanf("%d", &escala);
    if (escala == 1 || escala == 2)
    {
        printf("Qual temperatura ?\n");
        scanf("%f", &temp);

        printf("Temperatura convertida: %.2f", calc(temp, escala));
    }
    return 0;
}
