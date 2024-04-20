#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <string.h>

int continuar = 1;

int main()
{
    while(continuar != 0){
    printf("_____Gestao de Usuarios_____\n\n");
    telaInicial();
    return 0;
}
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
        continuar = 0;
        return 0;
    case 1:
        cadastro();
        break;
    case 2:
        buscar();
        break;
    case 3:
        remover();
        break;
    case 4:
        //editar();
        break;
    }
}

// função buscar
void buscar()
{
    printf("\n1. Buscar por ID\n2. Buscar por Nome\n0. Voltar \n\n");

    //  validação de opção
    int opcao;
    do{
        scanf("%d", &opcao);
        if(opcao > 2 || opcao < 0)
            printf("Invalido!\n");
    }while(opcao > 2 || opcao < 0);

    //redirecionamento
    switch(opcao)
    {
        case 2:
            filtro(2); // buscar nome
            break;
        case 1:
            filtro(1); // buscar id
            break;
        default:
            telaInicial();
    }
}

void filtro(int procura) // o argumento é a opcao de busca(nome ou id)
{
    if(procura == 2) // opcao de buscar por nome
        printf("\nFiltrar por: \n1. Ordem crescente\n2. Ordem Decrescente\n0. Voltar \n\n");
    else // opcao buscar por id
        printf("\nFiltrar por: \n1. Mais recentes\n2. Mais antigos\n0. Voltar \n\n");

//  Validação de entrada
    int opcao;
     do{
        scanf("%d", &opcao);
        if(opcao > 2 || opcao < 0)
            printf("Invalido!\n");
    }while(opcao > 2 || opcao < 0);

//  Redirecionamento

    // buscar nome
    if(procura == 2 && opcao == 2) // op 2
        printf("ordemD"); // ordemDecrescente();
    else if(procura == 2 && opcao == 1) // op 1
        printf("ordemC");//ordemCrescente();

    // buscar por data
    else if(procura == 1 && opcao == 2) // op 2
        printf("mais antigo");//maisAntigo();
    else if(procura == 1 && opcao == 1) // op 1
        printf("mais recente");//maisRecente();
    else //voltar
        buscar();
}

int cadastro (){

    FILE *arquivo;
    arquivo = fopen("IA.txt","a");

    char cadUsuario [20];
    char cadNome [50];
    char senha[30];

    //cadastro Nome
    do{
    printf("\nDigite seu Nome: (min 3 char)\n");
    scanf("%s", cadNome);
    }while(strlen(cadNome) < 3);
    cadNome[strlen(cadNome)] = ',';
    fputs(cadNome, arquivo);


    // fazer do while caso tenha um usuario igual

    // cadastro Username
    printf("\nDigite o nome de Usuario: (precisa ser unico)\n");
    scanf("%s", cadUsuario);
    cadUsuario[strlen(cadUsuario)] = ',';
    fputs(cadUsuario, arquivo);


    //cadastro senha
    int numeros, letras;
    do{
        numeros = 0;
        letras = 0;

    printf("\nDigite o nome de Senha: (necessario 'min 6 characteres', 'conter letras', 'conter numeros')\n");
    scanf("%s", senha);
        for(int i = 0; i < strlen(senha); i++){
            if(isdigit(senha[i]))
                numeros = 1;

            if(isalpha(senha[i]))
                letras = 1;
        }
    }while(strlen(senha) < 6 || letras == 0 || numeros == 0);
    senha[strlen(senha)] = ',';
    fputs(senha, arquivo); //Quebra de linha dentre os itens e envia senha


    // Data e hora Atual
    time_t horaAtual;
    struct tm *horaLocal;

    time(&horaAtual);
    horaLocal = localtime(&horaAtual);

    char dataHora[50];
    strftime(dataHora, sizeof(dataHora), "%Y-%m-%d %H:%M", horaLocal);

    fprintf(arquivo, "%s\n", dataHora);


    fclose(arquivo);

    // Pegar Data e Hora atual.
}
int remover() {

    printf("___Cadastrados no sistema___\n");

    FILE *arquivo, *arquivoModificado;
    char users;
    char linha[100];
    char valorBuscado[100];
    char *localString;

    arquivo = fopen("IA.txt","r");

    if(arquivo == NULL)
    {
        printf("Arquivo não encontrado\n");
        return -1;
        fclose(arquivo);
    }
    // lista os usuarios cadastrados
    while((users = fgetc(arquivo)) != EOF)
            printf("%c", users);

    // recebe valor para remover
    printf("\nQual valor voce deseja remover\n");
    scanf("%s", &valorBuscado);

    // abre o arquivo para modificar
    arquivoModificado = fopen("temp.txt","w");

    if (arquivoModificado == NULL) {
        printf("Erro ao abrir o arquivo de entrada.\n");
        return -1;
        }
    // percorre o arquivo até encontrar o valor
    while (fgets(linha, sizeof(linha), arquivo) != NULL)
    {
        localString = strstr(linha, valorBuscado);
        if (localString != NULL) // encontrada
        {
            printf("Encontrada\n");
            memmove(localString, localString + strlen(valorBuscado), strlen(localString + strlen(valorBuscado)) + 1);
        }
        // Escreverá a linha alterada no arquivo modificado
        // linhas serão colocadas no arquivoModificado
        fputs(linha, arquivoModificado);
    }
    // Fecha os arquivos
    fclose(arquivoModificado);
    fclose(arquivo);

    // Remove o arquivo original
    remove("IA.txt");

    // Renomeia o arquivo temporário para o nome do arquivo original
    rename("temp.txt", "IA.txt");
    //if (rename("temp.txt", "IA.txt") != 0) {
    //printf("Erro ao renomear o arquivo temporário");
     //   return -1;

    printf("String \"%s\" removida com sucesso do arquivo.\n", valorBuscado);
    return 0;
}
