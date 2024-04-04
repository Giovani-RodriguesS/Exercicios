#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

int main()
{
    printf("_____Gestao de Usuarios_____\n\n");
    telaInicial();
    return 0;
}

//  tela inicial
void telaInicial()
{
    int opcao;
    printf("1. Cadastrar\n2. Buscar\n3. Remover\n4. Editar\n0. Sair\n\n");
//  validação de opção
    do
    {
        scanf("%d", &opcao);
        if(opcao > 4 || opcao < 0)
            printf("Invalido!\n");
    }while(opcao > 4 || opcao < 0);

//  redirecionamento para tela escolhida
    switch(opcao)
    {
    case 0:
        printf("Voce escolheu sair\n");
        return 0;
    case 1:
        cadastro();
        break;
    case 2:
        buscar();
        break;
    case 3:
        //remover();
        break;
    case 4:
        //editar();
        break;
    }
}
//função cadastro
int cadastro (){
    char cadastro[5][100];

    printf("Digite seu Username:"); //Recebe Username
    scanf("%s", &cadastro[0]);
        for(int i = 0; i < 100; i++ ){
        cadastro [0][i] = toupper(cadastro[0][i]);
        }

    // Conferir se dentro do arquivo possui um Username Igual

    printf("Digite seu Nome:"); //Recebe Nome
    scanf("%s", &cadastro[1]);

    printf("Digite sua Senha:"); //Recebe Senha
    scanf("%s", &cadastro[2]);

        for(int i = 0; i < 5; i++){
        printf("%s, ", cadastro[i]);
        }
    // Pegar Data e Hora atual.
}

// função buscar
void buscar()
{
      printf("\n1. Buscar por Data\n2. Buscar por Nome\n0. Voltar \n\n");

    //  validação de opção
    int opcao;
    do{
        scanf("%d", &opcao);
        if(opcao > 2 || opcao < 0)
            printf("Invalido!\n");
    }while(opcao > 2 || opcao < 0);

    switch(opcao)
    {
        case 2:
            filtro(); // buscar nome
            break;
        case 1:
            filtro(); // buscar data
            break;
        default:
            telaInicial();
    }
}

void filtro() // o argumento e a opcao de busca(nome ou id)
{
    printf("\nFiltrar por: \n1. Ordem crescente\n2. Ordem Decrescente\n3. Mais recentes\n4. Mais antigos \n0. Voltar \n\n");

//  Validação de entrada
    int opcao;
     do{
        scanf("%d", &opcao);
        if(opcao > 4 || opcao < 0)
            printf("Invalido!\n");
    }while(opcao > 4 || opcao < 0);

//  Redirecionamento
    switch(opcao)
    {
        case 4:
            //maisAntigo();
            break;
        case 3:
            //maisRecente();
            break;
        case 2:
            //ordemDecrescente();
            break;
        case 1:
            //ordemCrescente();
            break;
        default:
            buscar();
    }
}
void maisAntigo(int valor)
{

}
