#include <stdio.h>
#include <math.h>

// Estrutura para representar um ponto no plano cartesiano
typedef struct {
    float x;
    float y;
} Ponto;

// Fun��o para calcular a dist�ncia entre dois pontos
float calcularDistancia(Ponto p1, Ponto p2) {
    return sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
}

// Fun��o para verificar se um ponto est� dentro de um c�rculo
int pontoDentroCirculo(Ponto ponto, Ponto centro, float raio) {
    float distancia = calcularDistancia(ponto, centro);
    if (distancia <= raio) {
        return 1; // O ponto est� dentro do c�rculo
    } else {
        return 0; // O ponto est� fora do c�rculo
    }
}

// Fun��o para verificar a interse��o entre uma reta e um c�rculo
void verificarIntersecao(Ponto ponto1, Ponto ponto2, Ponto centro, float raio) {
    // Calcular a dist�ncia entre o centro do c�rculo e a reta
    float distancia = abs((ponto2.y - ponto1.y) * centro.x - (ponto2.x - ponto1.x) * centro.y + ponto2.x * ponto1.y - ponto2.y * ponto1.x) / calcularDistancia(ponto1, ponto2);

    // Verificar se a dist�ncia � menor ou igual ao raio do c�rculo
    if (distancia <= raio) {
        printf("A reta intersecta o c�rculo.\n");
    } else {
        printf("A reta n�o intersecta o c�rculo.\n");
    }
}

int main() {
    Ponto ponto1, ponto2, centro;
    float raio;

    printf("Digite as coordenadas do primeiro ponto da reta (x y): ");
    scanf("%f %f", &ponto1.x, &ponto1.y);

    printf("Digite as coordenadas do segundo ponto da reta (x y): ");
    scanf("%f %f", &ponto2.x, &ponto2.y);

    printf("Digite as coordenadas do centro do c�rculo (x y): ");
    scanf("%f %f", &centro.x, &centro.y);

    printf("Digite o raio do c�rculo: ");
    scanf("%f", &raio);

    verificarIntersecao(ponto1, ponto2, centro, raio);

    return 0;
}
