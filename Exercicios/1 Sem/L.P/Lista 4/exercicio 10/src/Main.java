public class Main {
    public static void main(String[] args) {

//Matrizes
        int [] [] m1 = {{2,4},{5,7},{8,10}};
        int [] [] m2 = {{3,6},{4,8}};
        int [] [] mp = new int [3] [2];

        //Produto
        for (int i=0;i<mp.length;i++){
            for (int j=0;j<mp[0].length;j++){
                mp[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j];
            }
        }
//      Imprimir
        System.out.println("Matriz produto");
        for (int [] numbers : mp) {
            for (int num : numbers)
                System.out.print(num +", ");
            System.out.println(" ");
        }
    }
}