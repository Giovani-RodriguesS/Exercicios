#include <stdio.h>
#include <stdlib.h>

float calcCirc(float raio){
    return 2* 3.14 * raio;
}

int main()
{
    float raio;
    printf("Insira o raio do circulo\n");
    scanf("%f", &raio);
    printf("Circunferencia do circulo: %.2f", calcCirc(raio));
    return 0;
}
