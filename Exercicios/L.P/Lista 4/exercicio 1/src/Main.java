import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int [] numbers = {14,12,23,84,65,46,72,18,9,10};

        Arrays.sort(numbers); // ordena
        int n = numbers.length;
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[n-i-1]); //indice decrescente

        }
    }
}