public class Main {
    public static void main(String[] args) {

        int[][] m = {{10,15,20,35,40},
                    {50,60,70,80,90},
                    {12,23,45,65,76},
                    {98,76,54,43,23},
                    {360,200,40,100,120}};

        int maiorSomaLinha = 0;
        int maiorSomaColuna = 0;
        int somaLinha;
        int somaColuna;
//  soma de linhas e colunas
        for (int i=0;i<m.length;i++){
            somaLinha = 0;
            somaColuna = 0;
            for (int j=0;j<m[0].length;j++){
                somaLinha += m[i][j];
                somaColuna += m[j][i];
            }
            if (i == 0){
                maiorSomaLinha = somaLinha;
                maiorSomaColuna = somaColuna;
            }
            if (somaLinha > maiorSomaLinha)
                maiorSomaLinha = somaLinha;
            if (somaColuna > maiorSomaColuna)
                maiorSomaColuna = somaColuna;
        }
        System.out.println("Maior soma de coluna: "+maiorSomaColuna+" - Maior soma de linha "+maiorSomaLinha);
    }
}