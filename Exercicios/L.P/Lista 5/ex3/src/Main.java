import java.util.Scanner;

public class Main {

    public static int exponencial (int num1,int num2) {
        int m=1;
        for (int i=0;i<num2;i++)
                m *= num1;
        return m;
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
//Crie uma função para calcular a potência de um número inteiro X elevado a uma potênciainteira Y.
//Os valores de X e Y serãofornecidos pelo usuário. Y deve ser maior ou igual azero.
//Proibido utilizar Math.pow(x,y)