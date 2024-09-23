import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];

        //Criação da array
        for (int i=0;i<10;i++){
            if (i==0)
                System.out.println("Insira um número");
            else
                System.out.println("Insira outro número");
            arr[i] = in.nextInt();
            }
        //Escopo variaveis
        int max = arr[0];
        int min = arr[0];
        int indMax=0;
        int indMin=0;

        //Verificação de max
        for (int j=1;j<arr.length;j++){
           if (max < arr[j]) {
               max = arr[j];
               indMax = j;
                }
        //Verificação de min
           if (min > arr[j]){
               min = arr[j];
               indMin = j;
           }
        }
        //Saidas
        System.out.println("Maior valor: "+ max+" indice "+indMax);
        System.out.println("Menor valor: "+ min+" indice "+indMin);
        in.close();
    }
}