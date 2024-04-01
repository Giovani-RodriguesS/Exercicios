#include <stdio.h>
#include <stdlib.h>

float calcularAreaTriangulo(float b, float a)
{
    return b * a / 2;
}


int main()
{
    float b, a;
    printf("Digite a base do triangulo: ");
    scanf("%f", &b);
    printf("Digite a altura do triangulo: ");
    scanf("%f", &a);

    float area = calcularAreaTriangulo(b, a);

    printf("A area e %.2f", area);
    return 0;
}
