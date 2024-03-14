public class Main {
    public static void main(String[] args) {

//      matrizes, array e vars
        int [] produtos = new int[6];
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrizSarrus = new int[matriz.length][matriz[0].length+2];
        int produto;
        int determinante=0;

//      regra de Sarrus
        int k=0;
        for (int i=0;i<matriz.length;i++)
            for (int j = 0; j < matrizSarrus[0].length; j++) {
                if (j==3)
                    k=1;
                if (j==3)
                    k=2;
                matrizSarrus[i][j] = matriz[i -k][j- k];
            }
        //{{1,2,9,1,2},
        //{4,5,8,4,5},
        //{7,8,12,7,8}};

//      diagonal principal
        for (int i=0;i<3;i++) {
            produto=1;
            for (int j = 0; j < 3; j++)
                produto *= matrizSarrus[j][i+j];
            produtos[i] = produto;
        }
//      diagonal secundária
        for (int i=0;i<3;i++) {
            produto=-1;
            for (int j=0;j<3; j++)
                produto *= matrizSarrus[2-j][j+i];
            produtos[i+3] = produto;
        }
        //Determinante
        for(int i=0;i<produtos.length;i++)
            determinante += produtos[i];

        System.out.println("Determinante: "+determinante);
    }
}