public class Main {
    public static void main(String[] args) {

        int [] produtos = new int[3];
        int[][] matriz ={{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int produto = 1;

//      regra de Sarrus
        int [][] matrizSarrus = {{1,2,3,1,2},
                                 {4,5,6,4,5},
                                 {7,8,9,7,8}};

//      diagonal principal
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++)
                produto *= matrizSarrus[i + j][i + j];
            produtos[i-1] = produto;
        }
        for(int show : produtos)
            System.out.println(show);
    }
}