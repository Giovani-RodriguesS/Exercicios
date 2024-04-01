#include <stdio.h>
#include <math.h>

// Estrutura para representar um ponto no plano cartesiano
typedef struct {
    float x;
    float y;
} Ponto;

// Função para calcular a distância entre dois pontos
float calcularDistancia(Ponto p1, Ponto p2) {
    return sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
}

// Função para verificar se um ponto está dentro de um círculo
int pontoDentroCirculo(Ponto ponto, Ponto centro, float raio) {
    float distancia = calcularDistancia(ponto, centro);
    if (distancia <= raio) {
        return 1; // O ponto está dentro do círculo
    } else {
        return 0; // O ponto está fora do círculo
    }
}

// Função para verificar a interseção entre uma reta e um círculo
void verificarIntersecao(Ponto ponto1, Ponto ponto2, Ponto centro, float raio) {
    // Calcular a distância entre o centro do círculo e a reta
    float distancia = abs((ponto2.y - ponto1.y) * centro.x - (ponto2.x - ponto1.x) * centro.y + ponto2.x * ponto1.y - ponto2.y * ponto1.x) / calcularDistancia(ponto1, ponto2);

    // Verificar se a distância é menor ou igual ao raio do círculo
    if (distancia <= raio) {
        printf("A reta intersecta o círculo.\n");
    } else {
        printf("A reta não intersecta o círculo.\n");
    }
}

int main() {
    Ponto ponto1, ponto2, centro;
    float raio;

    printf("Digite as coordenadas do primeiro ponto da reta (x y): ");
    scanf("%f %f", &ponto1.x, &ponto1.y);

    printf("Digite as coordenadas do segundo ponto da reta (x y): ");
    scanf("%f %f", &ponto2.x, &ponto2.y);

    printf("Digite as coordenadas do centro do círculo (x y): ");
    scanf("%f %f", &centro.x, &centro.y);

    printf("Digite o raio do círculo: ");
    scanf("%f", &raio);

    verificarIntersecao(ponto1, ponto2, centro, raio);

    return 0;
}
