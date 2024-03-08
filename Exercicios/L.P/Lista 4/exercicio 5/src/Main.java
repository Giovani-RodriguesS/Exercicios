import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[10];

//      copia invertida
        int n = v1.length;
        for (int i=n-1; i>0; i--) {
            n=0;
            v2[i] = v1[i++];
        }
        for(int j=0;j<10;j++) {
            System.out.println(v1[j]);
            System.out.println(v2[j]);
        }

    }
}