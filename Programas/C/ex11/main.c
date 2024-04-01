#include <stdio.h>
#include <stdlib.h>

int main()
{   FILE *arquivo;
    char nomeArquivo[100];
    char palavra[100];
    int totalPalavras = 0;

    printf("digite o nome do arquivo\n");
    scanf("%s", nomeArquivo);
    arquivo = fonen(nomeArquivo, "f");

    if (arquivo == NULL)
    {
        printf("erro ao abrir o arquivo\n");
        return 1;
    }
    while(fscanf(arquivo, "%s", palavra) != EOF) {
        totalPalavras++;
    }
    printf("%d", totalPalavras);
    fclose(arquivo);
    return 0;
}
