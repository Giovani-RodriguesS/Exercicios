public class Main {
    public static void main(String[] args) {

//      matrizes, array e vars
        int [] produtos = new int[6];
        int[][] matriz = {{4,5,-3},{2,1,0},{3,-1,1}};
        int[][] matrizSarrus = new int[matriz.length][matriz[0].length+2];
        int produto;
        int determinante=0;

//      Formação Matriz Sarrus
        for (int i=0;i<matriz.length;i++)
            for (int j = 0; j < matriz.length; j++) {
                matrizSarrus[i][j] = matriz[i][j];
            }
//      Aplicação regra de Sarrus
        for (int i=0;i<matriz.length;i++)
            for (int j = 0; j < 2; j++) {
                matrizSarrus[i][j+3] = matriz[i][j];
            }
        for (int [] numbers : matrizSarrus) {
            for (int num : numbers)
                System.out.print(num+", ");
            System.out.println(" ");
        }

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
        for(int i=0;i<produtos.length;i++) {
            determinante += produtos[i];
        }
        System.out.println("Determinante: "+determinante);
    }
}