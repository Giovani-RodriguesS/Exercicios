#include <stdio.h>
#include <stdlib.h>

int fibonacci (int n)
{
    if(n<= 1)
        return n;
    else
        return fibonacci(n-1) + fibonacci(n-2);

}

int main()
{
    int n, resultado;
    printf("Digite o valor de N\n");
    scanf("%d", &n);
    resultado = fibonacci(n);
    printf("resultado da sequencia: \n %d", resultado);
    return 0;
}

