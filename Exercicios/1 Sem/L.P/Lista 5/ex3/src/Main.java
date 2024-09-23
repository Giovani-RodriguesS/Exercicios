import java.util.Scanner;

public class Main {

    public static int exponencial (int num1,int num2) {
        if(num2==1)
            return num1;
        return num1 * exponencial(num1, num2-1);
    }

    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);

        System.out.println("Exponenciação \nDigite o valor da base (X):  ");
        x = in.nextInt();
        System.out.println("Digite o valor do expoente (Y): ");
        y = in.nextInt();

        int resultado = exponencial(x,y);
        System.out.println("Resultado: "+ resultado);
        in.close();
    }
}