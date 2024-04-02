#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x,y,resultado;

    printf("Insira o valor da base\n");
    scanf("%d", &x);
    printf("Insira o valor do expoente\n");
    scanf("%d", &y);
    resultado = potencia(x,y);
    printf("Resultado: %d", resultado);
    return 0;
}
int potencia(int x,int y)
{
    if(y==0)
        return 0;
    if(y == 1)
        return x;
    return x* potencia(x, y-1);
}
