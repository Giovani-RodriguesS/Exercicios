#include <stdio.h>
#include <stdlib.h>

int main () {

    char palavra[] = "aluno";
    char texto[] ="alunos, aluno, alunes, alunas, after" ;
    int nP = sizeof(palavra)/sizeof(palavra[0]);
    int nT = sizeof(texto)/sizeof(texto[0]);
    int i,j;
    int count = 0;

    for(i=0;i<nT;i++) {//verifica até o fim do texto
        for(j=0;j<nP;j++) //comparar se os carecteres equivalem
            if(palavra[j+i] != texto[j+i])
                break;
    }
    printf("%d", count);
}

//Escreva um programa em C para contar o número de ocorrências de uma determinada
//palavra em uma string fornecida pelo usuário.
