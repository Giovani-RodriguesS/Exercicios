import java.util.*;
public class Main {
    public static void main(String[] args) {

        int escolha;
        double dinheiro, troco, cafeEx, cafeLeite, capuccino, cafeL;
            capuccino = 4.50;
            cafeEx = 2.0;
            cafeLeite = 1.5;
            cafeL = 3;
        Scanner in = new Scanner(System.in);
//Entrada
        System.out.print("Insira o dinheiro: ");
        dinheiro = in.nextDouble();
//Menu
        System.out.println(" "); // Pula linha
        System.out.println("          MENU          ");
        System.out.println("Disponível: " + dinheiro + " R$");
        System.out.println("1. Café Expresso - " + cafeEx + " R$");
        System.out.println("2. Café com Leite - "+ cafeLeite+" R$");
        System.out.println("3. Capuccino - "+ capuccino+" R$");
        System.out.println("4. Café Longo - " + cafeL+ " R$");
        System.out.println(" "); // Pula linha
        System.out.println("Escolha uma opção: ");
        escolha = in.nextInt();
        System.out.println(" "); // Pula linha

//  Condicional
        switch (escolha) {
            case 1:
                if(dinheiro >= cafeEx) {
                    troco = dinheiro - cafeEx;
                    System.out.println("Bebida selecionada: Café Expresso");
                    System.out.println("Troco: " + troco + " R$");
                } else
                    System.out.println("Dinheiro insuficiente");
                break;
            case 2:
                if(dinheiro >= cafeLeite) {
                    troco = dinheiro - cafeLeite;
                    System.out.println("Bebida selecionada: Café com Leite");
                    System.out.println("Troco: " + troco + " R$");
                } else
                    System.out.println("Dinheiro insuficiente");
                break;
            case 3:
                if(dinheiro >= capuccino) {
                    troco = dinheiro - capuccino;
                    System.out.println("Bebida selecionada: Capuccino");
                    System.out.println("Troco: " + troco + " R$");
                } else
                    System.out.println("Dinheiro insuficiente");
                break;
            case 4:
                if(dinheiro >= cafeL) {
                    troco = dinheiro - cafeL;
                    System.out.println("Bebida selecionada: Café Longo");
                    System.out.println("Troco: " + troco + " R$");
                } else
                    System.out.println("Dinheiro insuficiente");
                break;
            default:
                System.out.println("Opção inexistente");
                break;
        }
    }
}