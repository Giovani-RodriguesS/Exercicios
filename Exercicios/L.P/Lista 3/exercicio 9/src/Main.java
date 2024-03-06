import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //  Variaveis

        int resposta;
        boolean continuar = true;
        boolean continuarWhile = true;
        Scanner in = new Scanner(System.in);

//Início do prog
        System.out.println("-----Jogo da Tabuada-----\n");
        System.out.println("Insira o valor da operação a seguir corretamente para continuar o jogo: ");
//início do looping
        while (continuarWhile){
            for (int i=1;i<=1 && continuar;i++){
                for (int j=1;j<=10;j++){
                    System.out.println(i+" X "+j+" = ?");
                    resposta = in.nextInt();
                    if(resposta != i*j){
                        continuar = false;
                        break;
                    }
                }
            }
//resposta errada
            if (continuar == false){
                System.out.println("Você errou! Quer continuar? Sim(1), Não(0)");
                resposta = in.nextInt();

                if(resposta == 1)
                    continuar = true;
                else {
                    System.out.println("Fim de Jogo");
                    continuarWhile = false;
                    }
//acertou tudo
            }else {
                System.out.println("Parabéns, Você acertou tudo! Quer jogar novamente? Sim(1), Não(0)");
                resposta = in.nextInt();

                if(resposta == 1)
                    continuarWhile = true;
                else {
                    System.out.println("Fim de Jogo");
                    continuarWhile = false;
                    }
            }
        }

    }
}
