import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  Variaveis

        int resposta,continuarJogo;
        boolean continuar = true;
        Scanner in = new Scanner(System.in);

//Início do prog
        System.out.println("-----Jogo da Tabuada-----\n");
        System.out.println("Insira o valor da operação a seguir corretamente para continuar o jogo: ");
//início do looping

        while (continuar){

            for(int i=1;i<=10;i++){
                if(continuar == false)
                    break;
                for(int j=1;j<=10;j++) {
                    System.out.println(i+" X "+j+" = ?");
                    resposta = in.nextInt();
                    if (resposta != i*j){
                        continuar = false;
                        break;
                    }
                }
//continuar prog

            System.out.println("Quer continuar? Sim(1),Não(0)");
            continuarJogo = in.nextInt();

            if(continuarJogo == 1)
                continuar = true;

            else if(continuarJogo == 0) {
                System.out.println("Fim de Jogo");
                continuar = false;
                }
            }
    }
}
}