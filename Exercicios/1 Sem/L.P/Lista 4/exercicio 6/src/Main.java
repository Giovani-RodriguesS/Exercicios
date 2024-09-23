public class Main {
    public static void main(String[] args) {
//vars
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aux;
//  inversão
        for (int i=0;i<5;i++){
            aux = v1[i];
            v1[i] = v1[v1.length-(i+1)];
            v1[v1.length -(i+1)] = aux;
        }
//  impressão
        for (int j=0;j<10;j++){
            System.out.println(v1[j]);
        }
    }
}