#include <stdio.h>
#include <stdlib.h>

float calcVolumeCilindro(float raio, float altura)
{
    return 3.14 * raio * altura;
}

int main()
{
    float raio, altura;

    printf("Digite o raio\n");
    scanf("%f", &raio);

    printf("Digite a altura\n");
    scanf("%f", &altura);
    float resultado = calcVolumeCilindro(raio, altura);
    printf("Volume: %.2f\n", resultado);
    return 0;
}
