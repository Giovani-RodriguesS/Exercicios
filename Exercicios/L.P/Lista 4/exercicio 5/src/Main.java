import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[10];

//      copia invertida
        int n = v1.length -1;
        int it = 0;
        for (int i=n; i>=0; i--) {
            v2[i] = v1[it];
            it++;
        }
        for(int j=0;j<10;j++) {
            System.out.println("V1: "+v1[j]+" V2: "+v2[j]);
        }

    }
}