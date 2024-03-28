#include <stdio.h>
#include <stdlib.h>

int main()
{
    int escala;
    float temp;

    printf("Conversor de temperatura\nDe qual escala voce deseja converter?\n");
    printf("Celsius (1) - Fahrenheit (2)\n");
    scanf("%d", &escala);
    escolha(escala);

    if (escala == 1 || escala == 2)
    {
        printf("Qual temperatura ?\n");
        scanf("%f", &temp);
        printf("Temperatura convertida: %f", calculo(temp, escala));
    }
    return 0;
}

void escolha(int escala)
{
    if (escala == 1)
        printf("Escala escolhida: Celsius\n");
    if (escala == 2)
        printf("Escala escolhida: Fahrenheit\n");
    else
        printf("Opcao inexistente\n");
}

float calculo(float temp, int escala)
{
    if (escala == 1)
        return temp * 1.8 + 32;
    else
        return (temp - 32) / 1.8;
}
