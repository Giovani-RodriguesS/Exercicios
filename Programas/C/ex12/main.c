#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n,i;
    int * ptr;

    printf("Digite quantos elemetos tera o array: \n");
    scanf("%d", &n);
    int v[n];
    for(i=0;i<n;i++)
        scanf("%d", &x[i]);


    printf("Numero digitado: %d\n",x);

    ptr = &x; // recebe o endereco de x
    alterar(&ptr); // passado o end. de ptr

    printf("Numero digitado depois da Funcao Alterar: %d\n",x);




}
//funçao void que troca o valor de uma variavel
void alterar(int **pptr) // ponteiro declarado
{
    **pptr = **pptr + 10; //valor do ptr é acessado(end. x) e o conteudo desse valor tbm. Logo é somado esse conteudo + 10
    return;
}
