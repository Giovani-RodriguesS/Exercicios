#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    int a = 2, b = -5, c =3;
    double x1, x2, resultado;

    x1 = (-b + sqrt(b*b - 4 * a * c)) / (2*a);
    x2 = (-b - sqrt(b*b - 4 * a * c)) / (2*a);
    printf("X1: %.2f \nX2: %.2f", x1,x2);
    return 0;
}
