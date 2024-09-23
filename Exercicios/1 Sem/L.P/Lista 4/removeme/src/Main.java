import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] numeros = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println(" Insira numeros");
        for (int i=0;i<5;i++){
            numeros[i] = in.nextInt();
        }
        for (int j=0;j<5;j++){
        System.out.println("Numero: " + numeros[j]);
        }

    }
}