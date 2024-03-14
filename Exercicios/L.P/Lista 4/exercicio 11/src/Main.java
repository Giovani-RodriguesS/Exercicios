import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int colunas1;
        int linhas1;
        int colunas2;
        int linhas2;

        System.out.println("Informe o tamanho da 1 matriz: ");
        System.out.println("Linhas: ");
        linhas1 = in.nextInt();
        System.out.println("Colunas: ");
        colunas1 = in.nextInt();

        System.out.println("Informe o tamanho da 2 matriz: ");
        System.out.println("Linhas: ");
        linhas2 = in.nextInt();
        System.out.println("Colunas: ");
        colunas2 = in.nextInt();

        //  Condição
        if (colunas1 != linhas2)
            System.out.println("Não é possivel realizar a matriz produto");
        else {

        //Matrizes
            int [] [] m1 = new int[linhas1][colunas1];
            int [] [] m2 = new int[linhas2][colunas2];
            int [] [] mp = new int [linhas1] [colunas2];
        //Inserção
            System.out.println("Digite os valores da primeira matriz: ");
                for (int i=0;i<m1.length;i++)
                    for (int j=0;j<m1[0].length;j++){
                        m1[i][j] = in.nextInt();
                    }
            System.out.println("Digite os valores da segunda matriz: ");
                for (int i=0;i<m1.length;i++)
                    for (int j=0;j<m1[0].length;j++){
                        m2[i][j] = in.nextInt();
                    }

        //Produto
            for (int i=0;i<mp.length;i++){
                for (int j=0;j<mp[0].length;j++){
                    mp[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j];
                }

            }
            System.out.println("Matriz produto");
            for (int [] numbers : mp) {
                for (int num : numbers)
                    System.out.print(num + ", ");
                System.out.println(" ");
            }
        }
    }
}