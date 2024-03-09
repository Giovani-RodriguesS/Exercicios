public class Main {
    public static void main(String[] args) {

       // int [][] det = new int[3][5];
        int [][] diagonal = new int[3][5];
        int[][] m = {{1,2,3},
                     {4,5,6},
                     {7,8,9}};

        for (int i=0;i<m.length;i++){
            diagonal[] =  m[i][m.length-(1+i)];
        }
    }
}